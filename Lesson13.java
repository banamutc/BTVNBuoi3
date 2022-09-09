package Buoi3;

import java.util.Scanner;

public class Lesson13 {
    public static void main(String[] args) {
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter  n:");
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            total += i;
        }
        System.out.println("total = " + total);
    }
}
