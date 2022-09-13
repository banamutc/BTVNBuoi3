package Buoi3;

import java.util.Scanner;

public class NumberPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println("Is not a prime number");
        }
        int count = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Is a prime number");
        } else {
            System.out.println("Is not a prime number");
        }
    }
}

