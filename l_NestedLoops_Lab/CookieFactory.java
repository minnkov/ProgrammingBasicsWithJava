package l_NestedLoops_Lab;

import java.util.Scanner;

public class CookieFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int batches = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= batches; i++) {

            boolean flour = false;
            boolean eggs = false;
            boolean sugar = false;

            goshko:
            while (true) {
                String component = scanner.nextLine();

                switch (component) {
                    case "Bake!":
                        if (flour && eggs && sugar) {
                            break goshko;
                        } else {
                            System.out.println("The batter should contain flour, eggs and sugar!");
                            continue;
                        }
                    case "flour":
                        flour = true;
                        break;
                    case "eggs":
                        eggs = true;
                        break;
                    case "sugar":
                        sugar = true;
                        break;
                    default:
                        break;
                }
            }
            System.out.printf("Baking batch number %d...%n", i);
        }

    }
}
