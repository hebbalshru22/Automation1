package com.qapitol.demo;

import java.util.Scanner;

public class Evennumber {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
       int num= sc.nextInt();

        for (int i = 0; i <= num; i++) {
            if (i % 2 != 0) {
                if (i >= 20) {
                    continue;
                }
    System.out.println(i);
            }
        }
    }
}