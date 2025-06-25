// Demonstration of logical operators:-
import java.util.Scanner;
public class life23 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = obj.nextInt();
        System.out.print("Enter another number: ");
        int b = obj.nextInt();
//        boolean c,d;
//        if (a > 10) {
//             c = true;
//            System.out.println(c);
//        } else {
//             c = false;
//            System.out.println(c);
//    }
//            if (b > 10) {
//                 d = true;
//                System.out.println(d);
//            } else {
//                 d = false;
//                System.out.println(d);
//            }
        boolean c = (a > 10);
        boolean d = (b > 10);
        if (c && d) {
            System.out.println("Both numbers are greater than 10");
        } else {
            System.out.println("At least one number is less than or equal to 10");
        }
        obj.close();
    }
}


