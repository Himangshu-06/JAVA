
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
//    Better way to do Q2.

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

//    alternate way to do this:
//static int fib(int n) {
//        /* if(n==1){
//            return 0;
//        }
//        else if(n==2){
//            return 1;
//        } */
//    if (n == 1 || n == 2) {
//        return n - 1;
//    } else {
//        return fib(n - 1) + fib(n - 2);
//    }
//}

//    Q6. Function to find average of a set of numbers passed as arguments ?
//    static double average(double ...arr){
//        double sum =0;
//        if (arr.length == 0) return 0;
//        for (double num : arr){
//            sum+= num;
//        }
//        return sum/arr.length;
//
//    }

    //    Q7. Repeat Q4 using recursion ?
//    static void repeat(int a) {
//        if (a!=0){
//            for (int b=a; b>=1; b--){
//                System.out.print("*");
//            }
//            System.out.println();
//            repeat(a-1);
//        }
//    }

//    Q9. Function to convert Celsius temperature to Fahrenheit.
//    static double temp(double a){
//           Formula: (1°C × 9/5) + 32 = 33.8°F
//           return (a*(9.0/5))+32;
//
//    }

//    Q10. Repeat Q3 using Iterative approach ?
    static int sum(int a){
        int c = 0;
        for (int b=1; b<=a; b++){
            c+=b;
        }
        return c;
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
//        System.out.println("Fibonacci number is: "+fibonacci(5));
//        int result = fib(7);
//         System.out.println(result);

//        Q6:
//        double[] x ={12.0,23.0,34.0,45.0,56.0,67.0,78.0,60.0,99.0};
//        System.out.printf("Average of the given Array is: %.2f ",average(x));
        
//        Q7:
//        repeat(4);

//        Q8:
//        int celcius =4;
//        System.out.printf("%d degree Celsius in Fahrenheit is: %.2f %n", celcius,temp(celcius));

//        Q9:
        System.out.println("Sum of first n natural numbers is: "+sum(4));

    }
}
