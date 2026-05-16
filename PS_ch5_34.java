public class PS_ch5_34 {
    public static void main(String[] args){

//        Q1. To print the following pattern: ****
//                                            ***
//                                            **
//                                            *

//        for (int i = 4; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Q2. sum first n even numbers using while loop

        int no = 5;
        int j = 0;
        while(j<no){
            j++;
            int even = 2*j;

            int add = even+no;
            System.out.println(add);
        }

//       int a=10;
//       int b=a%2;
//        while (b!=0){
//            a+=2;
//            System.out.println(a);
//        }

//        int i = 0;
//        int n=5;
//        int sum=0;
//        while(i<n){
//            i++;
//            sum=sum+(2*i);
//        }
//        System.out.print("Sum of even numbers: ");
//        System.out.print(sum);
    }
}
