package b_SimpleOperationsAndCalculations_Lab;

import java.util.Scanner;

public class TrapeziodArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double b3 = Double.parseDouble(scanner.nextLine());

        double area = (b1 + b2) * b3 / 2;

        System.out.printf("%.2f", area);

    }

}
