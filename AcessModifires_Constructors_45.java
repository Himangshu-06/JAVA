//        Access Modifiers - Specify where a property/method is accessible. There are four types of access modifiers in java :
//        1. private
//        2. default
//        3. protected
//        4. public

//        Getter - Method that make a field readable.
//        Setter - Method that make a field writeable.
//        They help to protect object data and rules for accessing or modifying them.

class student{
    private String name;
    private int roll;

    public void setName(String a){
        name =a;
    }
    public String  getName(){
        return name;
    }

    public void setRoll(int b){
        roll = b;
    }
    public int getRoll(){
        return roll;
    }
}
public class AcessModifires_Constructors_45 {
    public static void main(String[] args) {
        student details = new student();

        details.setName("Himangshu");
        System.out.println("My name is "+ details.getName());
        details.setRoll(5);
        System.out.println("My roll no is "+details.getRoll());
    }
}
