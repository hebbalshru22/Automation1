package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.IOException;

public class UploadandDownload extends BaseClass {
    public void uddemo() throws InterruptedException, IOException {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[1]/span/div/div[1]")).click();
        Thread.sleep(1000);

        WebElement vv = driver.findElement(By.id("item-7"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", vv);
        js.executeScript("window.scrollBy(0,500)", "");

        driver.findElement(By.id("uploadFile")).sendKeys("C:/Users/Qapitol QA/Downloads/sampleFile.jpeg");

//        FirefoxProfile prof=new FirefoxProfile();
//        prof.setPreference("browse.helperApps.neverAsk.SaveToDisk","application/zp");

    }
}
