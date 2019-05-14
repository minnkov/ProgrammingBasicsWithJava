package b_SimpleOperationsAndCalculations_Lab;

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sideA = Integer.parseInt(scanner.nextLine());

        System.out.println(sideA * sideA);
    }

}
