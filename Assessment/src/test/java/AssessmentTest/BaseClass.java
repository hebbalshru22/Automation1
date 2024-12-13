package AssessmentTest;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class BaseClass
{
    public static WebDriver driver;

    @BeforeMethod
    public void open()
    {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("http://139.59.27.246:3000/login");

    }

    @AfterMethod
    public void closing()
    {
        driver.close();
    }
}
