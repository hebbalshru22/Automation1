package com.qapitol.testcases;

import com.qapitol.base.BaseClass;
import com.qapitol.pages.Alerts;
import com.qapitol.pages.TextBox;
import com.qapitol.pages.Widgets;
import org.testng.annotations.Test;

public class alerttestcase extends BaseClass {
    //@Test
    public void alttc() throws InterruptedException {
        Alerts ob=new Alerts();
        //ob.alerts();
        //ob.windowpage();
      // ob.iframe();
        ob.nestedframe();

    }


}
