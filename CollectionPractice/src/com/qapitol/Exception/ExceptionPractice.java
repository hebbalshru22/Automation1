package com.qapitol.day4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionPractice {

    public void createFile() throws IOException {
        File file = new File("abc.txt");
        file.createNewFile();

    }

    // IOException
    // SQLException
    // NullPointerException
    // ArrayIndexOutOfBoundExcepiton


        public static void main (String[]args)  {

            Scanner sc = new Scanner(System.in);

            long age = sc.nextLong();

            int intAge = (int) age;
            System.out.println(intAge);


        }
    }


