
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

    static int sum(int n){
        if(n==1) return 1;
        return n+sum(n-1);
    }
    public static void main(String[] args) {
//        multiply(3);

//        star(4);

        System.out.println("Sum of the first n natural number is: " +sum(4));
    }
}
