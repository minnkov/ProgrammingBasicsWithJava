package m_NestedLoops_Exercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstNumberString = scanner.nextLine();
        String secondNumberString = scanner.nextLine();

        int numberlength = firstNumberString.length();
        int firstNumber = Integer.parseInt(firstNumberString);
        int secondNumber = Integer.parseInt(secondNumberString);


        for (int number = firstNumber; number <= secondNumber; number++) {
            String currentNumber = Integer.toString(number);

            int oddSum = 0;
            int evenSum = 0;

            for (int k = 1; k <= numberlength; k++) {
                char currentDigitChar = currentNumber.charAt(k - 1);
                int currentDigit = Integer.parseInt(String.valueOf(currentDigitChar));

                if (k % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }
            }
            if (evenSum == oddSum) {
                System.out.printf("%d ", number);
            }
        }
    }
}
