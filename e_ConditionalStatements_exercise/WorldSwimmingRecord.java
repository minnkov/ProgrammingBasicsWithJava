package e_ConditionalStatements_exercise;
import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine()); //seconds

        double each15Meters = Math.floor(distanceInMeters / 15);
        double slowDownPer15Meters = each15Meters * 12.5;

        double totalTime = (distanceInMeters * timePerMeter + slowDownPer15Meters);
        double differenceFromRecord = recordInSeconds - totalTime;

        if (differenceFromRecord < 0) {
            differenceFromRecord = Math.abs(differenceFromRecord);
            System.out.printf("No, he failed! He was %.2f seconds slower.%n", differenceFromRecord);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.%n", totalTime);

        }
    }

}
