package Buoi3;

public class Lesson11 {
    public static void main(String[] args) {
        int totalEven = 0;
        for (int i = 1; i <= 99; i++) {
            while ( i % 2 != 0) {
                totalEven += i;
                break;
            }
        }
        System.out.println("Total even number: " + totalEven);
    }
}

