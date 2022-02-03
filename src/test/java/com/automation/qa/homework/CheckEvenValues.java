package com.automation.qa.homework;

import java.util.Scanner;

public class CheckEvenValues {
    public static void main(String[] args) {
        System.out.println("This program check the values and find out are they even or odd.");
        System.out.println("Please enter a value: ");
        Scanner scanner = new Scanner(System.in);
        int checkedValue = scanner.nextInt();
        if (checkedValue % 2 == 0) {
            System.out.printf("The entered value %d is even.", checkedValue);
        } else {
            System.out.printf("The entered value %d is odd.", checkedValue);
        }
    }
}
