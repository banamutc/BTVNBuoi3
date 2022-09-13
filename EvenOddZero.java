package Buoi3;

import java.util.Scanner;

public class EvenOddZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number prime :");
        int inputNumber = sc.nextInt();
        while ( inputNumber == 0){
                System.out.println(inputNumber + " is zero");
                break;
        }
        if ( inputNumber % 2 == 0 && inputNumber != 0){
            System.out.println(inputNumber + " is number even");
        } else if ( inputNumber % 2 != 0 && inputNumber != 0)  {
            System.out.println(inputNumber + " is number odd");
        }
    }
}
