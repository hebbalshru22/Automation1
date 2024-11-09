package com.qapitol.testcases;

import com.qapitol.base.BaseClass;
import com.qapitol.pages.Checkbox;
import com.qapitol.pages.TextBox;
import com.qapitol.pages.WebTablepage;
import org.testng.annotations.Test;

public class Textboxcases  extends BaseClass {


    @Test(enabled = false)
    public void TextBoxElements()
    {
       TextBox ob=new TextBox();
        ob.textBox();
    }
    @Test
    public void CheckboxElements() throws InterruptedException {
        Checkbox obj=new Checkbox();
        obj.checkbox();

    }

    @Test
    public void WebTablecases() throws InterruptedException {
        WebTablepage wt=new WebTablepage();
        wt.webtable();
    }
}
