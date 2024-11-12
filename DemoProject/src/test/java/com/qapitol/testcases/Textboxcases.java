package com.qapitol.testcases;

import com.qapitol.base.BaseClass;
import com.qapitol.pages.*;
import com.qapitol.util.ExcelData;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class Textboxcases  extends BaseClass {


    @Test(enabled = false)
    public void TextBoxElements()
    {
       TextBox ob=new TextBox();
        ob.textBox();

    }
    @Test(enabled = false)
    public void CheckboxElements() throws InterruptedException {
        Checkbox obj=new Checkbox();
        obj.checkbox();

    }

    @Test(enabled = false)
    public void WebTablecases() throws InterruptedException {
        WebTablepage wt=new WebTablepage();
        wt.webtable();
    }
    @Test(enabled = false)
    public void clicks() throws InterruptedException {
        doubleclick dc=new doubleclick();
        dc.dclick();
    }
    @Test(enabled = false)
    public void alllinks() throws InterruptedException {
        Links al=new Links();
        al.linksdemo();

    }
    @Test(enabled = false)
    public void broken() throws IOException, InterruptedException {
        Brokenlinks fl=new Brokenlinks();
        fl.blinks();
    }
    @Test(enabled = false)
    public void upload() throws IOException, InterruptedException {
        UploadandDownload ud=new UploadandDownload();
        ud.uddemo();
    }
  /*@Test(dataProvider = "datap",enabled = false)
    @Test
    public void formsdata(String name,String lname,String email) throws IOException, InterruptedException {
         FormsPage dp=new FormsPage();
         dp.forms(name,lname,email);

    }
     @DataProvider(name="datap")
 public   Object[][] logindata()
    {
        Object data[][]={

            {"shruti","test123","shru@gmail.com"},
            {"Hebbal","test321","hebbal@gmail.com"},


            };
            return data;


    }*/
    @Test(enabled=false)
    public void formsdata() throws IOException, InterruptedException {
        FormsPage dp=new FormsPage();
        dp.forms();

    }

    }






