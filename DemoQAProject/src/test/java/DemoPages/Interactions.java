package DemoPages;

import BaseDemo.BaseDemoClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Interactions extends BaseDemoClass {

    WebDriver driver;

    public Interactions(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);

    }
    //Locators
    @FindBy(xpath="//*[text()=\"Interactions\"]")
    WebElement inter;
    @FindBy(xpath="//*[text()=\"Sortable\"]")
    WebElement inter1;
    @FindBy(xpath="(//*[text()=\"One\"])[1]")
    WebElement inter2;
    @FindBy(xpath="(//*[text()=\"Five\"])[1]")
    WebElement inter3;
    @FindBy(id="demo-tab-grid")
    WebElement inter4;

    //Locators for selectable
    @FindBy(xpath="(//*[text()=\"Selectable\"])[1]")
    WebElement sel;
    @FindBy(xpath="//*[text()=\"Cras justo odio\"]")
    WebElement sel1;
    @FindBy(xpath="//*[text()=\"Morbi leo risus\"]")
    WebElement sel2;
    @FindBy(xpath="//*[text()=\"Grid\"]")
    WebElement sel3;
    @FindBy(xpath="//*[text()=\"Five\"]")
    WebElement sel4;
    @FindBy(xpath="//*[text()=\"Six\"]")
    WebElement sel5;

    //Action methods for resizable
    @FindBy(xpath="(//*[text()=\"Resizable\"])[1]")
    WebElement resize;
    @FindBy(xpath="(//*[@class=\"react-resizable-handle react-resizable-handle-se\"])[1]")
    WebElement resize1;

    //Locators of Droppable
    @FindBy(xpath="(//*[text()=\"Droppable\"])[1]")
    WebElement dropable;
    @FindBy(id="draggable")
    WebElement dropable1;
    @FindBy(id="droppable")
    WebElement dropable2;


    public void droPable()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", inter);
        js.executeScript("arguments[0].click()", dropable);
        Actions act=new Actions(driver);
        act.dragAndDrop(dropable1,dropable2);

    }

    //Action method for resizable
    public void resizable()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", inter);
        js.executeScript("arguments[0].click()", resize);
        Actions act=new Actions(driver);
        js.executeScript("arguments[0].click()", resize1);
     System.out .println(resize1.getLocation());
     act.dragAndDropBy(resize1,600,700);
     act.moveToElement(resize1).click().dragAndDropBy(resize1, 600, 700);
     System.out .println(resize1.getLocation());
    }

    //Action method for selectable
    public void selectable()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", inter);
        js.executeScript("arguments[0].click()", sel);
        js.executeScript("arguments[0].click()", sel1);
        js.executeScript("arguments[0].click()", sel2);
        Actions act=new Actions(driver);
        act.keyDown(Keys.CONTROL).click(sel3);
        js.executeScript("arguments[0].click()", sel4);
        js.executeScript("arguments[0].click()", sel5);






    }

    //Action methods for Sortable
    public void sort()
    {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", inter);
        js.executeScript("arguments[0].click()", inter1);
        Actions act=new Actions(driver);
        act.dragAndDrop(inter2,inter3);
        System.out.println("This is drag and drop using actions class");
        act.keyDown(Keys.CONTROL).click(inter4);
        System.out.println("This is second tab");
        act.dragAndDrop(inter2,inter3);
    }



}
