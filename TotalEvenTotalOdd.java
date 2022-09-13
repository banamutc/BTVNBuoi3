package Buoi3;

import java.util.Scanner;

public class TotalEvenTotalOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter  n:");
        int n = scanner.nextInt();
        int totalEven = 0;
        int totalOdd = 0;
        if (n % 2 == 0) {
            for (int i = 2; i <= n; i++) {
                if (i % 2 == 0) {
                    totalEven += i;
                }
            }
            System.out.println("total even: " + totalEven);
        }
        else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    totalOdd += i;
                }
            }
            System.out.println("total le: " + totalOdd);
        }

    }
}
