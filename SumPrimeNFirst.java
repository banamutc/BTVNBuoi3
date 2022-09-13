package Buoi3;

import java.util.Scanner;

import static Buoi3.SumNumberPrime.isPrimeNumber;

public class SumPrimeNFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter N: ");
        int numberN = scanner.nextInt();
        int i = 2;
        int cout = 0;
        int sum = 0;
        while ( cout < numberN) {
            if (isPrimeNumber(i)) {
                cout++;
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of first " + numberN + " primes is " + sum);
    }

}
