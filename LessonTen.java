package Buoi3;

public class LessonTen {
    public static void main(String[] args) {
        int totalEven = 0;

        for (int i = 2; i < 21; i++) {
            while ( i % 2 == 0) {
                totalEven += i;
                break;
            }
        }
        System.out.println("Total even number: " + totalEven);
    }
}
