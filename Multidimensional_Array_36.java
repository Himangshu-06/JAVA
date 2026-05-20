public class Multidimensional_Array_36 {
    public static void main(String [] args){
        int[] one ={1,2,3}; // 1D Array
        int[][] two=  {{1,2,3},{4,5,6},{7,8,9}}; // 2D Array;
        for (int a=0;a<two.length;a++){
            System.out.println(a);
            for (int b=0; b<two[a].length; b++){
                System.out.print(two[a][b] +" ");

            }
        }
    }
}
