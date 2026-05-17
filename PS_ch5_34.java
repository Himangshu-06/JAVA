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

//        int no = 5;
//        int j = 0;
//        while(j<no){
//            j++;
//            int even = 2*j;
//
//            int add = even+no;
//            System.out.println(add);
//        }

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

//        Q2. Sum first n even numbers using while loop


//        Q3. Multiplication table for a given number n

//        int n=5;
//        int c=0;
//        for (int a=0;a<=10;a++){
//            int b= c*n;
//            c++;
//            System.out.println(b);
//        }

//        Q4. Multiplication table of 10 in reverse order
//        int n =9;
//        for (int x= 10;x>=1;x--){
//            int y = n *x;
//            System.out.println(y);
//        }

//        Q5. Factorial of a given number using for loop

        int n = 4;
        int c= 1;
        for (int a =1;a<=n;a++){
            c*=a;                 //CONCENTRATE HERE MAN
            System.out.println(c);
        }
    }
}
