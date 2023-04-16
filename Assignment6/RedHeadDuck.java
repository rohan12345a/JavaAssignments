package Assignment6;

public class RedHeadDuck extends Duck{
    RedHeadDuck(){
        flyBehavior= new FlyWithWings();
        quackBehavior=new Quack();
        swimBehaviour=new Swim();
    }

    @Override
    void display() {
        System.out.println("I am Redhead Duck .......");
    }
}