package m_NestedLoops_Exercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gradesCount = Integer.parseInt(scanner.nextLine());
        double finalAverageGrade = 0;
        int presentationCounter = 0;

        while (true) {

            String presentationName = scanner.nextLine();
            if (presentationName.equals("Finish")) {
                break;
            }
            double gradesSum = 0;
            double averageGradeForPresentation = 0;

            for (int j = 0; j < gradesCount; j++) {
                double grade = Double.parseDouble(scanner.nextLine());
                gradesSum += grade;
            }
            averageGradeForPresentation = gradesSum / gradesCount;
            finalAverageGrade += averageGradeForPresentation;
            System.out.printf("%s - %.2f.%n", presentationName, averageGradeForPresentation);
            presentationCounter++;
        }
        finalAverageGrade /= presentationCounter;
        System.out.printf("Student's final assessment is %.2f.", finalAverageGrade);
    }
}
