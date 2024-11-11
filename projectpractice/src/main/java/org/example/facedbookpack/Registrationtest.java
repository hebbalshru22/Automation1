package org.example.facedbookpack;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Registrationtest {

    static WebDriver driver;
    @BeforeClass
    public static void setup()
    {
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://www.facebook.com/");

    }
    @Test
    public  void registration()
    {
        Registrationpage rp=new Registrationpage(driver);
        rp.freshuser();
        rp.Fname("Shruti");
        rp.lname("Hebbal");
        rp.birthdate("4");

        rp.birthMonth("Apr");
        rp.birthYear("2002");
        rp.genderval(1);
        rp.mobilenum("7899740744");
        rp.passcode("Common@12345!");



    }
    @AfterClass
    public static void teardown()
    {

        driver.close();
    }




}
