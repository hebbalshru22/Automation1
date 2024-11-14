package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
        WebElement ii = driver.findElement(By.id("item-6"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", ii);

        List<WebElement> links = driver.findElements(By.tagName("a"));


// Iterating each link and checking the response status
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            verifyLink(url);
        }


    }


    public static void verifyLink(String url) {
        try {
            URL link = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
            httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
            httpURLConnection.connect();


            if (httpURLConnection.getResponseCode() == 200) {
                System.out.println(url + " - " + httpURLConnection.getResponseMessage());
            } else {
                System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
            }
        } catch (Exception e) {
            System.out.println(url + " - " + "is a broken link");
        }
    }
}





