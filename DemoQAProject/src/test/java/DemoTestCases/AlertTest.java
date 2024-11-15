package DemoTestCases;

import BaseDemo.BaseDemoClass;
import DemoPages.AlertsPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertTest  extends BaseDemoClass {
    @Test(priority = 3,dependsOnMethods ="TestAlert1" )
    public void TestAlert()
    {
        AlertsPage ap=new AlertsPage(driver);
        ap.demoalert("shruti");
        }
    @Test(priority = 1)
    public void TestAlert1()
    {
        AlertsPage ap=new AlertsPage(driver);
        ap.demoWindow();

    }
    @Test(priority = 2)
    public void TestAlert2()
    {
        AlertsPage ap=new AlertsPage(driver);
        ap.frame();
       }
    @Test(priority = 4)
    public void TestAlert3()
    {
        AlertsPage ap=new AlertsPage(driver);
        ap.nestedFrame();
    }





}
