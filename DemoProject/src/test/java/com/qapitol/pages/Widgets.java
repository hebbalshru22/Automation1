package com.qapitol.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static com.qapitol.base.BaseClass.driver;

public class Widgets {
    public void datepicker() throws InterruptedException {
        WebElement wid = driver.findElement(By.xpath("//*[text()=\"Widgets\"]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", wid);
        WebElement dp = driver.findElement(By.xpath("//*[text()=\"Date Picker\"]"));
        js.executeScript("arguments[0].click()", dp);

        WebElement nn = driver.findElement(By.id("datePickerMonthYearInput"));
        js.executeScript("arguments[0].click()", nn);
        WebElement mon = null;
        Thread.sleep(30);
        Select sc = new Select( driver.findElement(By.xpath("//*[@class=\"react-datepicker__month-select\"]")));
        Thread.sleep(30);
        sc.selectByValue("1");
        Select ss=new Select(driver.findElement(By.xpath("//*[@class=\"react-datepicker__year-select\"]")));
        ss.selectByVisibleText("1900");
        driver.findElement(By.xpath("(//*[text()=\"10\"])[1]")).click();
    driver.findElement(By.id("dateAndTimePickerInput")).click();


//WebElement vv= driver.findElement(By.xpath("//*[@class=\"react-datepicker__month-read-view--selected-month\"]"));

    }
    public void AutoComplete() throws InterruptedException {
        WebElement wid = driver.findElement(By.xpath("//*[text()=\"Widgets\"]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", wid);
      WebElement li=  driver.findElement(By.xpath("(//*[text()=\"Auto Complete\"])[1]"));
        js.executeScript("arguments[0].click()", li);
        WebElement sen=driver.findElement(By.xpath("//*[@id='autoCompleteMultipleContainer']/div"));
        //js.executeScript("arguments[0].click()", sen);
        js.executeScript("arguments[0].scrollIntoView(true)",sen);

        //sen.sendKeys("blue");
       // js.executeScript("arguments[0].setAttribute('value','blue)", sen);
       // sen.sendKeys(Keys.ENTER);



    }}
