package com.qapitol.demo;

import java.util.Scanner;

public class Palindrome {
    public void palindromestring() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        String rstr = "";
        for (int i = 0; i <str.length(); i++) {
            rstr = rstr + str.charAt(i);
        }
        if (str.equals(rstr)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
    public void palindromenum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int number=num;
        int rem=0;
        int rnum=0;
        while(num!=0)
        {
            rem=num%10;
            rnum=rnum*10+rem;
            num=num/10;
        }
        if(number==rnum)
        {
            System.out.println("Palindrome number");

        }
        else {
            System.out.println("Not a palindrome");
        }
    }
    public static void main(String[] args)
    {
        Palindrome obj=new Palindrome();
        obj.palindromestring();
        obj.palindromenum();
    }
}
