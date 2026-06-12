class employee{
    int salary;
    String name;
    String newName;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public String changeName(){
        name = newName;
        return name;
    }
}
public class PS_ch8_42 {
    public static void main(String[] args) {
        employee himangshu = new employee();

        himangshu.salary = 24;
        System.out.println("Salary: "+himangshu.getSalary());
        himangshu.name = "Himangshu";
        System.out.println("Name: "+himangshu.getName());
        himangshu.newName = "John Doe";
        System.out.println("New name: "+himangshu.changeName());
    }
}
