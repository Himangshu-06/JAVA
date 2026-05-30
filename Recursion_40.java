public class Recursion_40 {
    static int factorial(int a){
        if (a==0 || a==1){
            return a;
        }else {
            return a * factorial( a -1);
        }
    }
    public static void main(String[] args) {
        int z = 3;
        System.out.printf("The factorial of %d is: %d" ,z ,factorial(z));
    }
}
