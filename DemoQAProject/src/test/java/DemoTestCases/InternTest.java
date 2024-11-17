package DemoTestCases;

import BaseDemo.BaseDemoClass;
import DemoPages.AlertsPage;
import DemoPages.Interactions;
import org.testng.annotations.Test;

public class InternTest  extends BaseDemoClass {
    @Test
    public void intertestcase()
    {
        Interactions pp=new Interactions(driver);
        pp.sort();
    }
    @Test
    public void selectable1()
    {
        Interactions pp=new Interactions(driver);
        pp.selectable();
    }
    @Test
    public void resize()
    {
        Interactions pp=new Interactions(driver);
        pp.resizable();
    }
    @Test
    public void drop()
    {
        Interactions pp=new Interactions(driver);
        pp.droPable();
    }




}
