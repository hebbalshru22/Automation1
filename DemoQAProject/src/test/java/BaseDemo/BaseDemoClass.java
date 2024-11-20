package BaseDemo;

import com.beust.jcommander.Parameter;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseDemoClass {
    public static WebDriver driver;
    public static Properties prop;

    @BeforeTest
 //public void lauchbrowser() throws IOException {
  @Parameters("browser")
    public static void lauchbrowser(String browsername) throws IOException {
        if (browsername.equalsIgnoreCase("chrome"))
        {
            driver = new ChromeDriver();
        } else if (browsername.equalsIgnoreCase("edge")) {  //driver = new EdgeDriver();
            driver = new EdgeDriver();
        } else if (browsername.equalsIgnoreCase("firefox")) {  //driver = new EdgeDriver();
            driver = new FirefoxDriver();
        }
       //driver = new EdgeDriver();
       // driver = new ChromeDriver();
        prop = new Properties();
        FileInputStream fs = new FileInputStream("C:\\New prog\\DemoQAProject\\src\\test\\java\\Excel\\data.properties");
        prop.load(fs);
       driver.get(prop.getProperty("url"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.manage().window().maximize();

    }

    @AfterTest
    public void shutbrowser() {
        driver.close();


}}
