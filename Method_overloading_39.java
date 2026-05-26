public class Method_overloading_39 {
//    Void return type - When we don't want our method to return anything we use void as the return type.
    static void sayHello(){
        System.out.println("bonjour mon ami");
    }
    public static void main(String[] args){
        sayHello();

        /*        * Pass by value — a copy of the actual data is passed to the method. Whatever the method does with it, the original varia
                  * Pass by reference — the memory address of the actual data is passed to the method. The method goes to that location and works on the original data directly, so changes are reflected outside the method too.
             * Note -  Pure pass by reference doesn't exist in Java. Java only does pass by value. For primitives the value is the data itself, for arrays and objects the value is the memory address.*/
    }
}