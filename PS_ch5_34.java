public class PS_ch5_34 {
    public static void main(String[] args){

//        Q1. To print the following pattern: ****
//                                            ***
//                                            **
//                                            *

        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
