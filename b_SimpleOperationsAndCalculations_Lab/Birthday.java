package b_SimpleOperationsAndCalculations_Lab;

import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int Length = Integer.parseInt(scanner.nextLine());
        int Width = Integer.parseInt(scanner.nextLine());
        int Height = Integer.parseInt(scanner.nextLine());
        double otherStuffPercent = Double.parseDouble(scanner.nextLine());

        double volumeInLitres = (Length * Width * Height) * 0.001;
        double volumeOfWater = volumeInLitres - volumeInLitres * otherStuffPercent * 0.01;

        System.out.printf("%.3f", volumeOfWater);
    }
}
