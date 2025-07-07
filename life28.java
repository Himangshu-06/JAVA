import java.util.Scanner;

public class life28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants for pass criteria
        final double TOTAL_PASS_PERCENTAGE = 40.0;
        final double SUBJECT_PASS_PERCENTAGE = 33.0;
        final int MAX_MARKS_PER_SUBJECT = 100;
        final int NUMBER_OF_SUBJECTS = 3;

        // Variables to store marks
        int subject1, subject2, subject3;
        int totalMarks, maxTotalMarks;
        double totalPercentage;
        boolean passInAllSubjects = true;

        System.out.println("=== Student Pass/Fail Checker ===");
        System.out.println("Enter marks for 3 subjects (out of 100 each):");

        // Input marks for each subject
        System.out.print("Enter marks for Subject 1: ");
        subject1 = scanner.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        subject2 = scanner.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        subject3 = scanner.nextInt();

        // Calculate total marks and percentage
        totalMarks = subject1 + subject2 + subject3;
        maxTotalMarks = MAX_MARKS_PER_SUBJECT * NUMBER_OF_SUBJECTS;
        totalPercentage = (double) totalMarks / maxTotalMarks * 100;

        // Calculate individual subject percentages
        double subject1Percentage = (double) subject1 / MAX_MARKS_PER_SUBJECT * 100;
        double subject2Percentage = (double) subject2 / MAX_MARKS_PER_SUBJECT * 100;
        double subject3Percentage = (double) subject3 / MAX_MARKS_PER_SUBJECT * 100;

        // Display results
        System.out.println("\n=== RESULT SUMMARY ===");
        System.out.println("Subject 1: " + subject1 + "/100 (" + String.format("%.2f", subject1Percentage) + "%)");
        System.out.println("Subject 2: " + subject2 + "/100 (" + String.format("%.2f", subject2Percentage) + "%)");
        System.out.println("Subject 3: " + subject3 + "/100 (" + String.format("%.2f", subject3Percentage) + "%)");
        System.out.println("Total Marks: " + totalMarks + "/" + maxTotalMarks);
        System.out.println("Overall Percentage: " + String.format("%.2f", totalPercentage) + "%");

        // Check individual subject pass criteria
        System.out.println("\n=== INDIVIDUAL SUBJECT STATUS ===");
        if (subject1Percentage >= SUBJECT_PASS_PERCENTAGE) {
            System.out.println("Subject 1: PASS");
        } else {
            System.out.println("Subject 1: FAIL (Need " + SUBJECT_PASS_PERCENTAGE + "%, got " + String.format("%.2f", subject1Percentage) + "%)");
            passInAllSubjects = false;
        }

        if (subject2Percentage >= SUBJECT_PASS_PERCENTAGE) {
            System.out.println("Subject 2: PASS");
        } else {
            System.out.println("Subject 2: FAIL (Need " + SUBJECT_PASS_PERCENTAGE + "%, got " + String.format("%.2f", subject2Percentage) + "%)");
            passInAllSubjects = false;
        }

        if (subject3Percentage >= SUBJECT_PASS_PERCENTAGE) {
            System.out.println("Subject 3: PASS");
        } else {
            System.out.println("Subject 3: FAIL (Need " + SUBJECT_PASS_PERCENTAGE + "%, got " + String.format("%.2f", subject3Percentage) + "%)");
            passInAllSubjects = false;
        }

        // Final pass/fail decision
        System.out.println("\n=== FINAL RESULT ===");
        if (totalPercentage >= TOTAL_PASS_PERCENTAGE && passInAllSubjects) {
            System.out.println("🎉 CONGRATULATIONS! STUDENT HAS PASSED!");
            System.out.println("✓ Total percentage: " + String.format("%.2f", totalPercentage) + "% (Required: " + TOTAL_PASS_PERCENTAGE + "%)");
            System.out.println("✓ All subjects passed individually");
        } else {
            System.out.println("❌ STUDENT HAS FAILED!");

            if (totalPercentage < TOTAL_PASS_PERCENTAGE) {
                System.out.println("✗ Total percentage: " + String.format("%.2f", totalPercentage) + "% (Required: " + TOTAL_PASS_PERCENTAGE + "%)");
            }

            if (!passInAllSubjects) {
                System.out.println("✗ Failed in one or more individual subjects (Required: " + SUBJECT_PASS_PERCENTAGE + "% in each)");
            }
        }

        scanner.close();
    }
}