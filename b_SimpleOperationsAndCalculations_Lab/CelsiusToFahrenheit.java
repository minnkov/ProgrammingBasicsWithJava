package b_SimpleOperationsAndCalculations_Lab;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double degreesInCelsius = Double.parseDouble(scanner.nextLine());
        double degreesInFarenheit = (degreesInCelsius * 1.8) + 32;

        System.out.printf("%.2f", degreesInFarenheit);

    }

}
