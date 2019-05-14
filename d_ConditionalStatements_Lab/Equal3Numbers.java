package d_ConditionalStatements_Lab;

import java.util.Scanner;

public class Equal3Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int numberThree = Integer.parseInt(scanner.nextLine());

        if (numberOne == numberTwo && numberTwo == numberThree) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }

}
