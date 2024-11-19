package com.qapitol.demo;

import java.util.Scanner;

public class EvenOdd {
    public void checkEven()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

         if(num%2==0)
         {
             System.out.println("Even number");
         }
         else {
             System.out.println("odd number");
         }
    }
    public static void main(String[] arges)
    {
                EvenOdd obj=new EvenOdd();
                obj.checkEven();
  }
}
