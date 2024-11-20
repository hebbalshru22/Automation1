package DemoTestCases;

import BaseDemo.BaseDemoClass;
import DemoPages.AlertsPage;
import DemoPages.Forms;
import Excel.ExcelUtility;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class FormsTest extends BaseDemoClass {
ExcelUtility ex= new ExcelUtility();
    @Test
    public void FormsTestexcec() throws IOException, InterruptedException {
    int lastrow=ex.getLastRowNumber("Sheet1");
    for(int i=1;i<=lastrow;i++) {
        String name = ex.getExcelData("Sheet1", i, 0);
        System.out.println("This is first row");
        String lname = ex.getExcelData("Sheet1", i, 1);
        System.out.println("This is second row");
        String email = ex.getExcelData("Sheet1", i, 2);
        System.out.println("This is third row");
        String mobile=ex.getExcelData("Sheet1",i,3);
        System.out.println("This is fourth row");
        Thread.sleep(30);
       // int phone = ex.getExcelData("Sheet1", 1, 3);
        Forms fom =new Forms(driver);
        fom.forms(name,lname,email,mobile);
    }
}


}
