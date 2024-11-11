package org.example.facedbookpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
    WebDriver driver;
    //Constructor for initialization
    Loginpage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    //Locators
    @FindBy(id="email") WebElement email;
    @FindBy(id="pass") WebElement password;
    @FindBy(xpath="(//*[text()=\"Log in\"])[1]") WebElement loginclick;


    //Action Methods
    public void email(String emailid)
    {
        email.click();
        email.sendKeys(emailid);

    }
    public void password(String pass)
    {
        password.click();
        password.sendKeys(pass);
    }

    public void loginclick()
    {
        loginclick.click();
    }


}
