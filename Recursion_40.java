public class Recursion_40 {
    public static void main(String[] args) {
        int n = 5;
        for (int a=n; a>1; a--){
            if (a!=0){
                a=n*(n-1);
            }
            System.out.println(a);
        }
    }
}
