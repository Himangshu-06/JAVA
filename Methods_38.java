// A Method is a function written inside a class.

public class Methods_38 {
     static int sum(int a, int b){
        int c;
        c=a*b;
        return c;
    }
    public static void main(String[] args){
//         Creating an object to call a Method
//        Methods_38 obj= new Methods_38();
//        This works for non-static methods
        int x= 10;
        int y=20;
        int u;
        u=sum(x,y);
//        u= obj.sum(x,y);
        System.out.println(u);
    }
}