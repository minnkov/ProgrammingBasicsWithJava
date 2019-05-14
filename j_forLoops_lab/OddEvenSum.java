package j_forLoops_lab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number = 0;
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;

        for (int i = 1; i <= n; i++) {
            number = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                sumOfEvenNumbers += number;
            } else {
                sumOfOddNumbers += number;
            }
        }
        if (sumOfEvenNumbers == sumOfOddNumbers) {
            System.out.printf("Yes%nSum = %d", sumOfEvenNumbers);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(sumOfEvenNumbers - sumOfOddNumbers));
        }
    }
}
