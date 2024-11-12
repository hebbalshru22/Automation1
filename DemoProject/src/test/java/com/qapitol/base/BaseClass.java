package com.qapitol.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {
    public static WebDriver driver;
    public static Properties prop;
        @BeforeMethod
    public static void initialize() throws InterruptedException, IOException {
             prop=new Properties();
            FileInputStream fs=new FileInputStream("C:\\New prog\\DemoProject\\src\\test\\java\\com\\qapitol\\util\\data.properties");
             prop.load(fs);
           String browsername=  prop.getProperty("browser");

           if(browsername.equalsIgnoreCase("chrome"))
           {
               driver=new ChromeDriver();

           }
           else {
               driver=new FirefoxDriver();

           }
            driver.get(prop.getProperty("url"));

           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

       // Thread.sleep(30);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }
 // @AfterMethod
    public static void teardown() throws InterruptedException {
        Thread.sleep(30);
       driver.close();

    }

}
