package Buoi3;

import java.util.Scanner;

public class SumNumberPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n : ");
        int inputNumber = scanner.nextInt();
        while (inputNumber <= 0) {
            System.out.println("Please enter a positive integer!!!");
            System.out.print("Retype : ");
            inputNumber = scanner.nextInt();
        }
        int sum = 0;

        for (int i = 1; i < inputNumber; i++){
            if (isPrimeNumber(i)) {
                sum += i;
            }
        }
        System.out.println("Tổng các số nguyên tố nhỏ hơn " + inputNumber + " là : " + sum);
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
