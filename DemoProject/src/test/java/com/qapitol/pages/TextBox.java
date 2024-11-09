package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TextBox extends BaseClass {

    public void textBox() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[1]/span/div/div[1]")).click();
        driver.findElement(By.id("item-0")).click();
        driver.findElement(By.id("userName")).sendKeys("shruti");
        driver.findElement(By.id("userEmail")).sendKeys("hebbalshru22@gmail.com");
        driver.findElement((By.id("currentAddress"))).sendKeys("Shrinagar");
        driver.findElement(By.id("permanentAddress")).sendKeys("Navanagar");
        WebElement ele= driver.findElement(By.xpath("//*[text()=\"Submit\"]"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",ele);


    }
}


