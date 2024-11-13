package Pages;

import BasePack.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FlipPage extends BaseClass {
    WebDriver driver;

    //Constructor
    public FlipPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(this.driver,this);

    }
    //Locators
    @FindBy(name="q")
    WebElement search;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;
    @FindBy(xpath="//*[@class=\"KzDlHZ\"]")
    List<WebElement> common;

    public void  addtext1(String text)
    {
        search.sendKeys(text);
        submit.click();
       // for(WebElement products:common)
            //System.out.println(products.getText());
        for(int i=0;i< common.size();i++) {
            WebElement we = common.get(i);
            String str = we.getText();

            System.out.println(str);
        }
    }

}
