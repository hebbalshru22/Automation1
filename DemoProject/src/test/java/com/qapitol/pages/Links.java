package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Links extends BaseClass {
    public void linksdemo() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[1]/span/div/div[1]")).click();
        Thread.sleep(1000);
        WebElement nc = driver.findElement(By.id("item-5"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", nc);
        js.executeScript("window.scrollBy(0,500)", "");
       List<WebElement> ll=driver.findElements(By.xpath("//a"));
       int siz=ll.size();
       System.out.println(siz);
       for(int i=0;i<siz;i++)
       {
           WebElement ds=ll.get(i);
           String name=ds.getText();
           System.out.println(name);
       }
        driver.findElement(By.id("simpleLink")).click();
        String st=driver.getWindowHandle();
        System.out.println(st);


    }
}
