package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Basefb {
    public static WebDriver driver;
    public static Properties prop;

    public static void setup1() throws IOException {
        prop=new Properties();
        FileInputStream fs=new FileInputStream("C:\\New prog\\FacebookTestcases\\src\\test\\java\\Util\\data.properties");
        prop.load(fs);
        String browsername=  prop.getProperty("browser");

    if(browsername.equalsIgnoreCase("chrome"))
    {
        driver=new ChromeDriver();
    }
    else {
        driver = new EdgeDriver();
    }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get(prop.getProperty("url"));

    }

    public static void quit()
    {

        driver.close();
    }
}
