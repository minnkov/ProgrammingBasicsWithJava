package m_NestedLoops_Exercise;

import java.util.Scanner;

public class Coding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        int numberLength = number.length();
        int charAtPosition = numberLength - 1;

        for (int rows = 0; rows < numberLength; rows++) {
            char numberChar = number.charAt(charAtPosition);
            String numberCharToString = Character.toString(numberChar);
            int numberInt = Integer.parseInt(numberCharToString);
            int symbolInt = numberInt + 33;
            char symbol = (char)symbolInt;

            if (numberInt == 0) {
                System.out.println("ZERO");
                charAtPosition--;
                continue;
            }

            for (int i = 0; i < numberInt; i++) {
                System.out.print(symbol);
            }
            charAtPosition--;
            System.out.println();

        }
    }
}
