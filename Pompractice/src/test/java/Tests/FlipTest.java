package Tests;
import BasePack.BaseClass;
import Pages.FlipPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class FlipTest extends BaseClass {

    FlipPage fp;

    @BeforeTest
    public  void lauch() throws IOException {
        setUp2();
        fp=new FlipPage(BaseClass.driver);
    }

    @Test
    public void abc() {
        fp.addtext1("Apple iPhone");
    }

@AfterTest
    public void closebrwoser()
{
    teardown();
}
}
