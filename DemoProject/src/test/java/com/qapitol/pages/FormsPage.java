package com.qapitol.pages;

import com.qapitol.base.BaseClass;
import com.qapitol.util.ExcelData;
import org.openqa.selenium.By;

import java.io.IOException;

public class FormsPage extends BaseClass {

    public void forms() throws InterruptedException, IOException {
        ExcelData ed = new ExcelData();
        int lastRow = ed.getLastRowNumber("Sheet1");
        for (int i = 1; i <= lastRow; i++) {
            String name = ed.getExcelData("Sheet1", i, 0);
            String lname = ed.getExcelData("Sheet1", i, 1);
            String email = ed.getExcelData("Sheet1", i, 2);
            driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[2]/span/div")).click();
            driver.findElement(By.xpath("(//*[text()=\"Practice Form\"])[1]")).click();
            Thread.sleep(30);
            driver.findElement(By.id("firstName")).sendKeys(name);
            driver.findElement(By.id("lastName")).sendKeys(lname);
            driver.findElement(By.id("userEmail")).sendKeys(email);


        }
    }

}
