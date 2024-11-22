package AssessmentTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.List;

public class Cricbuzz {
    WebDriver driver;
    @Test
    public void testStart()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.cricbuzz.com/cricket-series/8525/womens-big-bash-league-2024/points-table");
        driver.manage().window().maximize();
        List<WebElement> teams = driver.findElements(By.xpath("//table//tr//td[@class='cb-srs-pnts-name']"));
        List<WebElement> wb = driver.findElements(By.xpath("//table//tr//td[@class='cb-srs-pnts-td text-bold']"));
        for (int i = 0; i < wb.size(); i++)
        {
            String pText = wb.get(i).getText();
            int p1 = Integer.parseInt(pText);
            if (p1 >= 9) {
                String teamName = teams.get(i).getText();
            System.out.println(teamName +":"+ p1);
            }
        }

        }


    }




