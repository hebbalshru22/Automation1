package DemoPages;

import Excel.ExcelDataprovider;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BookStorePage {
    WebDriver driver;

    public BookStorePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);

    }

    //Locators of Register
    @FindBy(xpath = "//*[text()=\"Book Store Application\"]")
    WebElement book;
    @FindBy(xpath = "(//*[text()=\"Login\"])[1]")
    WebElement book1;
    @FindBy(xpath = "//*[text()=\"New User\"]")
    WebElement bok;
    @FindBy(id = "firstname")
    WebElement book2;
    @FindBy(id = "lastname")
    WebElement book3;
    @FindBy(id = "userName")
    WebElement book4;
    @FindBy(id = "password")
    WebElement book5;
    @FindBy(xpath = "//*[@class=\"recaptcha-checkbox-border\"]")
    WebElement book6;
    @FindBy(id = "register")
    WebElement book7;


    //Locators of the login
    @FindBy(id = "userName")
    WebElement log;
    @FindBy(id = "password")
    WebElement log1;
    @FindBy(id = "login")
    WebElement log2;
    @FindBy(xpath = "//*[text()=\"Log out\"]")
    WebElement log3;

    //Locators for Book Store
    @FindBy(xpath = "//*[text()=\"Book Store\"]")
    WebElement store;
    @FindBy(id = "searchBox")
    WebElement store1;
    @FindBy(xpath = "//*[@class=\"select-wrap -pageSizeOptions\"]")
    WebElement rowSelect;

    //Locators for profile
    @FindBy(xpath = "//*[text()=\"Profile\"]")
    WebElement profile;
    @FindBy(xpath = "//*[text()=\"login\"]")
    WebElement profLogin;
    @FindBy(xpath = "//*[text()=\"register\"]")
    WebElement profRegister;

    public void profilePage() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", book1);
        js.executeScript("arguments[0].click()", profile);
        js.executeScript("arguments[0].click()", profLogin);
        loginUser("shru", "Common@12345!");
    }

    //Action methods for book Store
    public void bookstore(String bookn) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", book1);
        js.executeScript("arguments[0].click()", store);
        store1.sendKeys(bookn);

    }
    //Action Methods for Login
    public void loginUser(String Nname, String Passname) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", book1);
        log.sendKeys(Nname);
        log1.sendKeys(Passname);
        js.executeScript("arguments[0].click()", log2);
        Thread.sleep(30);
        js.executeScript("arguments[0].click()", log3);
    }
    //Action methods of Register method
    public void registerbook(String name, String lname, String Uname, String pass) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", book);
        js.executeScript("arguments[0].click()", book1);
        js.executeScript("arguments[0].click()", bok);
        book2.sendKeys(name);
        book3.sendKeys(lname);
        book4.sendKeys(Uname);
        book5.sendKeys(pass);
        js.executeScript("arguments[0].click()", book7);
    }
}
