package com.qapitol.fileoperations;

import java.io.*;

public class TextFile {
    public static void main(String args[]) throws IOException {
        String fil = "C:\\New prog\\FileOperations\\src\\test\\java\\Resources\\Myfile.txt";
       File fs=new File(fil);
        fs.createNewFile();
        FileWriter wr=new FileWriter(fs);
        wr.write("This is java class");
        wr.write("This is java class");

        wr.close();
        System.out.println("Successfully wrote to the file");
       /* BufferedReader br = new BufferedReader(new FileReader(fil));
        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }*/

      }
    }


