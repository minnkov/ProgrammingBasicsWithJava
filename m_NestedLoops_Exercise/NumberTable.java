package m_NestedLoops_Exercise;

import java.util.Scanner;

public class NumberTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int current = 1;

        for (int rows = 0; rows < number; rows++) {

            for (int cols = 0; cols < number ; cols++) {
                current = rows + cols + 1;
                if (current > number) {
                    current = 2 * number - current;
                }
                System.out.printf("%d ", current);
            }
            System.out.println();
        }
    }
}
