package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class WebTablepage extends BaseClass {
    public void webtable() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[1]/span/div/div[1]")).click();
        Thread.sleep(30);
        WebElement tt = driver.findElement(By.id("item-3"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", tt);
        Thread.sleep(20);
        WebElement rr = driver.findElement(By.id("addNewRecordButton"));
        js.executeScript("arguments[0].click();", rr);
        driver.findElement(By.id("firstName")).sendKeys("shruti");
        driver.findElement(By.id("lastName")).sendKeys("Hebbal");
    }
}
