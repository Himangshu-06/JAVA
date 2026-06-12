class students{
    String name;
    int roll;
    int marks;
    public void details(){
        System.out.println("Name: "+name);
        System.out.println("Roll no: "+ roll);
    }
    public int getMarks(){
        return marks;
    }
}
public class Custom_class_43 {
    public static void main(String[] args) {
        students himangshu = new students();
        students ram = new students();

        himangshu.name = "Himangshu";
        himangshu.roll = 10;
        himangshu.details();

        ram.name = "Ram";
        ram.roll = 5;
        ram.details();

        himangshu.marks = 99;
        System.out.println("Marks: " +himangshu.getMarks());
    }
}
