// Demonstration of switch statement:-
//vid 18
// Q: Write a program to check Even or Odd number using switch case ?

import java.util.Scanner;

public class life25 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = obj.nextInt();
        switch (a % 2) {
            case (0): {
                System.out.println("Even");
                break;
            }
//      Alternatively, you can use case (1) [shown below], but keep in mind that it doesn't handle negative numbers.
//            case (1): {
//                System.out.println("odd");
//                break;
//            }

            default: {
                System.out.println("odd");
            }
        }
//        Demonstration of enhanced switch statements

        char z = 'b';
        switch (a) {
            case 'b':
                System.out.println("Hello");
                break;
            case 'c':
                System.out.println("Hi");
                break;
            case 'd':
                System.out.println("Hey");
                break;
            case 'e':
                System.out.println("Hola");
                break;
        }

//        Enhance switch: -
//        switch (a) {
//            case 'b' -> System.out.println("Hello");
//            case 'c' -> System.out.println("Hi");
//            case 'd' -> System.out.println("Hey");
//            case 'e' -> System.out.println("Hola");
//        }
    }
}