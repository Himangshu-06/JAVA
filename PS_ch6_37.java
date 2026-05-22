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

//        double a= 0;
//        int[] marks = {99,32,54,45,12,54};
//        for (int var : marks){
//            a= a+var;
//        }
//        System.out.printf("Average marks: %.2f" ,a/marks.length);

//        Q4. To add two matrices of size 2*3 ?

//        int[][] num1 = {{1,2,3},
//                        {1,2,3}};
//        int[][] num2= {{2,3,3},
//                      {3,4,5}};
//        int[][] result ={{0,0,0},
//                    {0,0,0}};
//        for (int a=0; a<num1.length; a++){
//            for (int b=0; b<num1[a].length;b++){
//                result[a][b]=num1[a][b]+num2[a][b];
//                System.out.print(result[a][b] +" ");
//            }
//            System.out.println();
//        }

//        Other way to do it-

//                int[][] matrix1 = {{1, 2, 3},
//                        {4, 5, 6}};
//
//                int[][] matrix2 = {{7, 8, 9},
//                        {10, 11, 12}};
//
//                int[][] result = new int[2][3];
//
//                for (int i = 0; i < 2; i++) {
//                    for (int j = 0; j < 3; j++) {
//                        result[i][j] = matrix1[i][j] + matrix2[i][j];
//                    }
//                }
//
//                for (int[] row : result) {
//                    for (int var : row) {
//                        System.out.print(var + " ");
//                    }
//                    System.out.println();
//                }

//        Q5. Program to reverse an array ?

        String[] fruit ={"Apple","Banana","Mango","Dragon fruit"};
        for (int a=fruit.length-1; a>=0; a--){
            System.out.println(fruit[a]);
        }

    }
}
