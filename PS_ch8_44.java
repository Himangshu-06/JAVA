/*      Q1. Create a class employee with following properties and methods:
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

//      Q2. Create a class cellphone with methods to print "ringing", "vibrating"...etc.
//class cellphone{
//    public void ring(){
//        System.out.println("Phone is ringing");
//    }
//    public void vibrate(){
//        System.out.println("Phone is vibrating");
//    }
//}

//      Q3. Create a class square with a method to initialize it's side, calculating area, perimeter etc.
//class square{
//    int side;
//
//    public int area(){
//        return side*side;
//    }
//    public int perimeter(){
//        return 4*side;
//    }
//}

//      Q4. Create a class rectangle & repeat Q3
class rectangle{
    int length;
    int width;
    public int area(){
        return length*width;
    }
    public int perimeter(){
        return 2*(length+width);
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
//        cellphone phone = new cellphone();
//        phone.ring();
//        phone.vibrate();

//        Q3.
//        square calculate = new square();
//        calculate.side = 5;
//        System.out.println("Area of the square is: " +calculate.area());
//        System.out.println("Perimeter of the square is: " +calculate.perimeter());

//        Q4.
        rectangle calculate1 = new rectangle();
        calculate1.length = 4;
        calculate1.width = 3;
        System.out.println("Area of the rectangle: " +calculate1.area());
        System.out.println("Perimeter of the rectangle is: " +calculate1.perimeter());
    }
}
