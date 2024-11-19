package com.qapitol.demo;

import java.util.Scanner;

public class AreaRect {
    public void rectangle()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
       int num1= sc.nextInt();
       System.out.println("ENter the width");
       int num2=sc.nextInt();
       int area;
       area=num1*num2;
       System.out.println("Area of rectangle is\n"+area);

    }
    public static void main(String[] args)
    {
        AreaRect sr=new AreaRect();
        sr.rectangle();
    }
}
