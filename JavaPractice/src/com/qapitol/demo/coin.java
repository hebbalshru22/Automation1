package com.qapitol.demo;

import java.util.Random;
import java.util.Scanner;

public class coin {

public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of times to flip the coin: ");
    int numFlips = scanner.nextInt();
    Random random = new Random();

    for (int i = 0; i < numFlips; i++) {
        int flipResult = random.nextInt(2);
        if (flipResult == 0) {
            System.out.println("Flip " + (i + 1) + ": Heads");
        } else {
            System.out.println("Flip " + (i + 1) + ": Tails");
        }
    }
    scanner.close();
}}