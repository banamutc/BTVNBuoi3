package Buoi3;

import java.util.Scanner;

public class EquationOfDegree1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter equation of degree 1 ax + b = 0: ");
        System.out.println("enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.println("enter coefficient b: ");
        double b = sc.nextDouble();

        if ( a == 0){
            if ( b == 0){
                System.out.println("Equation with infinite solutions");
            }
            else {
                System.out.println("Equation has no solution");
            }
        }
        else {
            System.out.println("The equation that has a solution is x = " + (-b / a ));
        }
    }
}
