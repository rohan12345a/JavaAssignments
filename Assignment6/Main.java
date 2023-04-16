package Assignment6;

public class Main {
    public static void main(String[] args) {
       System.out.println("The all Duck Behaviours are as Follows: "); 
        
       
        System.out.println("\n Mallard Duck :\n");
        MallardDuck mallardDuck=new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        mallardDuck.performSwim();
        System.out.println("\n Rubber Duck: \n");
        RubberDuck rubberDuck=new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();
        rubberDuck.performSwim();
        System.out.println("\nRedhead Duck:\n");
        RedHeadDuck redheadDuck=new RedHeadDuck();
        redheadDuck.display();
        redheadDuck.performQuack();
        redheadDuck.performFly();
        redheadDuck.performSwim();
        System.out.println("\nDecoy Duck:\n");
        DecoyDuck decoyDuck=new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performQuack();
        decoyDuck.performFly();
        decoyDuck.performSwim();

    }
}
