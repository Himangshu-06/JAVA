// Demonstration of switch statement:-
//vid 18
import java.util.Scanner;
public class life25 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        switch (a % 2) {
            case (0): {
                System.out.println("Even");
                break;
            }
            //  Alternatively, you can use case (1) [shown below], but keep in mind that it doesn't handle negative numbers.
//            case (1): {
//                System.out.println("odd");
//                break;
//            }

            default: {
                System.out.println("odd");
            }


        }
    }
}