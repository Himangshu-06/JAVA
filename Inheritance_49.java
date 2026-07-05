// Quick quiz: Create a Class Animal and Derive another class Dog from it.
class Animal{
    private int noOfLegs;
    private boolean canFly;

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}

class Dog extends Animal{
    private boolean bark;
    private boolean walk;

    public boolean getBark() {
        return bark;
    }

    public void setBark(boolean bark) {
        this.bark = bark;
    }

    public boolean getWalk() {
        return walk;
    }

    public void setWalk(boolean walk) {
        this.walk = walk;
    }
}
public class Inheritance_49 {
    public static void main(String[] args) {
        Animal specs = new Animal();
        Dog attr = new Dog();

        attr.setNoOfLegs(4);
        System.out.println("No of legs: " +attr.getNoOfLegs());
        attr.setCanFly(false);
        System.out.println("Can fly ? " +attr.getCanFly());
        attr.setBark(true);
        System.out.println("Does bark: "+attr.getBark());
        attr.setWalk(true);
        System.out.println("Walk on foot? " +attr.getWalk());
    }
}
