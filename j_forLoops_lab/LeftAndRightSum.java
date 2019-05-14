package j_forLoops_lab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number = 0;
        int sumOfFirstNumbers = 0;
        int sumOfSecondNumbers = 0;

        for (int i = 0; i < 2 * n; i++) {
            number = Integer.parseInt(scanner.nextLine());
            if (i < n) {
                sumOfFirstNumbers += number;
            } else {
                sumOfSecondNumbers += number;
            }
        }
        if (sumOfFirstNumbers == sumOfSecondNumbers) {
            System.out.printf("Yes, sum = %d", sumOfFirstNumbers);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sumOfFirstNumbers - sumOfSecondNumbers));
        }
    }
}
