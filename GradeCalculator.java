/* 
Elyla Hamada
echamada@ucsd.edu
A16753456
*/

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of programming assignments and their scores
        int numAssignments = scanner.nextInt();
        double[] assignmentScores = new double[numAssignments];
        double totalScore = 0.0;
        for (int i = 0; i < numAssignments; i++) {
            if (scanner.hasNextDouble()) {
                double score = scanner.nextDouble();
                assignmentScores[i] = score;
                totalScore += score;
            } else {
                System.out.println("Invalid input");
                return;
            }
        }
        double averageScore = totalScore / numAssignments;

        // Read midterm and final scores
        if (scanner.hasNextDouble()) {
            double midtermScore = scanner.nextDouble();
            double finalScore = scanner.nextDouble();

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

            // Check for negative grades or grades over 100
            boolean invalidInput = false;
            for (double score : assignmentScores) {
                if (score < 0 || score > 100) {
                    invalidInput = true;
                    break;
                }
            }
            if (midtermScore < 0 || midtermScore > 100 || finalScore < 0 || finalScore > 100) {
                invalidInput = true;
            }

            // Display results or print "Invalid input"
            if (invalidInput) {
                System.out.println("Invalid input");
            } else {
                System.out.println("Total score: " + totalScore);
                System.out.println("Letter grade: " + letterGrade);
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
