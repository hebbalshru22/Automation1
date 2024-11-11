package org.example.basepack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Registration {
    public static void main(String[] args) throws InterruptedException {
        // WebDriverManager.EdgeDriver().setup();
        WebDriver driver=new EdgeDriver();
        //driver=new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.facebook.com/");
        //Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

    /*WebElement sd= driver.findElement(By.xpath(("(//a[@role='button'])[2]")));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",sd);*/
 WebElement hh= driver.findElement(By.name("firstname"));
 Thread.sleep(2000);
        hh.click();
        hh.sendKeys("shruti");
        WebElement gg=driver.findElement((By.name("lastname")));
        Thread.sleep(2000);
        gg.click();
        gg.sendKeys("Hebbal");
        WebElement day=driver.findElement(By.name("birthday_day"));
        Select dd=new Select(day);
        dd.selectByValue("4");
        WebElement month=driver.findElement(By.name("birthday_month"));
        month.click();
        Select dd1=new Select(month);
        Thread.sleep(2000);
        dd1.selectByVisibleText("Apr");
        WebElement year=driver.findElement(By.name("birthday_year"));
        Select dd2=new Select(year);
        dd2.selectByValue("2002");
        driver.findElement(By.xpath("//*[text()=\"Female\"]")).click();
     WebElement aa=  driver.findElement(By.name("reg_email__"));
     Thread.sleep(2000);
     aa.click();
        Thread.sleep(2000);
     aa.sendKeys("7899740744");
     WebElement jj= driver.findElement(By.id("password_step_input"));
      Thread.sleep(2000);
       jj.sendKeys("Common@12345!");
       // driver.findElement(By.name("websubmit")).click();
        driver.close();







    }}
