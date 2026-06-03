
public class PS_ch7_41 {
//   Q1. Create a Java method to print multiplication table of number n ?
//    static void multiply(int n) {
//        for (int a = 0; a <= 10; a++) {
//            System.out.printf("%d x %d: %d \n", n, a, n * a);
//        }
//    }

//        Q2. Function t print the following pattern *
//                                                   **
//                                                   ***
//                                                   ****

//    static void star(int n){
//        for (int a=1;a<=n;a++){
//            for (int b=0;b<a;b++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    Better wa to do Q2.

//static void star(int n) {
//    for (int a = 1; a <= n; a++) {
//        System.out.println("*".repeat(a));
//    }
//}
//        Q3. Recursive function to calculate sum of first n natural numbers.

//    static int sum(int n){
//        if(n==1) return 1;
//        return n+sum(n-1);
//    }

//    Q4. Function to print the following pattern:****
//                                                ***
//                                                **
//                                                *

//    static void starInverted(int a){
//       for (int b=a;b>=1;b--){
//           System.out.println("*".repeat(b));
//       }
//        System.out.println();
//    }

//    Q5. Function to print nth term of Fibonacci series using recursion ?

//    static int fibonacci(int a){
//        if(a==0) return 0;
//        if(a==1) return 1;
//        return fibonacci(a-1)+fibonacci(a-2);
//    }

//    Q6. Function to find average of a set of numbers passed as arguments ?
    static int average(int ...arr){
        int sum =0;
        for (int a =0; a<arr.length; a++){
            if (arr.length == 0) return 0;
            return (sum+=a)/2;

        }

    }
    public static void main(String[] args) {

//        Q1:
//        multiply(3);

//        Q2:
//        star(4);

//        Q3:
//        System.out.println("Sum of the first n natural number is: " +sum(4));

//        Q4:
//        starInverted(4);

//        Q5:
//        System.out.println("Fibonacci number is: "+fibonacci(7));

//        Q6:
        int[] x ={12,23,34,45,56,67,78};

    }
}
