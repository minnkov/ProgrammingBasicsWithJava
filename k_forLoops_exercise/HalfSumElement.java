package k_forLoops_exercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number = 0;
        int sum = 0;
        int biggestNumber = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(scanner.nextLine());
            if (number > biggestNumber) {
                biggestNumber = number;
            }
            sum += number;
        }
        sum -= biggestNumber;
        if (biggestNumber == sum) {
            System.out.printf("Yes%nSum = %d", sum);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(sum - biggestNumber));
        }
    }
}
