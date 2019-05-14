package k_forLoops_exercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OddOrEvenPosition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double number = 0;

        double oddSum = 0;
        double oddMin = Integer.MAX_VALUE;
        double oddMax = Integer.MIN_VALUE;
        double evenSum = 0;
        double evenMin = Integer.MAX_VALUE;
        double evenMax = Integer.MIN_VALUE;

        DecimalFormat df = new DecimalFormat("############.############");
        
        String no = "No";

        for (int i = 1; i <= n; i++) {
            number = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0) {
                if (number > evenMax) {
                    evenMax = number;
                }
                if (number < evenMin) {
                    evenMin = number;
                }
                evenSum += number;
            } else {
                if (number > oddMax) {
                    oddMax = number;
                }
                if (number < oddMin) {
                    oddMin = number;
                }
                oddSum += number;
            }

        }
        if (n == 0) {
            System.out.printf("OddSum=%s,%n", df.format(oddSum));
            System.out.printf("OddMin=%s,%n", no);
            System.out.printf("OddMax=%s,%n", no);
            System.out.printf("EvenSum=%s,%n", df.format(evenSum));
            System.out.printf("EvenMin=%s,%n", no);
            System.out.printf("EvenMax=%s%n", no);
        } else if (n == 1) {
            System.out.printf("OddSum=%s,%n", df.format(oddSum));
            System.out.printf("OddMin=%s,%n", df.format(oddMin));
            System.out.printf("OddMax=%s,%n", df.format(oddMax));
            System.out.printf("EvenSum=%s,%n", df.format(evenSum));
            System.out.printf("EvenMin=%s,%n", no);
            System.out.printf("EvenMax=%s%n", no);
        } else {
            System.out.printf("OddSum=%s,%n", df.format(oddSum));
            System.out.printf("OddMin=%s,%n", df.format(oddMin));
            System.out.printf("OddMax=%s,%n", df.format(oddMax));
            System.out.printf("EvenSum=%s,%n", df.format(evenSum));
            System.out.printf("EvenMin=%s,%n", df.format(evenMin));
            System.out.printf("EvenMax=%s%n", df.format(evenMax));
        }

    }
}

