package org.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Elements extends BaseClass {
    WebDriver driver;
    public Elements(WebDriver driver)
    {
        this.driver=driver;
    }
    public void textbox()
    {
        driver.findElement(By.xpath("(//*[@class=\"avatar mx-auto white\"])[1]")).click();

    }



}
