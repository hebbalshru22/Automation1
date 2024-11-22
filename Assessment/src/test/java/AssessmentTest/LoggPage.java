package AssessmentTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggPage {

    @FindBy(id="userNameOrEmail")
    private WebElement username;

    @FindBy(id="password")
    private WebElement password;

    @FindBy(xpath="(//*[text()=\"Sign In\"])[3]")
            private  WebElement sign;

    WebDriver driver;
    public LoggPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(this.driver,this);
    }

    public void pageLog(String nn, String pp)
    {
        username.sendKeys(nn);
        password.sendKeys(pp);
        sign.click();
    }
}
