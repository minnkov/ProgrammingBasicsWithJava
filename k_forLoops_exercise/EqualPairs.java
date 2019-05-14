package k_forLoops_exercise;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int number = 0;
        int secondNumber = 0;
        int differenceBetweenConsecutivePairs = 0;
        int previousPairSum = 0;
        int currentPairSum = 0;
        int maxDifference = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            number = Integer.parseInt(scanner.nextLine());
            secondNumber = Integer.parseInt(scanner.nextLine());

            if (i % 2 != 0) {
                previousPairSum = number + secondNumber;
            } else {
                currentPairSum = number + secondNumber;
            }
            if (i != 1) {
                differenceBetweenConsecutivePairs = previousPairSum - currentPairSum;
            }
            if (Math.abs(differenceBetweenConsecutivePairs) > maxDifference) {
                maxDifference = Math.abs(differenceBetweenConsecutivePairs);
            }
        }
        if (differenceBetweenConsecutivePairs == 0){
            System.out.println("Yes, value=" + previousPairSum);
        } else {
            System.out.println("No, maxdiff=" + maxDifference);
        }

    }
}
