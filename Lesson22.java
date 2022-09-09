package Buoi3;

import java.util.Scanner;

public class Lesson22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number Prime: ");
        int n = scanner.nextInt();
        boolean isPrime = true;
        for(int i = 2; i <= n/2; i++ ) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " is number prime");
        } else {
            System.out.println(n + " is not number prime");
        }
    }
}
