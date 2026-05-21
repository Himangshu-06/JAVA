public class Array_35 {
    public static void main(String[] args){
   /*3*/     int[] marks = {10,20,30,40,50};
        marks[2]=80; //overwriting
//        System.out.println(marks[2]);

//         There are three main ways to create an array in Java
//        1.  int [] marks= new int[10];
//        2.  int [] marks;
//        marks=new int[5];
        String[] hello= {"Hello", "Hi", "Bonjour"};
        System.out.println(hello[1]);

//        To displaying the array
//        for (int a=0;a<marks.length;a++){
//            System.out.println(marks[a]);
//        }

//        Quick Quiz - Array in reverse order ?
//        for (int b=marks.length-1;b>=0;b--){
//            System.out.println(marks[b]);
//        }

//        Displaying elements using for-each loop (Advance for)
        for (int var: marks){
            System.out.println(var);
        }

    }
}
