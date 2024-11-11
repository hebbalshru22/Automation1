package org.example.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;


    // PageFactory.initElements(driver,this);
    public static void setupbrowser() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://demoqa.com/");


    }
}


