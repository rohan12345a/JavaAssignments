package Assignment6;

public abstract class Duck {
    FlyBehaviour flyBehavior;
    QuackBehaviour quackBehavior;
    SwimBehaviour swimBehaviour;

    abstract void display();

    public void setFlyBehavior(FlyBehaviour fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehaviour qb) {
        quackBehavior = qb;
    }
    public void  setSwimBehavior(SwimBehaviour sb){
        swimBehaviour=sb;

    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void performSwim(){
        swimBehaviour.swim();
    }



}
