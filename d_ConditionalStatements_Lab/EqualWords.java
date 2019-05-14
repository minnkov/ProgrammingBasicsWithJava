package d_ConditionalStatements_Lab;

import java.util.Scanner;

public class EqualWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstWord = scanner.nextLine().toLowerCase();
        String secondWord = scanner.nextLine().toLowerCase();

        if (firstWord.equals(secondWord)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }

}
