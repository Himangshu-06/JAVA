//Write a program to calculate CGPA of a student based on marks in three subject (out of 100).
import java.util.Scanner;
public class life4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your 1st subject marks: ");
        int a = obj.nextInt();
        System.out.println("Enter you 2nd subject marks: ");
        int b = obj.nextInt();
        System.out.println("Enter your 3rd subject marks: ");
        int c = obj.nextInt();
        float d = a / 10f;
        float e = b / 10f;
        float f = c / 10f;
        float sum = d + e + f;
        float CGPA = sum / 3F;
        System.out.println("Your CGPA is: " + CGPA);
    }
}
        //Optimized version:-
//        import java.util.Scanner;
//        public class life4 {
//            public static void main(String[] args) {
//                Scanner sc = new Scanner(System.in);
//
//                System.out.print("Enter marks for 3 subjects (out of 100): ");
//                float subject1 = sc.nextFloat();
//                float subject2 = sc.nextFloat();
//                float subject3 = sc.nextFloat();
//
//                sc.close(); // Close Scanner early to free memory
//
//                // Directly calculate CGPA without extra variables
//                float cgpa = (subject1 + subject2 + subject3) / (3 * 10);
//
//                System.out.println("Your CGPA is: " + cgpa);
//            }
//        }



