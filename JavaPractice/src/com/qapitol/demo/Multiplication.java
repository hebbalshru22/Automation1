package com.qapitol.demo;

import java.util.Scanner;

public class Multiplication {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
                System.out.println("Enter the number");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=10;j++)
            {
               // int mul=i*j;
                System.out.println(i+"*"+j+"="+(j*i));
            }
//System.out.println(i);
        }
    }
}
