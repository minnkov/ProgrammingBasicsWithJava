package c_SimpleOperationsAndCalculations_Exercise;

import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfTables = Integer.parseInt(scanner.nextLine());
        double tableLength = Double.parseDouble(scanner.nextLine());
        double tableWidth = Double.parseDouble(scanner.nextLine());

        double areaPokrivka = (2 * 0.3 + tableLength) * (2 * 0.3 + tableWidth);
        double areaKare = (tableLength / 2) * (tableLength / 2);

        double costPokrivkiInUsd = numberOfTables * areaPokrivka * 7;
        double costKaretaInUsd = numberOfTables * areaKare * 9;

        double costPoruchka = costPokrivkiInUsd + costKaretaInUsd;
        double costPoruchkaBgn = costPoruchka * 1.85;

        System.out.printf("%.2f USD%n", costPoruchka);
        System.out.printf("%.2f BGN", costPoruchkaBgn);

    }

}
