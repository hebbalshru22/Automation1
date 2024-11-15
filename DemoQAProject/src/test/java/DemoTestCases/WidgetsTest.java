package DemoTestCases;

import BaseDemo.BaseDemoClass;
import DemoPages.AlertsPage;
import DemoPages.ElementsPage;
import DemoPages.WidgetsPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WidgetsTest extends BaseDemoClass {

     @Test(priority=1)
    public void widgetd1() throws InterruptedException {
         WidgetsPage wp=new WidgetsPage(driver);
         wp.menutest();
     }
    @Test(priority=3)
    public void widgetd2() throws InterruptedException {
        WidgetsPage wp=new WidgetsPage(driver);

        wp.datepickyear();
    }
    @Test(priority=6)
    public void widgetd3() throws InterruptedException {
        WidgetsPage wp=new WidgetsPage(driver);

        wp.SelectMenu();
    }
    @Test(priority=2)
    public void widgetd4() throws InterruptedException {

        WidgetsPage wp=new WidgetsPage(driver);

        wp.slider();
    }
    @Test(priority=5)
    public void widgetd5() throws InterruptedException {
        WidgetsPage wp=new WidgetsPage(driver);

        wp.progress();
    }
    @Test(priority=4)
    public void widgetd6() throws InterruptedException {


        WidgetsPage wp=new WidgetsPage(driver);
        wp.tabPage();
        Thread.sleep((30));
       }



}
