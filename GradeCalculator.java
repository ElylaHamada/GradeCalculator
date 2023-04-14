/* 
Elyla Hamada
echamada@ucsd.edu
A16753456
*/

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // reads the number of PA and make an array of the scores based on the amt of PA
        int numAssignments = scanner.nextInt();
        int[] assignmentScores = new int[numAssignments];
        double totalScore = 0.0;
        for (int i = 0; i < numAssignments; i++) {
            assignmentScores[i] = scanner.nextInt();
            totalScore += assignmentScores[i];
        }
        double averageScore = totalScore / numAssignments;

        // read the scores for the midterm and final exams
        int midtermScore = scanner.nextInt();
        int finalScore = scanner.nextInt();

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
        System.out.println("Total score: " + totalScore);
        System.out.println("Letter grade: " + letterGrade);
    }
}
