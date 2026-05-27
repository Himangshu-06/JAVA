public class Variable_Arguments_39 {
//    static int arr(int ...arr){
//        int a= 0;
//        for (int var : arr){
//            a+=var;
//        }
//        return a;
//    }

    static int arr(int x, int ...arr){
        int a= x;
        for (int var : arr){
            a+=var;
        }
        return a;
    }

    public static void main(String[] args) {
//        Varargs - The int ...arr syntax allows the method to accept any number of int arguments without creating an array manually.

//        System.out.println("Add nothing: "+arr());
//        System.out.println("Add 1,2,3,4: "+arr(1,2,3,4));
//        System.out.println("Add 10: " +arr(10));

//          If we want at least one parameter to be compulsory
/* Key Rules:
    1. Varargs MUST be the LAST parameter
    2. Can have multiple regular parameters BEFORE varargs
    3. Only ONE varargs parameter per method. */
        System.out.println("Add two numbers: "+arr(10,50));
        System.out.println("Add more then two numbers with one number compulsory: "+arr(20,20,30,40));
    }
}