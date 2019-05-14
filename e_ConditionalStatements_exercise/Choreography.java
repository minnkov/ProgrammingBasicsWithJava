package e_ConditionalStatements_exercise;

import java.util.Scanner;

public class Choreography {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int steps = Integer.parseInt(scanner.nextLine());
        int dancers = Integer.parseInt(scanner.nextLine());
        int daysToLearn = Integer.parseInt(scanner.nextLine());

        double daysDouble = daysToLearn;
        double totalStepsPerDay = (steps / daysDouble) / steps;
        double totalPercentStepsPerDay = Math.ceil(totalStepsPerDay* 100.0);
        double totalPercentOfStepsPerDancer = totalPercentStepsPerDay / dancers;

        if (totalPercentStepsPerDay > 13) {
            System.out.printf("No, they will not succeed in that goal! Required %.2f%s steps to be learned per day. %n", totalPercentOfStepsPerDancer,"%");
        } else {
            System.out.printf("Yes, they will succeed in that goal! %.2f%s%n", totalPercentOfStepsPerDancer, "%.");

        }

    }

}
