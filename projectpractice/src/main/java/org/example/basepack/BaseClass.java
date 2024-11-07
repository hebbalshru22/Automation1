package org.example.basepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class BaseClass {
public static void main(String[] args)
{
  // WebDriverManager.EdgeDriver().setup();
   WebDriver driver=new EdgeDriver();
    //driver=new EdgeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   // driver.findElement(By.xpath("//*[text()=\"Create new account\"]"));
   String st= driver.getCurrentUrl();
   System.out.println(st);
   String dd=driver.getTitle();
   System.out.println(dd);





}

}
