public class Variable_Arguments_39 {
    static int arr(int ...arr){
        int a= 0;
        for (int var : arr){
            a+=var;
        }
        return a;
    }

    public static void main(String[] args) {

//        Varargs - The int ...arr syntax allows the method to accept any number of int arguments without creating an array manually.

        System.out.println("Add nothing: "+arr());
        System.out.println("Add 1,2,3,4: "+arr(1,2,3,4));
        System.out.println("Add 10: " +arr(10));
    }
}
