package com.automation.qa.homework;

public class CompareNumbers {
    public static void main(String[] args) {
            int number1 = 20;
            int number2 = 43;
            int number3 = 555;

            if ((number1 > number2) && (number1 > number3)){
                System.out.printf("The number1=%d is greater than number2=%d and number3=%d ", +number1, +number2, +number3);
            }else if((number2 > number1) && (number2 > number3)){
            System.out.printf("The number2=%d is greater than number1=%d and number3=%d ", +number2, +number1, +number3);
            }else {
            System.out.printf("The number3=%d is greater than number1=%d and number2=%d ", +number3, +number1, +number2);
        }
    }

}
