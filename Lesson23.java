package Buoi3;

import java.util.Scanner;

public class Lesson23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number 1: ");
        int number1 = scanner.nextInt();
        System.out.println("enter number 2: ");
        int number2 = scanner.nextInt();
        System.out.println("greatest common divisor of 2 number la: " + USCLN(number1, number2));
    }

    public static int USCLN (int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        else {
            return USCLN(number2, number1 % number2);
        }
    }
}
