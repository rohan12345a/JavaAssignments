package Assignment6;

public class DecoyDuck extends Duck{
    DecoyDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new MuteQuack();
        swimBehaviour=new Drown();
    }
    @Override
    void display() {
        System.out.println("I am Decoy Duck");
    }

}
