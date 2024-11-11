package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class doubleclick extends BaseClass {
    public void dclick() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[1]/span/div/div[1]")).click();
        Thread.sleep(1000);
       WebElement cc= driver.findElement(By.xpath("//*[text()=\"Buttons\"]"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",cc);
        Actions act=new Actions(driver);
        WebElement tt= driver.findElement(By.id("doubleClickBtn"));
        act.doubleClick(tt);
        WebElement jj=driver.findElement(By.xpath("//*[text()=\"Right Click Me\"]"));
        act.contextClick(jj);
        Thread.sleep(30);
       WebElement hover= driver.findElement(By.xpath("//*[text()=\"Click Me\"]"));
       Thread.sleep(30);
       act.moveToElement(hover);
    }

}
