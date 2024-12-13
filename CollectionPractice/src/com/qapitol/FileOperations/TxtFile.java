package com.qapitol.FileOperations;

import java.io.*;

public class TxtFile {
    public static void main(String args[]) throws IOException {
        String fs = "C:\\New prog\\CollectionPractice\\src\\com\\qapitol\\Resources\\ftxt.txt";
      /*  File fl = new File(fs);
        fl.createNewFile();
      //  FileOutputStream fos=new FileOutputStream(fs);
        FileWriter wr=new FileWriter(fl);
        wr.write("This is java class");
        wr.close();
        System.out.println("Successfully wrote to the file");*/
        BufferedReader br=new BufferedReader(new FileReader(fs));
        String line=br.readLine();
        while(line!=null)
        {
            System.out.println(line);
            line=br.readLine();
        }
    }

    }

