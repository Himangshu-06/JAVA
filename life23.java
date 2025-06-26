// Demonstration of logical operators:-

import java.util.Scanner;

public class life23 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number(n1): ");
        int a = obj.nextInt();
        System.out.print("Enter another number(n2): ");
        int b = obj.nextInt();
        obj.close();
        boolean c = (a > 10); // true if n1 > 10, else false
        boolean d = (b > 10); // true if n2 > 10, else false


        // Long method(not recommended)
//        boolean c,d;
//        if (a > 10) {
//             c = true;
//            System.out.println(c);
//        } else {
//             c = false;
//            System.out.println(c);
//            }
//            if (b > 10) {
//                 d = true;
//                System.out.println(d);
//            } else {
//                 d = false;
//                System.out.println(d);
//            }

//         Logical AND:- Evaluate to true if both conditions are true
        if (c && d) {
            System.out.println("Both numbers are greater than 10");
        } else {
            System.out.println("At least one number is less than or equal to 10");
        }

//        Logical OR:- Evaluates to true if at least one of the conditions is true
        if (c || d) {
            System.out.println("At least one number is greater than 10");
        } else {
            System.out.println("Both numbers are less than or equal to 10");
        }

//         Logical NOT:- Negates the given logic. Basically, if the condition is false, the operation returns true
//         and when the condition is true, the operation returns false.
        if (!c) {
            System.out.println("n1 is less than or equal to 10");
        } else {
            System.out.println("n1 is greater than 10");
        }
        if (!d) {
            System.out.println("n2 is less than or equal to 10");
        } else {
            System.out.println("n2 is greater than 10");
        }
    }
}


