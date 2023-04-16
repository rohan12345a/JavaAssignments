package Assignment6;

public class MallardDuck extends Duck{
    MallardDuck(){
        flyBehavior=new FlyWithWings();
        quackBehavior=new Quack();
        swimBehaviour=new Swim();
    }
    @Override
    void display() {
        System.out.println("I am Mallard Duck .........");

    }
}
