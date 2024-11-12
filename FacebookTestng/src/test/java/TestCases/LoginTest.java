package TestCases;

import BaseClass.Basefb;
import TestPages.LoginPage;

import org.testng.annotations.*;

public class LoginTest extends Basefb  {
    static LoginPage lp;
    @BeforeTest
    public static void setup()
    {
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

        lp.email("hebbalshru22@gmail.com");
        lp.password("Common@12345!");
        lp.loginclick();

    }

    @AfterTest
    public static void teardown()
    {
        quit();
    }


}
