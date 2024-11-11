package org.example.facedbookpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registrationpage {
    WebDriver driver;
    //Constructor
    Registrationpage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    //Locators
@FindBy(xpath = "//*[text()=\"Create new account\"]")
    WebElement newuser;

    @FindBy(name="firstname") WebElement firstname;
    @FindBy(name="lastname") WebElement lastname;
    @FindBy(name="birthday_day") WebElement birthdate;
    @FindBy(name="birthday_month") WebElement birthmonth;
    @FindBy(name="birthday_year") WebElement birthyear;
    @FindBy(id="sex") WebElement gender;
    @FindBy(xpath="//*[text()=\"Female\"]") WebElement female;
    @FindBy(xpath="//*[text()=\"Male\"]") WebElement male;
    @FindBy(xpath="//*[text()=\"Custom\"]") WebElement custom;

    @FindBy(name="reg_email__") WebElement mobileno;
    @FindBy(id="password_step_input") WebElement password;
    @FindBy(name="websubmit") WebElement clicklogin;

    //Action class
    public void freshuser()
    {
        newuser.click();;
    }
    public void  Fname(String fname)
    {
        firstname.click();
        firstname.sendKeys(fname);
    }
    public void lname(String lname)
    {
        lastname.click();
        lastname.sendKeys(lname);
    }

    public void birthdate(String val)
    {
        birthyear.click();
        Select dd=new Select(birthdate);
        dd.selectByValue(val);

    }
    public void birthMonth(String monthval )
    {
        birthmonth.click();
        Select dd=new Select(birthmonth);
        dd.selectByVisibleText(monthval);

    }
    public void birthYear(String yearval )
    {
        birthyear.click();
        Select dd=new Select(birthyear);
        dd.selectByValue(yearval);

    }
    public void genderval(int num)
    {
        if(num==1)
        {
        female.click();
        }
        else if (num==2)
        {
            male.click();
        } else if (num==3) {
            custom.click();
        }

        }



    public void passcode(String pass)
    {
        password.click();
        password.sendKeys("pass");

    }
    public void mobilenum(String num)
    {
        mobileno.click();
        mobileno.sendKeys(num);
    }
    public void log()
    {
        clicklogin.click();
    }
}