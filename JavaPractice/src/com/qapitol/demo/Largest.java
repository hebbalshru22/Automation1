package com.qapitol.demo;

import java.util.Scanner;

public class Largest {
    public void large() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num= sc.nextInt();
        System.out.println("Enter the number 2");
        int num1= sc.nextInt();
        System.out.println("Enter the number 2");
        int num2= sc.nextInt();
        if(num>num1)
        {
            System.out.println("num is greater");
        }if(num1>num2)
        {
            System.out.println("num1 is greater");
        }else
        {
            System.out.println("num2 is greater");
        }
    }
    public static void main(String args[])
    {
        Largest l=new Largest();
        l.large();
    }
}
