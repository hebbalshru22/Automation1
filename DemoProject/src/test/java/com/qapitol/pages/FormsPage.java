package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

public class FormsPage extends BaseClass
{

    public void forms(String name,String lname,String email) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[2]/span/div")).click();
        driver.findElement(By.xpath("(//*[text()=\"Practice Form\"])[1]")).click();
        Thread.sleep(30);
        driver.findElement(By.id("firstName")).sendKeys(name);
        driver.findElement(By.id("lastName")).sendKeys(lname);
        driver.findElement(By.id("userEmail")).sendKeys(email);




    }

}
