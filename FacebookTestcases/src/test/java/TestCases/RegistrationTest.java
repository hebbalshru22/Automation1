package TestCases;

import BaseClass.Basefb;
import TestPages.RegistrationPage;

import org.testng.annotations.*;

import java.io.IOException;

import static BaseClass.Basefb.*;

public class RegistrationTest {

    static RegistrationPage rp;
    @BeforeTest
    public static void setUp() throws IOException {
        setup1();
        rp=new RegistrationPage(Basefb.driver);

    }

    @Test
    public  void registration()
    {
        rp.freshuser();
        rp.Fname(prop.getProperty("first"));
        rp.lname(prop.getProperty("last"));
        rp.birthdate(prop.getProperty("bdate"));

        rp.birthMonth(prop.getProperty("bmonth"));
        rp.birthYear(prop.getProperty("byear"));
        rp.genderval(1);
        rp.mobilenum(prop.getProperty("mob"));
        rp.passcode(prop.getProperty("passwordcode"));



    }
    @AfterTest
    public static void teardown()
    {
        quit();
    }




}
