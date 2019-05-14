package d_ConditionalStatements_Lab;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double holidayPrice = Double.parseDouble(scanner.nextLine());
        int numberOfPuzzles = Integer.parseInt(scanner.nextLine());
        int numberOfDolls = Integer.parseInt(scanner.nextLine());
        int numberOfTeddys = Integer.parseInt(scanner.nextLine());
        int numberOfMinions = Integer.parseInt(scanner.nextLine());
        int numberOfTrucks = Integer.parseInt(scanner.nextLine());

        double totalnNmberOfToys = numberOfPuzzles + numberOfDolls + numberOfTeddys + numberOfMinions + numberOfTrucks;

        double puzzlePrice = 2.60;
        double dollPrice = 3;
        double teddyPrice = 4.10;
        double minionPrice = 8.20;
        double truckPrice = 2;

        double totalPrice = (numberOfPuzzles * puzzlePrice) + (numberOfDolls * dollPrice) + (numberOfTeddys * teddyPrice) + (numberOfMinions * minionPrice) + (numberOfTrucks * truckPrice);

        if (totalnNmberOfToys >= 50) {
            totalPrice = 0.75 * totalPrice;
            totalPrice = 0.9 * totalPrice;
            if (totalPrice >= holidayPrice) {
                double moneyLeft = Math.abs(totalPrice - holidayPrice);
                System.out.printf("Yes! %.2f lv left.", moneyLeft);
            } else {
                double insufficientMoney = Math.abs(totalPrice - holidayPrice);
                System.out.printf("Not enough money! %.2f lv needed.", insufficientMoney);
            }
        } else if (totalnNmberOfToys < 50) {
            totalPrice = 0.9 * totalPrice;
            if (totalPrice >= holidayPrice) {
                double moneyLeft = Math.abs(totalPrice - holidayPrice);
                System.out.printf("Yes! %.2f lv left.", moneyLeft);
            } else {
                double insufficientMoney = Math.abs(totalPrice - holidayPrice);
                System.out.printf("Not enough money! %.2f lv needed.", insufficientMoney);
            }
        }

    }

}
