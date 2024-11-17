package DemoTestCases;

import BaseDemo.BaseDemoClass;
import DemoPages.AlertsPage;
import DemoPages.BookStorePage;
import Excel.ExcelDataprovider;
import org.testng.annotations.Test;

public class BookTest extends BaseDemoClass {
    @Test(dataProvider = "loginData",dataProviderClass = ExcelDataprovider.class)
    public void bookdata(String Name,String Lname,String name,String Passname)
    {
        BookStorePage bg=new BookStorePage(driver);
        bg.registerbook( Name, Lname,name,Passname);
    }
    @Test(dependsOnMethods ="bookdata" )
    public void LoginnewUser() throws InterruptedException {
        BookStorePage bg=new BookStorePage(driver);
        bg.loginUser("shru","Common@12345!");
    }
    @Test(priority = 1)
    public void books() throws InterruptedException {
        BookStorePage og=new BookStorePage(driver);
       og.bookstore("git");
    }
    @Test(priority=2)
    public void profileTest() throws InterruptedException {
        BookStorePage ph=new BookStorePage(driver);
        ph.profilePage();
    }

   }
