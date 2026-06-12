/* Q1. Create a class employee with following properties and methods:
    salary(property)(int)
    getSalary(method) (returning int)
    name (property)(int)
    getName(method)(returning String)
    setName(method)(changing name)
 */
//class employee{
//    int salary;
//    String name;
//
//    public int getSalary(){
//        return salary;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setName(String n){
//        name = n;
//    }
//}

//        Q2. Create a class cellphone with methods to print "ringing", "vibrating"...etc.
class cellphone{
    public void ring(){
        System.out.println("Phone is ringing");
    }
    public void vibrate(){
        System.out.println("Phone is vibrating");
    }
}

public class PS_ch8_44 {
    public static void main(String[] args) {

//        Q1.
//        employee identity = new employee();
//
//        identity.salary = 24;
//        System.out.printf("Salary: %d LPA%n",identity.getSalary());
//        identity.setName("Himangshu");
//        System.out.println("Name: "+identity.getName());

//        Q2.
        cellphone phone = new cellphone();
        phone.ring();
        phone.vibrate();
    }
}
