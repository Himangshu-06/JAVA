//
public class PS_ch7_41 {
//    Create a Java method to print multiplication table of number n ?
    static void multiply(int n) {
        for (int a = 0; a <= 10; a++) {
            System.out.printf("%d x %d: %d \n", n, a, n * a);
        }
    }
    public static void main(String[] args) {
        multiply(3);
    }
}
