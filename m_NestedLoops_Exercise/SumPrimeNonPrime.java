package m_NestedLoops_Exercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int primeSum = 0;
        int nonPrimeSum = 0;
        int temp;

        while (true) {
            String numberString = scanner.nextLine();
            boolean isPrime = true;

            if (numberString.equals("stop")) {
                System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
                System.out.printf("Sum of all non prime numbers is: %d%n", nonPrimeSum);
                break;
            } else {
                number = Integer.parseInt(numberString);
            }
            if (number < 0) {
                System.out.println("Number is negative.");
                continue;
            }
            for (int i = 2; i <= number / 2; i++) {
                temp = number % i;
                if (temp == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                primeSum += number;
            } else {
                nonPrimeSum += number;
            }
        }
    }
}
