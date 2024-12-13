package com.qapitol.FileOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Prop {
   public  static void main(String args[]) throws IOException {
        FileInputStream fis=new FileInputStream("C:\\New prog\\CollectionPractice\\src\\com\\qapitol\\Resources\\Data.properties");
        Properties prop=new Properties();
        prop.load(fis);
       String ff= prop.getProperty("name");
        System.out.println(ff);


    }
}
