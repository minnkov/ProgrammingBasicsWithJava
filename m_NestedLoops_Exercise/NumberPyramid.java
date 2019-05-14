package m_NestedLoops_Exercise;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int current = 1;
        boolean isBigger = false;

        petio:
        for (int rows = 1; rows <= number; rows++) {
            for (int cols = 1; cols <= rows ; cols++) {
                System.out.printf("%d ", current);
                current++;
                if (current > number) {
                    break petio;
                }
            }
            System.out.println();
        }

    }
}
