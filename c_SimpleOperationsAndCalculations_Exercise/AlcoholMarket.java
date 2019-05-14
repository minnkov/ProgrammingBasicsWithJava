package c_SimpleOperationsAndCalculations_Exercise;

import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double priceWhiskey = Double.parseDouble(scanner.nextLine());
        double beerLiters = Double.parseDouble(scanner.nextLine());
        double wineLiters = Double.parseDouble(scanner.nextLine());
        double rakiaLiters = Double.parseDouble(scanner.nextLine());
        double whiskeyLiters = Double.parseDouble(scanner.nextLine());

        double priceRakia = priceWhiskey * 0.5;
        double priceWine = priceRakia * 0.6;
        double priceBeer = priceRakia * 0.2;

        double billBeer = beerLiters * priceBeer;
        double billWine = wineLiters * priceWine;
        double billRakia = rakiaLiters * priceRakia;
        double billWhiskey = whiskeyLiters * priceWhiskey;

        double totalPrice = billBeer + billRakia + billWhiskey + billWine;

        System.out.printf("%.2f", totalPrice);

    }

}
