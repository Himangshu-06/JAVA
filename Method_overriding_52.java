class Bird{

    public void legs(){
        System.out.println("A Bird has two legs");
    }
    public void eye(){
        System.out.println("A Bird has two eyes");
    }
}
class Fish extends Bird{
    @Override
    public void legs(){
        System.out.println("A Fish doesn't have legs");
    }
}
public class Method_overriding_52 {
    public static void main(String[] args){
        Bird a = new Bird();
        a.legs();

        Fish b = new Fish();
        b.legs();
    }
}
