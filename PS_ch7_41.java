
public class PS_ch7_41 {
//   Q1. Create a Java method to print multiplication table of number n ?
//    static void multiply(int n) {
//        for (int a = 0; a <= 10; a++) {
//            System.out.printf("%d x %d: %d \n", n, a, n * a);
//        }
//    }

//        Q2. Function t print the following pattern ****
//                                                   ***
//                                                   **
//                                                   *

    static void star(int a, int b){
        for (a=0;a>b;a++){
            for (b=0;b<a;b--){
                System.out.println("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        multiply(3);

        star(4,3);
    }
}
