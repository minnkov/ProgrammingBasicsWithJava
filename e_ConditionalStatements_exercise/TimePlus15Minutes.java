package e_ConditionalStatements_exercise;

import java.util.Scanner;
public class TimePlus15Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        //the time after 15 minutes

        int timeInMinutes = hours * 60 + minutes;
        int timePlus15 = timeInMinutes + 15;

        int finalHours = timePlus15 / 60;
        int finalMinutes = timePlus15 % 60;

        if (finalMinutes < 10) {
            if (finalHours == 24) {
                finalHours = 0;
                System.out.printf("%d:0%d", finalHours, finalMinutes);
            } else {
                System.out.printf("%d:0%d", finalHours, finalMinutes);
            }
        } else {
            if (finalHours == 24) {
                finalHours = 0;
                System.out.printf("%d:%d", finalHours, finalMinutes);
            } else {
                System.out.printf("%d:%d", finalHours, finalMinutes);
            }
        }
    }

}

