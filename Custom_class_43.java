class students{
    String name;
    int roll;

    public void details(){
        System.out.println("Name: "+name);
        System.out.println("Roll no: "+ roll);
    }
}
public class Custom_class_43 {
    public static void main(String[] args) {
        students himangshu = new students();

        himangshu.name = "Himangshu";
        himangshu.roll = 10;
        himangshu.details();
    }
}
