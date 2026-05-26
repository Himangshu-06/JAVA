public class Method_overloading_39 {
    static void change1(int a){
        a=100;
    }
    static void change2(int[] arr){
        arr[5]=100;
    }
//    Void return type - When we don't want our method to return anything we use void as the return type.
    static void sayHello(){
        System.out.println("bonjour mon ami");
    }
    public static void main(String[] args){

//        Case 1: Pass by value
        int z =10;
        change1(z);
        System.out.println(z);
        sayHello();

//        Pass by reference
        int[] arr = {1,2,3,4,5,6};
        change2(arr);
        System.out.println(arr[5]);

        /* * Pass by value — a copy of the actual data is passed to the method. Whatever the method does with it, the original variable remains unaffected.
           * Pass by reference — the memory address of the actual data is passed to the method. The method goes to that location and works on the original data directly, so changes are reflected outside the method too.
           * Note -  Pure pass by reference doesn't exist in Java. Java only does pass by value. For primitives the value is the data itself, for arrays and objects the value is the memory address. */
    }
}