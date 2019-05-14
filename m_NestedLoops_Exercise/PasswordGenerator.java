package m_NestedLoops_Exercise;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        // char a = 97;

        for (int i = 1; i <= n; i++) {          //symbol 1
            for (int j = 1; j <= n; j++) {      //symbol 2
                for (int k = 97; k < 97 + l; k++) {  //symbol 3 lowercase letter
                    for (int m = 97; m < 97 + l; m++) { // symbol 4 lowercase letter
                        for (int o = 1; o <= n; o++) {  // symbol 5 >
                            if (o > i && o > j) {
                                System.out.printf("%d%d%c%c%d ", i, j, k, m, o);
                            }
                        }
                    }
                }
            }
        }
    }
}
