public class PS_ch5_34 {
    public static void main(String[] args){

//        Q1. To print the following pattern: ****
//                                            ***
//                                            **
//                                            *

        for(int i=4;i>=0;i--){
                System.out.println("*");
                for (int b=1;b>=i;b--){
                    System.out.println("*");
                }
        }
    }
}
