class Car{

    public void OilCar(){
        System.out.println("A Oil powered car run by an combustion Engine");
    }
    public void electricCar(){
        System.out.println("An Electric vehicle runs on battery and motor");
    }
}
class Tesla extends Car{
    @Override
    public void electricCar(){
        System.out.println("Electric vehicle runs on battery so it do low carbon emission");
    }
}
public class Dynamic_dispatch_53{
    public static void main(String[] args){
        Bird a = new Bird();
        a.legs();

        Fish b = new Fish();
        b.legs();
    }
}
