package l_NestedLoops_Lab;

import java.util.Scanner;

public class NameWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxSum = Integer.MIN_VALUE;
        String winnerName = "swag";

        while (true) {
            String name = scanner.nextLine();
            int sum = 0;
            if (name.equals("STOP")) {
                break;
            }

            for (int i = 0; i < name.length(); i++) {
                sum += name.charAt(i);
            }
            if (sum > maxSum) {
                maxSum = sum;
                winnerName = name;
            }

        }
        System.out.printf("Winner is %s - %d!", winnerName, maxSum);
    }
}
