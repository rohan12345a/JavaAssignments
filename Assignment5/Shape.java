package Assignment5;

abstract public class Shape {
    public static void stateShape(String shape) {
        System.out.println("The Shape is : " + shape);
    }
    abstract public void calculateCircumference(double r);

    abstract public void calculatePerimeter();


    abstract public void calculateArea();

    abstract void calculateArea(double r);
    abstract public void calculateArea(double r, double h);
    abstract public void calculateArea(double l,double w,double h);
}

