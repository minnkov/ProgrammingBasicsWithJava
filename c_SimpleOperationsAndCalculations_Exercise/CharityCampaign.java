package c_SimpleOperationsAndCalculations_Exercise;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int days = Integer.parseInt(scanner.nextLine());
        int numberOfBakers = Integer.parseInt(scanner.nextLine());
        int numberOfCakes = Integer.parseInt(scanner.nextLine());
        int numberOfWaffles = Integer.parseInt(scanner.nextLine());
        int numberOfPancakes = Integer.parseInt(scanner.nextLine());

        double priceOfAllCakes = days * numberOfBakers * numberOfCakes * 45;
        double priceOfAllWaffles = days * numberOfBakers * numberOfWaffles * 5.80;
        double priceOfAllPancakes = days * numberOfBakers * numberOfPancakes * 3.20;

        double earnings = (priceOfAllCakes + priceOfAllPancakes + priceOfAllWaffles) - ((priceOfAllCakes + priceOfAllPancakes + priceOfAllWaffles) * 0.125);

        System.out.printf("%.2f", earnings);
    }

}
