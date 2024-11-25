package com.qapitol.fileoperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropFile {

    public  static void main(String args[]) throws IOException {
        FileInputStream fis=new FileInputStream("C:\\New prog\\FileOperations\\src\\test\\java\\Resources\\data.properties");
       FileOutputStream fss=new FileOutputStream("C:\\New prog\\FileOperations\\src\\test\\java\\Resources\\data.properties",true);
        Properties prop=new Properties();
        prop.load(fis);
        String ff= prop.getProperty("name");
        System.out.println(ff);
        System.out.println(prop.isEmpty());
        fis.close();
        prop.setProperty("Subject","cs");
        prop.store(fss,"Updated");
        System.out.println(prop.getProperty("Subject"));





    }
}
