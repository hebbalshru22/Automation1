package DemoPages;

import Excel.ExcelUtility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Forms {
    WebDriver driver;

    public Forms(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);

    }
    @FindBy(xpath="//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[2]/span/div")
    WebElement form1;
    @FindBy(xpath="(//*[text()=\"Practice Form\"])[1]")
    WebElement form2;
    @FindBy(xpath="//*[@id=\"firstName\"]")
    WebElement form3;
    @FindBy(xpath="//*[@id=\"lastName\"]")
    WebElement form4;
    @FindBy(xpath="//*[@id=\"userEmail\"]")
    WebElement form5;
    @FindBy(xpath="//*[text()=\"Female\"]")
    WebElement form6;
    @FindBy(xpath="//*[@id=\"userNumber\"]")
    WebElement form7;
    @FindBy(xpath="//*[@id=\"submit\"]")
    WebElement form8;

    public void forms(String fname,String fflname, String ffemail, String phone) throws InterruptedException, IOException {
        ExcelUtility ed = new ExcelUtility();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", form1);
        js.executeScript("arguments[0].click()", form2);
        form3.sendKeys(fname);
        System.out.println("Name");
        form4.sendKeys(fflname);
        System.out.println("Address");
        form5.sendKeys(ffemail);
        System.out.println("Email");
        js.executeScript("arguments[0].click()", form6);
        System.out.println("Click button");
        form7.sendKeys(phone);
        System.out.println("Mobile Number");
        js.executeScript("arguments[0].click()", form8);
        System.out.println("Submit");


    }
}






