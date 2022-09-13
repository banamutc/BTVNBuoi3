package Buoi3;

import java.util.Scanner;

public class UCLN2Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number prime 1: ");
        int numberPrime1 = scanner.nextInt();
        System.out.println("enter number prime 2: ");
        int numberPrime2 = scanner.nextInt();
        System.out.println("greatest common divisor of 2 number la: " + USCLN(numberPrime1, numberPrime2));
    }

    public static int USCLN (int numberPrime1, int numberPrime2) {
        if (numberPrime2 == 0) {
            return numberPrime1;
        }
        else {
            return USCLN(numberPrime2, numberPrime1 % numberPrime2);
        }
    }
}
