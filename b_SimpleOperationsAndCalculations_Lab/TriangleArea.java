package b_SimpleOperationsAndCalculations_Lab;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sideA = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double area  = sideA * height / 2;

        System.out.printf("%.2f", area);

    }

}
