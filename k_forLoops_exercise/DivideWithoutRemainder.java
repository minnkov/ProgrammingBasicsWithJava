package k_forLoops_exercise;

import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number = 0;

        double p1Count = 0;
        double p2Count = 0;
        double p3Count = 0;

        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0) {
                p1Count++;
            }
            if (number % 3 == 0) {
                p2Count++;
            }
            if (number % 4 == 0) {
                p3Count++;
            }
        }
        double p1Percent = (p1Count / n) * 100;
        double p2Percent = (p2Count / n) * 100;
        double p3Percent = (p3Count / n) * 100;

        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n", p1Percent, p2Percent, p3Percent);
    }
}
