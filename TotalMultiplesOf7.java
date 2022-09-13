package Buoi3;

public class TotalMultiplesOf7 {
    public static void main(String[] args) {
        int total = 0;
        for(int i = 1; i < 100; i++) {
            if ( i % 7 != 0) {
                total += i;
                continue;
            }
            System.out.println("The sum of the multiples of 3 from 3 to 300 is : " + i);
        }
        System.out.println(" sum multiples of 7 from 1 to 100 is : " + total);
    }
}
