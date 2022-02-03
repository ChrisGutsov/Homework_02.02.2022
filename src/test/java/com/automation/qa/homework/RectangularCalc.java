package com.automation.qa.homework;

import java.util.Scanner;

public class RectangularCalc {
    public static void main(String[] args) {
        //int longSide;
        //int shortSide;
        int resultArea = 0;
        int resultPerimeter = 0;
        System.out.println("+--------------------------------------------------------------+");
        System.out.println("|This program calculate the perimeter and area of rectangular. |");
        System.out.println("|You have to enter a  value for both sides A and B.            |");
        System.out.println("|The perimeter is calculated as: P = 2 * A + 2 * B cm2.        |");
        System.out.println("|The area is calculated as: P = A * B.                         |");
        System.out.println("+--------------------------------------------------------------+");
        System.out.println("");
        System.out.println("Enter a decimal value for Side B:");
        Scanner scanner = new Scanner(System.in);
        int longSide = scanner.nextInt();
        System.out.println("Enter a decimal value for Side A:");
        Scanner scanner1 = new Scanner(System.in);
        int shortSide = scanner1.nextInt();
        if ((longSide == 0) || (shortSide == 0)) {
            System.out.println("Invalid value! try again.");
        } else {
            resultPerimeter = longSide * shortSide;
            System.out.printf("The Area of the rectangular is = %d cm.", +resultPerimeter);
            resultArea = 2 * (longSide + shortSide);
            System.out.printf("\nThe Perimeter of the rectangular is = %d cm2.", +resultArea);
        }

    }
}