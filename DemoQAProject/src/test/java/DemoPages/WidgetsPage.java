package DemoPages;

import BaseDemo.BaseDemoClass;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class WidgetsPage extends BaseDemoClass {
    WebDriver driver;

    public WidgetsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);

    }

    //Locators of date picker
    @FindBy(xpath = "//*[text()=\"Widgets\"]")
    WebElement date;
    @FindBy(xpath = "//*[text()=\"Date Picker\"]")
    WebElement date1;
    @FindBy(id = "datePickerMonthYearInput")
    WebElement date2;
    @FindBy(xpath = "//*[@class=\"react-datepicker__month-select\"]")
    WebElement date3;
    @FindBy(xpath = "//*[@class=\"react-datepicker__year-select\"]")
    WebElement date4;
    @FindBy(xpath = "(//*[text()=\"10\"])[1]")
    WebElement date5;
    @FindBy(id = "dateAndTimePickerInput")
    WebElement date6;

    //Locators of accordian
    @FindBy(id = "item-0")
    WebElement acoo1;
    @FindBy(xpath = "//*[text()=\"What is Lorem Ipsum?\"]")
    WebElement acco2;
    @FindBy(id = "section2Heading")
    WebElement acco3;
    @FindBy(id = "section3Heading")
    WebElement acoo4;
    @FindBy(id = "section1Content")
    WebElement text1;
    @FindBy(id = "section2Content")
    WebElement text2;
    @FindBy(id = "section3Content")
    WebElement text3;

    //Locators for slider
    @FindBy(xpath = "(//*[text()=\"Slider\"])[1]")
    WebElement slider1;
    @FindBy(xpath = "//*[@class=\"range-slider range-slider--primary\"]")
    WebElement slider2;
    @FindBy(xpath = "//*[@class=\"range-slider__tooltip__label\"]")
    WebElement slider3;

    //Locators of Select menu
    @FindBy(xpath = "(//*[text()=\"Select Menu\"])[1]")
    WebElement Select1;
    @FindBy(id = "oldSelectMenu")
    WebElement Select2;
    @FindBy(id = "cars")
    WebElement Select3;

    //Locators for Progress bar
    @FindBy(xpath = "(//*[text()=\"Progress Bar\"])[1]")
    WebElement prog1;
    @FindBy(id = "startStopButton")
    WebElement prog2;
    @FindBy(id = "progressBar")
    WebElement prog3;

    //Locators for tabs
    @FindBy(id = "item-5")
    WebElement tab1;
    @FindBy(id = "demo-tab-origin")
    WebElement tab2;
    @FindBy(id = "demo-tabpane-origin")
    WebElement tab3;
    @FindBy(id = "demo-tab-use")
    WebElement tab4;
    @FindBy(id = "demo-tabpane-origin")
    WebElement tab5;

    //locators for the menu
    @FindBy(xpath = "//*[text()=\"Menu\"]")
    WebElement menu;
    @FindBy(xpath = "//*[text()=\"Main Item 1\"]")
    WebElement menu1;
    @FindBy(xpath = "//*[text()=\"Main Item 2\"]")
    WebElement menu2;
    @FindBy(xpath = "//*[text()=\"SUB SUB LIST »\"]")
    WebElement submenu;
    @FindBy(xpath = "//*[text()=\"Main Item 3\"]")
    WebElement menu3;


    //Action method for menu
    public void menutest() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", date);
        Thread.sleep(30);
        js.executeScript("arguments[0].click()", menu);
        Actions act = new Actions(driver);
        act.moveToElement(menu1).perform();
        System.out.println("Hover1");
        act.moveToElement(menu2).perform();
        System.out.println("Hover2");
        Thread.sleep(30);
        // act.moveToElement(submenu).perform();
        System.out.println("Hover3");
        act.moveToElement(menu3).perform();
        System.out.println("Hover4");

    }


    //Action methods for tabs
    public void tabPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", date);
        js.executeScript("arguments[0].click()", tab1);
        Actions act = new Actions(driver);
        act.keyDown(Keys.CONTROL).click(tab2);
        System.out.println("This is new tab");
       /* shutbrowser();
        System.out.println("This is new tab");
        act.keyDown(Keys.CONTROL).click(tab4);
        System.out.println("This is new tab");
        shutbrowser();*/

    }


    //Action methods for progress bar
    public void progress() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", date);
        js.executeScript("arguments[0].click()", prog1);

        js.executeScript("arguments[0].click()", prog2);

        Thread.sleep(20);
        js.executeScript("arguments[0].click()", prog2);
        System.out.println("This is of progress bar");

        Actions act = new Actions(driver);
        System.out.println(prog3.getLocation());
    }


    //Action methods for Select menu
    public void SelectMenu() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", date);
        js.executeScript("arguments[0].click()", Select1);
        Select dd = new Select(Select2);
        dd.selectByVisibleText("Blue");
        System.out.println((" single Color selected"));
        Select se = new Select(Select3);
        se.selectByVisibleText("Volvo");
        se.selectByVisibleText("Opel");
        System.out.println((" multi Color selected"));

    }

    //Action methods for slider
    public void slider() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", date);
        js.executeScript("arguments[0].click()", slider1);
        Actions act = new Actions(driver);
        System.out.println(slider2.getLocation());
        act.moveToElement(slider3).click().dragAndDropBy(slider3, 335, 400);
    }

    public void datepickyear() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", date);
        js.executeScript("arguments[0].click()", date1);
        js.executeScript("arguments[0].click()", date2);
        Select sc = new Select(date3);
        Thread.sleep(30);
        sc.selectByValue("1");
        Select sc1 = new Select(date4);
        sc1.selectByVisibleText("1900");
        date5.click();
        js.executeScript("arguments[0].click()", date6);

        //date6.click();
    }

    public void accordian() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", date);
        System.out.println("Hello 1");
        js.executeScript("arguments[0].click()", acoo1);
        System.out.println("Hi");
        js.executeScript("window.scrollBy(0,100)");
        //js.executeScript("arguments[0].click()", acco2);
        System.out.println("Hello");
        System.out.println(text1.getText());
        acco3.click();
        System.out.println(text2.getText());
        acoo4.click();
        System.out.println(text3.getText());

    }


}
