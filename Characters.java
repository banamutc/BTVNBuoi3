package Buoi3;

import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        String inputString = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string: ");
        inputString = scanner.nextLine();
        System.out.println("The characters in the string are : ");
        String[] words = inputString.split("\\s");
        for (String w : words) {
            System.out.println(w);
        }
    }
}
