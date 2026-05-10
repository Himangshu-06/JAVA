import java.util.Scanner;
public class Loops_32 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        obj.close();
//        While Loop:
//        int i  = 99;
//        while(i<200){
//            i++;
//            System.out.println(i);
//        }

//        Do-While Loop:
//        int b = 1;
//        int n = 10;
//        do{
//            System.out.println(b++);
//        }while (b<=n);

//        For Loop:
//           First n odd numbers
//        for(int a=1;a<=20;a+=2){
//            System.out.println(a);
//        }

        //Or
//         2i = Even Numbers = 0, 2, 4, 6, 8
//         2i+1 = Odd Numbers = 1, 3, 5, 7, 9
//        int n = 10;
//        for (int i =0; i<n; i++) {
//            System.out.println(2 * i + 1);
//        }
//        }
//        Q. First n natural number in reverse order
        for(int i=15; i>=0; i--){
            System.out.println(i);
        }
    }
}