package c_SimpleOperationsAndCalculations_Exercise;

import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double roomLength = Double.parseDouble(scanner.nextLine());
        double roomWidth = Double.parseDouble(scanner.nextLine());
        double wardrobeSide = Double.parseDouble(scanner.nextLine());

        double roomArea = roomLength * roomWidth;
        double wardrobeArea = wardrobeSide * wardrobeSide;
        double benchArea = roomArea / 10;

        double availableArea = roomArea - wardrobeArea - benchArea;
        double numberOfDancers = availableArea / (0.7 + 0.004);

        System.out.printf("%.0f", Math.floor(numberOfDancers));

    }

}
