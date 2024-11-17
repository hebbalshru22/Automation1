package DemoPages;

import BaseDemo.BaseDemoClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;

public class AlertsPage extends BaseDemoClass {
    WebDriver driver;

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);

    }

    //Locators of Alerts tab
    @FindBy(xpath = "//*[text()=\"Alerts, Frame & Windows\"]")
    WebElement alertsclick;
    @FindBy(xpath = "//*[text()='Alerts']")
    WebElement subalerts;
    @FindBy(id = "alertButton")
    WebElement Falert;
    @FindBy(id = "confirmButton")
    WebElement Salert;
    @FindBy(id = "promtButton")
    WebElement Talert;

    //Locators of WindowPAges
    @FindBy(xpath = "(//*[text()=\"Browser Windows\"])[1]")
    WebElement bw;
    @FindBy(id = "tabButton")
    WebElement Ftab;
    @FindBy(id = "windowButton")
    WebElement Stab;
    @FindBy(id = "messageWindowButton")
    WebElement Ttab;
    @FindBy(id = "sampleHeading")
    WebElement Ftext;


    //Locators of nested Frame
    @FindBy(xpath = "//*[text()=\"Nested Frames\"]")
    WebElement nestedframe;
    @FindBy(xpath = "//p[text()='Child Iframe']")
    WebElement nestedf;
    @FindBy(xpath = "//body[text()='Parent frame']")
    WebElement nest;

    //Action mothods for nested frame
    public void nestedFrame() {
        wb.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", nestedframe);
        driver.switchTo().frame("frame1");
        driver.switchTo().frame(0);
        System.out.println(nestedf.getText());
        driver.switchTo().parentFrame();
        System.out.println(nest.getText());
    }


    //Locators of Frame
    @FindBy(xpath = "//*[text()=\"Alerts, Frame & Windows\"]")
    WebElement wb;
    @FindBy(xpath = "(//*[text()=\"Frames\"])[1]")
    WebElement item;
    @FindBy(id = "sampleHeading")
    WebElement wb1;
    @FindBy(id = "sampleHeading")
    WebElement wb2;

    //Action methods for frame
    public void frame() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", wb);

        js.executeScript("arguments[0].click()", item);
        System.out.println("Hi");
        driver.switchTo().frame("frame1");
        System.out.println(wb1.getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        System.out.println(wb2.getText());
        driver.switchTo().defaultContent();
    }

    //Action methods of Alerts tab
    public void demoalert(String name) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", alertsclick);
        js.executeScript("arguments[0].click()", subalerts);
        js.executeScript("arguments[0].click()", Falert);
        driver.switchTo().alert().accept();
        System.out.println("First Alert");
        js.executeScript("arguments[0].click()", Salert);
        driver.switchTo().alert().dismiss();
        System.out.println("Second Alert");
        js.executeScript("arguments[0].click()", Talert);
        driver.switchTo().alert().sendKeys(name);
        driver.switchTo().alert().accept();
        System.out.println("Third Alert");

    }

    public void demoWindow() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", alertsclick);
        js.executeScript("arguments[0].click()", bw);
        js.executeScript("arguments[0].click()", Ftab);
        Set<String> str = driver.getWindowHandles();
        Iterator<String> itr = str.iterator();
        String nstr = itr.next();
        String rrt = itr.next();
        driver.switchTo().window(rrt);
        System.out.println("First Tab");
        System.out.println(Ftext.getText());
        driver.close();
       // shutbrowser();
        System.out.println("Closed tab1");
        Thread.sleep(30);
        driver.switchTo().window(nstr);
        js.executeScript("arguments[0].click()", Stab);
        String winID = driver.getWindowHandle();
        System.out.println(winID);
        //shutbrowser();
        //driver.close();
        driver.switchTo().window(nstr);
        js.executeScript("arguments[0].click()", Ttab);
        String winID1 = driver.getWindowHandle();
        System.out.println(winID1);

    }


}
