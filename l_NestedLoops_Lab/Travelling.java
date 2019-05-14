package l_NestedLoops_Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        goshko:
        while (true) {

            String destination = scanner.nextLine();
            if (destination.equals("End")) {
                break;
            }
            String budgetInput = scanner.nextLine();
            int budget = 0;
            int totalSum = 0;

            if (budgetInput.equals("End")) {
                break;
            } else {
                budget = Integer.parseInt(budgetInput);
            }

            while (totalSum < budget) {
                String input = scanner.nextLine();
                int sum = 0;

                if (input.equals("End")) {
                    break goshko;
                } else {
                    sum = Integer.parseInt(input);
                }
                totalSum += sum;
            }
            System.out.println("Going to " + destination + "!");
        }

    }
}
