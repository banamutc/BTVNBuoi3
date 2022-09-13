package Buoi3;

import java.util.Scanner;

public class stringFibonaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int number = scanner.nextInt();

        int[] fibonaci = new int[number];
        fibonaci[0] = 1;
        fibonaci[1] = 1;
        for (int i = 2; i < number; i++) {
            fibonaci[i] = fibonaci[i - 1] + fibonaci[i - 2];
        }
        System.out.println(number + " The first number of the Fibonaci sequence is : ");
        for (int n : fibonaci) {
            System.out.print(n + "\t");
        }
    }
}
