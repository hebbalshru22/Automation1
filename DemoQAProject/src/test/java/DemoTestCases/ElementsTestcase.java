package DemoTestCases;

import BaseDemo.BaseDemoClass;
import DemoPages.AlertsPage;
import DemoPages.ElementsPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ElementsTestcase extends BaseDemoClass {

    @Test(priority = 1)

    public void ElementTest() throws InterruptedException {
        ElementsPage ap=new ElementsPage(driver);

        ap.textPage("Shruti", "shrutihebbal22@gmail.com", "SHinagar", "Navanagar");
    }

    @Test(priority = 2,dependsOnMethods ="ElementTest" )

    public void ElementTest1() throws InterruptedException {
        ElementsPage ap=new ElementsPage(driver);

        ap.checkbox();
    }

    @Test(priority = 4)

    public void ElementTest2() throws InterruptedException {
        ElementsPage ap=new ElementsPage(driver);

        ap.radioPage();
    }

    @Test(priority = 3)

    public void ElementTest3() throws InterruptedException {
        ElementsPage ap=new ElementsPage(driver);

        ap.webtablePage("shruti", "Mahin", "shru@email.com", "10", "20", "testing");

    }

    @Test(priority = 5)

    public void ElementTest4() throws InterruptedException {

        ElementsPage ap=new ElementsPage(driver);

        ap.buttonstest();
    }

    @Test(priority = 7)

    public void ElementTest5() throws InterruptedException {
        ElementsPage ap=new ElementsPage(driver);

        ap.Alllinksclick();
    }

    @Test(priority = 6)

    public void ElementTest6() throws InterruptedException {
        ElementsPage ap=new ElementsPage(driver);


        ap.broken_click();
    }

    @Test(priority = 8)

    public void ElementTest7() throws InterruptedException {
        ElementsPage ap=new ElementsPage(driver);

        ap.uploadanddownload();
    }

    @Test(priority = 9)

    public void ElementTest8() throws InterruptedException {
        ElementsPage ap=new ElementsPage(driver);
        ap.dynamicele();
    }


}
