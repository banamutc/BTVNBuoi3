package Buoi3;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TriangleExam tE = new TriangleExam();
        System.out.println("Enter the sides of the triangle");
        System.out.println("enter enter edge A: ");
        tE.setAdgeA(scanner.nextDouble());
        System.out.println("enter enter edge B: ");
        tE.setAdgeB(scanner.nextDouble());
        System.out.println("enter enter edge C: ");
        tE.setAdgeC(scanner.nextDouble());

        while (tE.AdgeA <= 0 || tE.AdgeB <= 0 || tE.AdgeC <= 0) {
            System.out.println("illegal ");
            System.out.println("enter enter edge A: ");
            tE.setAdgeA(scanner.nextDouble());
            System.out.println("enter enter edge B: ");
            tE.setAdgeB(scanner.nextDouble());
            System.out.println("enter enter edge C: ");
            tE.setAdgeC(scanner.nextDouble());
        }
        if ((tE.AdgeA + tE.AdgeB > tE.AdgeC) && (tE.AdgeA + tE.AdgeC > tE.AdgeB)
                && (tE.AdgeB + tE.AdgeC > tE.AdgeA)) {
            System.out.println("Perimeter of the triangle is = " + tE.Perimeter());
        } else {
            System.out.println("There is no satisfying triangle");
        }
    }
}
