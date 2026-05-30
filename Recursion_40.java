public class Recursion_40 {
//    Find factorial of a number using recursion

//    static int factorial(int a){
//        if (a==0 || a==1){
//            return a;
//        }else {
//            return a * factorial( a -1);
//        }
//    }

//            Write a recursive function to calculate the sum of the first n natural numbers.

//    static int sum(int n){
//        if(n==0){
//            return 0;
//        }else {
//            return n + sum(n - 1);
//        }
//    }

//         Fibonacci series

    static int fibonacci(int a){
        if (a==0){
            return 0;
        } if (a==1){
            return 1;
        }else {
            return fibonacci(a - 1) + fibonacci(a - 2);
        }
    }

    public static void main(String[] args) {
//        int z = 3;
//        System.out.printf("The factorial of %d is: %d" ,z ,factorial(z));

//        int a = 4;
//        System.out.println("Sum of first "+a+" number is: " + sum(a));

        System.out.println("Fibonacci number is: " +fibonacci(6));
    }
}
