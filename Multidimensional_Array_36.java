public class Multidimensional_Array_36 {
    public static void main(String [] args){
//         1D Array
        int[] oneD ={1,2,3};

//         2D Array;
        int[][] twoD =  {{1,2,3},{4,5,6},{7,8,9}};
        twoD[0][1]=200; // To Access or replace elements (Hint: It's like Matrix)

        for (int[] outer : twoD){
            for (int inner: outer){
                System.out.print(inner +" ");
            }
            System.out.println();
        }
    }
}
