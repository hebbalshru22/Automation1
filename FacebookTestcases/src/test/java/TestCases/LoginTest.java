package TestCases;

import BaseClass.Basefb;
import TestPages.LoginPage;

import org.testng.annotations.*;

import java.io.IOException;

public class LoginTest extends Basefb  {
    static LoginPage lp;
    @BeforeTest
    public static void setup() throws IOException {
        /*driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://www.facebook.com/");*/
        setup1();
        lp=new LoginPage(Basefb.driver);

    }
    @Test
    public void Logintest()
    {

        lp.email(prop.getProperty("mail"));
        lp.password(prop.getProperty("abc"));
        lp.loginclick();

    }

    @AfterTest
    public static void teardown()
    {

        quit();
    }


}
