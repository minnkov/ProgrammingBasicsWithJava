package m_NestedLoops_Exercise;

import java.util.Scanner;

public class EqualSumsLeftRightPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstNumberString = scanner.nextLine();
        String secondNumberString = scanner.nextLine();

        int numberlength = firstNumberString.length();
        int firstNumber = Integer.parseInt(firstNumberString);
        int secondNumber = Integer.parseInt(secondNumberString);


        for (int number = firstNumber; number <= secondNumber; number++) {
            String currentNumber = Integer.toString(number);

            int leftSum = 0;
            int rightSum = 0;
            int middleDigit = 0;

            for (int k = 1; k <= numberlength; k++) {
                char currentDigitChar = currentNumber.charAt(k - 1);
                int currentDigit = Integer.parseInt(String.valueOf(currentDigitChar));

                if (k == 1 || k == 2) {
                    leftSum += currentDigit;
                } else if (k == 4 || k == 5){
                    rightSum += currentDigit;
                } else if (k == 3) {
                    middleDigit = currentDigit;
                }
            }
            if (rightSum == leftSum) {
                System.out.printf("%d ", number);
            }else {
                if (rightSum < leftSum) {
                    rightSum += middleDigit;
                } else {
                    leftSum += middleDigit;
                }
                if (rightSum == leftSum) {
                    System.out.printf("%d ", number);
                }
            }
        }
    }
}