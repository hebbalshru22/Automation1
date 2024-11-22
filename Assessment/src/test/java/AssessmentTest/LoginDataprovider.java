package AssessmentTest;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

public class LoginDataprovider extends BaseClass{

    @Test(dataProvider = "login")
    public void log(String uname, String pass) throws InterruptedException {
       LoggPage lp=new LoggPage(driver);
       lp.pageLog(uname,pass);
       Thread.sleep(1000);
        String actual = driver.findElement(By.cssSelector(".show")).getText();
        String expected="\"Bad credentials\"";
        Assert.assertEquals(actual,expected,"Matching");
    }
    @DataProvider(name = "login")
    public String[][] loginData() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Qapitol QA\\Downloads\\Book 3 (1).xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sh=wb.getSheet("Sheet1");
        int rownum = sh.getLastRowNum();
        int colnum = sh.getRow(0).getLastCellNum();
        String[][] data = new String[rownum - 1][colnum];
        for (int i = 0; i < rownum - 1; i++) {
            for (int j = 0; j < colnum; j++) {
                data[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue();
            }
        }
        return data;
    }

  }

