package e_ConditionalStatements_exercise;
import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double sredenUspeh = Double.parseDouble(scanner.nextLine());
        double minimalWage = Double.parseDouble(scanner.nextLine()); //seconds

        double socialScholarship = 0.35 * minimalWage;
        double scholarship = sredenUspeh * 25;

        if (sredenUspeh > 4.5 && sredenUspeh < 5.5) {
            if (minimalWage > income) {
                System.out.printf("You get a Social scholarship %.0f BGN %n", Math.floor(socialScholarship));
            } else if (minimalWage < income  || (minimalWage == 0 && income == 0)) {
                System.out.println("You cannot get a scholarship!");
            }
        } else if (sredenUspeh >= 5.5) {
            if (minimalWage > income) {
                if (socialScholarship > scholarship){
                    System.out.printf("You get a Social scholarship %.0f BGN %n", Math.floor(socialScholarship));
                } else if (scholarship > socialScholarship) {
                    System.out.printf("You get a scholarship for excellent results %.0f BGN %n", Math.floor(scholarship));
                }
            } else if (minimalWage < income) {
                System.out.printf("You get a scholarship for excellent results %.0f BGN %n", Math.floor(scholarship));
            }
        } else {
            System.out.println("You cannot get a scholarship!");
        }

    }

}
