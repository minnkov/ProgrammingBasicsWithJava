package k_forLoops_exercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number = 0;

        double p1NumbersCount = 0;
        double p2NumbersCount = 0;
        double p3NumbersCount = 0;
        double p4NumbersCount = 0;
        double p5NumbersCount = 0;

        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(scanner.nextLine());

            if (number < 200) {
                p1NumbersCount++;
            } else if (number >= 200 && number < 400) {
                p2NumbersCount++;
            } else if (number >= 400 && number < 600) {
                p3NumbersCount++;
            } else if (number >= 600 && number < 800) {
                p4NumbersCount++;
            } else if (number >= 800) {
                p5NumbersCount++;
            }
        }

        double p1Percent = (p1NumbersCount / n) * 100;
        double p2Percent = (p2NumbersCount / n) * 100;
        double p3Percent = (p3NumbersCount / n) * 100;
        double p4Percent = (p4NumbersCount / n) * 100;
        double p5Percent = (p5NumbersCount / n) * 100;

        System.out.printf("%.2f%%%n", p1Percent);
        System.out.printf("%.2f%%%n", p2Percent);
        System.out.printf("%.2f%%%n", p3Percent);
        System.out.printf("%.2f%%%n", p4Percent);
        System.out.printf("%.2f%%", p5Percent);
    }
}
