package m_NestedLoops_Exercise;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String number = "swag";
        char currentDigit = '0';
        int currentDigitNumericValue;
        // int numberLength = 4;

        for (int i = 1111; i <= 9999; i++) {
            number = Integer.toString(i);
            boolean isSpecial = false;

            for (int j = 0; j < 4; j++) {
                currentDigit = number.charAt(j);
                currentDigitNumericValue = Character.getNumericValue(currentDigit);
                isSpecial = false;
                if (currentDigitNumericValue == 0){
                    break;
                }
                if (n % currentDigitNumericValue == 0) {
                    isSpecial = true;
                } else {
                    isSpecial = false;
                    break;
                }
            }
            if (isSpecial) {
                System.out.printf("%s ", number);
            }

        }

    }
}
