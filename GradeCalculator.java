/* 
Elyla Hamada
echamada@ucsd.edu
A16753456
*/

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // this should read the number of PA and their scores
        int numAssignments = scanner.nextInt();
        double[] assignmentScores = new double[numAssignments];
        double totalScore = 0.0;
        for (int i = 0; i < numAssignments; i++) {
            if (scanner.hasNextDouble()) {
                double score = scanner.nextDouble();
                if (score < 0) {
                    System.out.println("invalid input");
                    return;
                }
                assignmentScores[i] = score;
                totalScore += score;
            } else {
                System.out.println("invalid input");
                return;
            }
        }
        double averageScore = totalScore / numAssignments;

        // this one reades the scores of the midterm and final
        if (scanner.hasNextDouble()) {
            double midtermScore = scanner.nextDouble();
            double finalScore = scanner.nextDouble();

            // checks for any negative values
            if (midtermScore < 0 || finalScore < 0) {
                System.out.println("invalid input");
                return;
            }

            // Calculate total score
            double paWeight = 0.5;
            double midtermWeight = 0.125;
            double finalWeight = 0.375;
            totalScore = averageScore * paWeight + midtermScore * midtermWeight + finalScore * finalWeight;

            // Determine letter grade
            String letterGrade;
            if (totalScore >= 90) {
                letterGrade = "A";
            } else if (totalScore >= 80) {
                letterGrade = "B";
            } else if (totalScore >= 70) {
                letterGrade = "C";
            } else if (totalScore >= 60) {
                letterGrade = "D";
            } else {
                letterGrade = "F";
            }

            // Display results
            System.out.println("Programming assignment average: " + averageScore);
            System.out.println("Total score: " + totalScore);
            System.out.println("Letter grade: " + letterGrade);
        } else {
            System.out.println("Invalid input");
        }
    }
}
