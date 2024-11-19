package com.qapitol.demo;

import java.util.Scanner;

public class Fibonacci {
    public void fib()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int n1=0,n2=1,sum=0;
        System.out.println(n1);
        System.out.println(n2);
        for(int i=2;i<num;i++)
        {
            sum=n1+n2;
            System.out.println("Fib number is \n"+sum);
            n1=n2;
            n2=sum;

        }
      }
    public static void main(String args[])
    {
        Fibonacci fi=new Fibonacci();
        fi.fib();
    }
}
