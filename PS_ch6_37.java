public class PS_ch6_37 {
    public static void main(String[] args){

//        Q1. 5 floats and their sum
//        float[] a= {0f};
        float[] var = {1.5f, 2.5f,3.5f,4.5f,5.5f};
//        for (float plus : var){
//            System.out.println(plus);
//             var=a;
//            ;
        float sum = 0f;
        for (int a=0; a<var.length; a++){
            sum= sum+var[a];
            System.out.println(sum);

        }
    }
}
