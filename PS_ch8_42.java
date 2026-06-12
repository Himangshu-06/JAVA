class employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public String setName(String n){
        name = n;
        return name;
    }
}
public class PS_ch8_42 {
    public static void main(String[] args) {
        employee identity = new employee();

        identity.salary = 24;
        System.out.printf("Salary: %d LPA%n",identity.getSalary());
        identity.setName("Himangshu");
        System.out.println("Name: "+identity.getName());

    }
}
