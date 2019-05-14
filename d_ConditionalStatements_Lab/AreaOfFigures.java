package d_ConditionalStatements_Lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String figureType = scanner.nextLine().toLowerCase();

        switch (figureType) {
            case "square":
                double side = Double.parseDouble(scanner.nextLine());
                double area = side * side;
                System.out.printf("%.3f", area);
                break;
            case "rectangle":
                side = Double.parseDouble(scanner.nextLine());
                double height = Double.parseDouble(scanner.nextLine());
                area = side * height;
                System.out.printf("%.3f", area);
                break;
            case "circle":
                double radius = Double.parseDouble(scanner.nextLine());
                area = Math.PI * radius * radius;
                System.out.printf("%.3f", area);
                break;
            case "triangle":
                side = Double.parseDouble(scanner.nextLine());
                height = Double.parseDouble(scanner.nextLine());
                area = side * height / 2;
                System.out.printf("%.3f", area);
                break;
        }


    }

}
