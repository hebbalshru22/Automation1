package BaseDemo;

import com.beust.jcommander.Parameter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseDemoClass {
    public static WebDriver driver;
    @BeforeTest
   public void lauchbrowser(){
 /*@Parameters("browser")
    public static void lauchbrowser(String browsername) {
            if(browsername.equalsIgnoreCase("chrome")) {  //driver = new EdgeDriver();
                driver = new ChromeDriver();
            }
       else if(browsername.equalsIgnoreCase("edge")) {  //driver = new EdgeDriver();
            driver = new EdgeDriver();
        }
       else  if(browsername.equalsIgnoreCase("firefox")) {  //driver = new EdgeDriver();
            driver = new FirefoxDriver();
        }*/
    //   driver = new EdgeDriver();
       driver = new ChromeDriver();


        driver.get("https://demoqa.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().window().maximize();
   }
    @AfterTest
    public void shutbrowser()
    {
        driver.quit();

    }
    /*
     <class name="DemoTestCases.AlertTest"/>

     <class name="DemoTestCases.ElementsTestcase"/>
            <class name="DemoTestCases.WidgetsTest"/>
        */

}
