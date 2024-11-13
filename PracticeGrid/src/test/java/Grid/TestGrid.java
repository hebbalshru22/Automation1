package Grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class TestGrid {

    @Test
    public void Test1() {

        try {
            System.out.println("Test1 started...");
            DesiredCapabilities dc = new DesiredCapabilities();
            dc.setBrowserName("chrome");

            @SuppressWarnings("deprecation")
            WebDriver driver = new RemoteWebDriver(new URL(" http://192.168.2.119:4444"), dc);
            driver.manage().window().maximize();
            driver.get("https://www.google.com/");
            Thread.sleep(10000);
            System.out.println("Test1 ended...");
            driver.quit();

        } catch (Exception e) {
            System.out.println("Exception is:"+e);
        }
    }
}
