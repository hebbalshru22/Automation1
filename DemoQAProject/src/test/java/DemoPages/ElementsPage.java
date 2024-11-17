package DemoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class ElementsPage {
    WebDriver driver;

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);

    }

    //Locators of text box
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[1]/span/div/div[1]")
    WebElement Ele;
    @FindBy(id = "item-0")
    WebElement textClick;
    @FindBy(id = "userName")
    WebElement passname;
    @FindBy(id = "userEmail")
    WebElement passemail;
    @FindBy(id = "currentAddress")
    WebElement passcAddress;
    @FindBy(id = "permanentAddress")
    WebElement passpAddress;
    @FindBy(xpath = "//*[text()=\"Submit\"]")
    WebElement formSubmit;


    //Locators of Check box
    @FindBy(id = "item-1")
    WebElement cbmenu;
    @FindBy(xpath = "//*[@class=\"rct-collapse rct-collapse-btn\"]")
    WebElement fcheck;
    @FindBy(xpath = "(//*[@class=\"rct-icon rct-icon-uncheck\"])[3]")
    WebElement cbox;
    @FindBy(xpath = "//*[@class=\"rct-icon rct-icon-expand-all\"]")
    WebElement plus;

    //Locators for radiobutton
    @FindBy(xpath = "(//*[text()=\"Radio Button\"])[1]")
    WebElement radioclick;
    @FindBy(id = "yesRadio")
    WebElement radioyesclick;
    @FindBy(xpath = "//*[text()=\"You have selected \"]")
    WebElement radiotext;


    //Locators for web table
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[1]/span/div/div[1]")
    WebElement WebAdd;
    @FindBy(id = "item-3")
    WebElement WebButton;
    @FindBy(id = "addNewRecordButton")
    WebElement addingnew;
    @FindBy(id = "firstName")
    WebElement passnewname;
    @FindBy(id = "lastName")
    WebElement passnewlname;
    @FindBy(id = "userEmail")
    WebElement passnewemail;
    @FindBy(id = "age")
    WebElement webage;
    @FindBy(id = "salary")
    WebElement sal;
    @FindBy(id = "department")
    WebElement dep;
    @FindBy(id = "submit")
    WebElement sub;
    @FindBy(id = "google_esf")
    WebElement frame;

    //Locators of buttons
    @FindBy(xpath = "//*[text()=\"Buttons\"]")
    WebElement botton1;
    @FindBy(id = "doubleClickBtn")
    WebElement doubleclcik;
    @FindBy(xpath = "//*[text()=\"Right Click Me\"]")
    WebElement rightclick;
    @FindBy(xpath = "//*[text()=\"Click Me\"]")
    WebElement move;

    //Locators for link
    @FindBy(id = "item-5")
    WebElement linksclick;
    @FindBy(id = "simpleLink")
    WebElement onelinkclick;

    //Locators of broken links
    @FindBy(id = "item-6")
    WebElement brokenclick;

    //Locators of Upload and Download
    @FindBy(id = "item-7")
    WebElement up;
    @FindBy(id = "uploadFile")
    WebElement down;

    //Locators of Dynamic
    @FindBy(xpath = "(//*[text()=\"Dynamic Properties\"])[1]")
    WebElement dynamic;
    @FindBy(id = "enableAfter")
    WebElement dynamic1;
    @FindBy(id = "visibleAfter")
    WebElement dynamic2;


    //Action Methods for Text box
    public void textPage(String uname, String uemail, String caddress, String paddress)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
       // Ele.click();
        js.executeScript("arguments[0].click()", Ele);

        js.executeScript("arguments[0].click()", textClick);

       // textClick.click();
        String url="https://demoqa.com/text-box";
        String crul= driver.getCurrentUrl();
        Assert.assertEquals(url,crul);
        passname.sendKeys(uname);
        passemail.sendKeys(uemail);
        passcAddress.sendKeys(caddress);
        passpAddress.sendKeys(paddress);
        System.out.println("This is text box test");
       // JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", formSubmit);
    }

    //Action Methods for Check box
    public void checkbox() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", cbmenu);
        String cburl="https://demoqa.com/checkbox";
        String ccbrul= driver.getCurrentUrl();
        Assert.assertEquals(cburl,ccbrul);
        System.out.println("This is click first");
        js.executeScript("arguments[0].click()", fcheck);
        System.out.println("This is click second");
    }

    public void radioPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click()", radioclick);
       // Assert.fail();
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(1,2);
       // sa.assertAll();
        System.out.println("This is radio button test");
        js.executeScript("arguments[0].click()", radioyesclick);
        System.out.println(radiotext.getText());
       }

    public void webtablePage(String nweb, String lweb, String lemail, String lage, String lsal, String ldep) {
        WebAdd.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", WebButton);
        System.out.println("CLicking on Webbutton");
        js.executeScript("arguments[0].click()", addingnew);
        System.out.println("This is to add the table");
        passnewname.sendKeys(nweb);
        passnewlname.sendKeys(lweb);
        passnewemail.sendKeys(lemail);
        webage.sendKeys(lage);
        sal.sendKeys(lsal);
        System.out.println("This is adding the deatils");
        dep.sendKeys(ldep);
        js.executeScript("arguments[0].click()", sub);

        //sub.click();
        // frame.click();
    }

    public void buttonstest() {
        WebAdd.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", botton1);
        Actions act = new Actions(driver);
        act.doubleClick(doubleclcik);
        System.out.println("This is doubleclick");
        act.contextClick(rightclick);
        System.out.println("This is right click");
        act.moveToElement(move);
        System.out.println("This is move to element");
    }

    public void Alllinksclick() {
        WebAdd.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", linksclick);
        js.executeScript("window.scrollBy(0,500)", "");
        List<WebElement> ll = driver.findElements(By.xpath("//a"));
        int siz = ll.size();
        System.out.println(siz);
        for (int i = 0; i < siz; i++) {
            WebElement ds = ll.get(i);
            String name = ds.getText();
            System.out.println(name);
        }
        onelinkclick.click();
        System.out.println("This is getwindowhandle");
        String st = driver.getWindowHandle();
        System.out.println(st);
    }

    public void broken_click() throws InterruptedException {
        WebAdd.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", brokenclick);
        Thread.sleep(1000);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        // Iterating each link and checking the response status
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            verifyLink(url);
        }
    }

    public static void verifyLink(String url) {
        try {
            URL link = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
            httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                System.out.println(url + " - " + httpURLConnection.getResponseMessage());
            } else {
                System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
            }
        } catch (Exception e) {
            System.out.println(url + " - " + "is a broken link");
        }
    }

    public void uploadanddownload() {
        WebAdd.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", up);
        js.executeScript("window.scrollBy(0,500)", "");
        down.sendKeys("C:/Users/Qapitol QA/Downloads/sampleFile.jpeg");
    }

    public void dynamicele() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", dynamic);
        System.out.println(dynamic1.isEnabled());
        Thread.sleep(30);
        System.out.println(dynamic1.isEnabled());
        System.out.println(dynamic2.getText());
    }
}



