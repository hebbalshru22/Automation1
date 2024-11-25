package BaseDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class BasePractice {
    @BeforeSuite
    public void suite() {

        System.out.println("This is before suite");
        ChromeOptions cm=new ChromeOptions();
        cm.addArguments("--headless");
        cm.addArguments("----disable-notifications");
        ChromeDriver driver=new ChromeDriver(cm);

    driver.get("https://www.flipkart.com/");
    }

    @BeforeTest
    public void test1() {
        System.out.println("This is before test1");

    }

    @BeforeClass
    public void classb() {

    System.out.println("This is before cass");
    }

    @AfterClass
    public void classa()
    {
        System.out.println("This is after cass");

    }
    @BeforeMethod
    public void method()
    {
        System.out.println("This is before method");

    }
    @Test
    public void test2()
    {
        System.out.println("This is test case");
        Assert.assertEquals(1,1);
        System.out.println("This is for testing hard assert");

    }
    @Test
    public void test3()
    {
        System.out.println("This is test case");
        SoftAssert sf=new SoftAssert();
        sf.assertEquals(1,2);
        System.out.println("This is for testing soft assert ");
    }

    @AfterSuite
    public void suite1()
    {

        System.out.println("This is before suite");
    }
    @AfterTest
    public void test11()
    {
        System.out.println("This is before test1");

    }
    @AfterMethod
    public void method1()
    {
        System.out.println("This is before method");

    }

}

