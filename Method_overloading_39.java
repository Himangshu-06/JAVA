public class Method_overloading_39 {
    static void change1(int a){
        a=100;
    }
    static void change2(int[] arr){
        arr[5]=100;
    }

//    Method Overloading-
    static void say(){
        System.out.println("I don't know what to write");
    }

    static void say(String a){
        System.out.println("Say something " +a);
    }

    static void say(String a, String b){
        System.out.println("I'm " +a+ " I'm learning " +b);
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

  /*      Method Overloading-
        Two or more methods with SAME NAME, but with DIFFERENT PARAMETERS. */

        say();
        say("you idiot");
        say("Himangshu", "java");

//        Note - Method overloading can't be performed by changing the return type of method.

        /*  * Parameter - A parameter is a variable listed in the declaration of a method or function. It acts as a placeholder for the value that will be passed to the method when it is called.
            * Argument - An argument is the actual value (or expression) passed to a method or function when it is called. It replaces the corresponding parameter in the method.
                   Arguments are ACTUAL.

            * Placeholder - A placeholder is a temporary symbol, variable, or space that represents something else and will be replaced with actual data or a real value later.*/
    }
}