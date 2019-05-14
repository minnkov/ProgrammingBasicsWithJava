package d_ConditionalStatements_Lab;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        switch (password) {
            case "s3cr3t!P@ssw0rd":
                System.out.println("Welcome");
                break;
            default:
                System.out.println("Wrong password!");
                break;
        }

    }

}
