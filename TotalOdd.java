package Buoi3;

public class TotalOdd {
    public static void main(String[] args) {
        int totalOdd = 0;
        for (int i = 1; i < 100; i++) {
            if ( i % 2 != 0) {
                System.out.println(i);
                totalOdd += i;
            }

        }
        System.out.println("Total even number: " + totalOdd);
    }
}

