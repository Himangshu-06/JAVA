import java.util.Scanner;
public class PS_ch6_37 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
//        Q1. 5 floats and their sum
//        float[] a= {0f};
//        float[] arr = {1.5f, 2.5f,3.5f,4.5f,5.5f};
//        for (float plus : var){
//            System.out.println(plus);
//             var=a;
//            ;
//        float sum = 0f;
//        for (int a=0; a<var.length; a++){
//            sum= sum+var[a];
//            System.out.println(sum);
//        }

//        Or (Using Enhance for/ for each loop)
//        float sum =0;
//        for (float var: arr){
//            sum+=var;
//            System.out.println(sum);

//            Q2. to find out whether an integer is present in an array or not ?
//        System.out.print("Enter a number to check: ");
//        int b= sc.nextInt();
//        sc.close();
//        int[] array ={1,2,3,4,5};
//        boolean found = false;
//        for (int var : array){
//
//            if (var==b){
//                found= true;
//                break;
//            }
//        }
//        if (found){
//            System.out.println("The number is present");
//        }else {
//            System.out.println("The number is not present");
//        }

//        Q3. Average marks from an array containing marks of all student using for-each loop ?

        double a= 0;
        int[] marks = {99,32,54,45,12,54};
        for (int var : marks){
            a= a+var;
        }
        System.out.printf("Average marks: %.2f" ,a/marks.length);
    }
}
