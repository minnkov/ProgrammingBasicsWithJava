package m_NestedLoops_Exercise;

import java.util.Scanner;

public class Fishing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quota = Integer.parseInt(scanner.nextLine());
        double grandTotal = 0;
        int quotaCounter = 0;


        for (int i = 1; i <= quota; i++) {

            String fishName = scanner.nextLine();
            if (fishName.equals("Stop")) {
                if (grandTotal > 0) {
                    System.out.printf("Lyubo's profit from %d fishes is %.2f leva.", quotaCounter, grandTotal);
                } else {
                    System.out.printf("Lyubo lost %.2f leva today.", Math.abs(grandTotal));
                }
                break;
            }
            double fishWeight = Double.parseDouble(scanner.nextLine());
            double fishNameSum = 0;
            double fishprice = 0;

            for (int j = 0; j < fishName.length(); j++) {
                fishNameSum += fishName.charAt(j);
            }
            fishprice = fishNameSum / fishWeight;

            if (i % 3 == 0) {
                grandTotal += fishprice;
            } else {
                grandTotal -= fishprice;
            }
            quotaCounter++;
        }
        if ((quotaCounter == quota)) {
            System.out.println("Lyubo fulfilled the quota!");
            if (grandTotal > 0) {
                System.out.printf("Lyubo's profit from %d fishes is %.2f leva.", quota, grandTotal);
            } else {
                System.out.printf("Lyubo lost %.2f leva today.", Math.abs(grandTotal));
            }
        }
    }
}
