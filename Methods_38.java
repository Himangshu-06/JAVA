// A Method is a function written inside a class.

public class Methods_38 {
    static int sum(int a, int b){
        int c;
        c=a*b;
        return c;
    }
    public static void main(String[] args){
//        Creating an object to call a Method
//        Methods_38 obj= new Methods_38();
//        This works for non-static methods
        int x= 10;
        int y=20;
        int u;
//         u= obj.sum(x,y);
        u= sum(x,y);
        System.out.println(u);

/*       The values from the method call (a and b) are copied tp the a and b of the function of sum Thus even if we modify the values a and b inside the method, the values in the main method will not change */

    }
}