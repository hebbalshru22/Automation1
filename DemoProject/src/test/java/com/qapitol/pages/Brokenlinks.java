package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.function.DoubleToIntFunction;

public class Brokenlinks extends BaseClass {
    public void blinks() throws InterruptedException, IOException {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[1]/span/div/div[1]")).click();
        Thread.sleep(1000);
       WebElement ci= driver.findElement(By.xpath("//*[text()=\"Broken Links - Images\"]"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",ci);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for(int i=0;i<=links.size();i++)
        {
            WebElement bl=links.get(i);
            String url=bl.getAttribute("href");
            HttpURLConnection con=(HttpURLConnection) new URL(url).openConnection();
            con.connect();
          int code=  con.getResponseCode();
          if(code>=400)
          {
              System.out.println("Broken link"+url);
          }
          else
          {
              System.out.println("Not broken link"+url);
          }

        }


    }
    }




