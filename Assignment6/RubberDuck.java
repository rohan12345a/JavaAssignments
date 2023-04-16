package Assignment6;

public class RubberDuck extends Duck{
    RubberDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new Squeak();
        swimBehaviour=new Float();
    }
    @Override
    void display() {
        System.out.println("I am Rubber Ducky..");
    }
}
