package com.qapitol.testcases;

import com.qapitol.base.BaseClass;
import com.qapitol.pages.Widgets;
import org.testng.annotations.Test;

public class widtestcase extends BaseClass {

    @Test
    public void widget() throws InterruptedException {
        Widgets w = new Widgets();
        //w.datepicker();
        // w.AutoComplete();
        w.SelectMenue();
    }
}
