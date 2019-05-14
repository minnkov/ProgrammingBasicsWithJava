package j_forLoops_lab;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int evenYearsCounter = 0;
        double birthdayMoney = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                evenYearsCounter++;
                birthdayMoney = birthdayMoney + (evenYearsCounter * 10);
            } else {
                birthdayMoney += toyPrice;
            }
        }
        birthdayMoney -= evenYearsCounter;
        if (birthdayMoney >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", (birthdayMoney - washingMachinePrice));
        } else {
            System.out.printf("No! %.2f", (washingMachinePrice - birthdayMoney));
        }
    }
}
