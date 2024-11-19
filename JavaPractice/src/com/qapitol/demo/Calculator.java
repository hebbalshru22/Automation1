package com.qapitol.demo;

import java.util.Scanner;

public class Calculator {

    public void menu(int num1,int num2)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the option");
        int ans=sc.nextInt();
        switch (ans)
        {
            case 1:
                System.out.println(num1+num2);
                break;
            case 2:
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println(num1/num2);
                break;
            case 4:
                System.out.println(num1*num2);
                break;
            default:
                System.out.println("Choose correct option");
        }

}
public static void main(String[] args)
    {
        Calculator cal=new Calculator();
        cal.menu(12,6);
    }
}
