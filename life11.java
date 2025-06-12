//Write a java program to encrypt a grade by adding 8 to it. Decrypt it to Show the correct grade
public class life11 {
    public static void main(String[] args) {
        //Q 1. What will be the value of the following expression
        // n(x) ?
//        float a = (7/4.0f)*(9/2.0f);
//        System.out.println(a);

        char grade = 'B';
        grade = (char)(grade+8);
        System.out.println(grade);
        //Decrypting the grade:-
        grade = (char) (grade-8);
        System.out.println(grade);

        //Simplified version:-
                // Original grade (a single character)
//                char originalGrade = 'B'; // Example grade
//
//                // Encrypt the grade by adding 8 to its ASCII value
//                char encryptedGrade = (char) (originalGrade + 8);
//
//                // Decrypt the grade by subtracting 8 from the encrypted ASCII value
//                char decryptedGrade = (char) (encryptedGrade - 8);
//
//                // Display results
//                System.out.println("Original Grade: " + originalGrade);
//                System.out.println("Encrypted Grade: " + encryptedGrade);
//                System.out.println("Decrypted Grade: " + decryptedGrade);
            }
        }
