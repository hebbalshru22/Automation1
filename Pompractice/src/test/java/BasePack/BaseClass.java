package BasePack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {
    public static WebDriver driver;
    public static Properties prop;

    public static void setUp2() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\New prog\\Pompractice\\src\\test\\java\\Util\\data.properties");

        prop.load(fis);
        String browsername = prop.getProperty("browser");
        if (browsername.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();

        } else {
            driver = new EdgeDriver();
        }
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }
       /* DesiredCapabilities dc = new DesiredCapabilities();
        dc.setBrowserName("chrome");

        driver = new RemoteWebDriver(new URL("http://192.168.2.119:4444"), dc);
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}*/

        public void teardown()
    {
        driver.close();
    }
}
