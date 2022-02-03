package com.automation.qa.homework;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String [] args){
        System.out.println("This program shows the specific day when a number has been entered.");
        System.out.println("Enter a number between (1-7): ");
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        switch (dayNumber){
            case 1:
                System.out.printf("The \"%d\" day of the week is the Monday", dayNumber);
                break;
            case 2:
                System.out.printf("The \"%d\" day of the week is the Tuesday",dayNumber);
                break;
            case 3:
                 System.out.printf("The \"%d\" day of the week is the Wednesday", dayNumber);
                 break;
            case 4:
                System.out.printf("The \"%d\" day of the week is the Thursday", dayNumber);
                break;
            case 5:
                System.out.printf("The \"%d\" day of the week is the Friday", dayNumber);
                break;
            case 6:
                System.out.printf("The \"%d\" day of the week is the Saturday", dayNumber);
                break;
            case 7:
                System.out.printf("The \"%d\" day of the week is the Sunday", dayNumber);
                break;
            default:
                System.out.println("Ops!...You have entered an Invalid value, try again!");
                break;
        }

    }
}
