package k_forLoops_exercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); //number of open browser tabs
        double salary = Double.parseDouble(scanner.nextLine()); //salary
        String input = "swag";

        //globi bate
        double facebook = 150;
        double instagram = 100;
        double reddit = 50;


        for (int i = 0; i < n; i++) {
            input = scanner.nextLine();

            if (input.equals("Facebook")) {
                salary -= facebook;
            } else if (input.equals("Instagram")) {
                salary -=instagram;
            } else if (input.equals("Reddit")) {
                salary -= reddit;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > 0) {
            System.out.printf("%.0f%n", salary);
        }
    }
}
