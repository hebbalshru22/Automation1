package TestCases;

import BaseClass.Basefb;
import TestPages.RegistrationPage;

import org.testng.annotations.*;
import static BaseClass.Basefb.quit;
import static BaseClass.Basefb.setup1;

public class RegistrationTest {

    static RegistrationPage rp;
    @BeforeTest
    public static void setUp()
    {
        setup1();
        rp=new RegistrationPage(Basefb.driver);

    }

    @Test
    public  void registration()
    {
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
    @AfterTest
    public static void teardown()
    {
        quit();
    }




}
