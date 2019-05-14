package e_ConditionalStatements_exercise;

import java.util.Scanner;

public class ThreeBrothers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstBrotherTime = Double.parseDouble(scanner.nextLine());
        double secondBrotherTime = Double.parseDouble(scanner.nextLine());
        double thirdBrotherTime = Double.parseDouble(scanner.nextLine());
        double fishingTime = Double.parseDouble(scanner.nextLine());

        //input time is in hours
        //break time 15% from total time

        double totalCleaningTime = 1 / (1 / firstBrotherTime + 1 / secondBrotherTime + 1 / thirdBrotherTime);
        double totalCleaningTimePlusBreak = 1.15 * totalCleaningTime;
        double timeLeft = fishingTime - totalCleaningTimePlusBreak;

        System.out.printf("Cleaning time: %.2f%n", totalCleaningTimePlusBreak);
        if (timeLeft < 0) {
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.", Math.ceil(Math.abs(timeLeft)));
        } else {
            System.out.printf("Yes, there is a surprise - time left -> %.0f hours.", Math.floor(timeLeft));
        }

    }

}
