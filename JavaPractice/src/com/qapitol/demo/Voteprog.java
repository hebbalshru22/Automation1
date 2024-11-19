package com.qapitol.demo;

import java.util.Scanner;

public class Voteprog {
 /*   "Age should be between 18 to 100 -> Print Eligible
    Below 18-> Not eligible
    Greater than 100 -> Incorrect age"*/
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the age");
    int num=sc.nextInt();
    if(num>=18 && num<=100)
    {
        System.out.println("Eligible to vote");
    }
    else if(num<18)
    {
        System.out.println("Not eligible to vote");
    } else if(num>100)
    {
        System.out.println("Incorrect age");

    }
  }
}
