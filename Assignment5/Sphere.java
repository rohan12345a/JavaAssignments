package Assignment5;

public class Sphere extends Shape implements Volume {
    @Override
    public void calculateCircumference(double r) {

    }
    @Override
    public void calculatePerimeter() {
    }
    @Override
    public void calculateArea() {
    }
    @Override
    public void calculateArea(double r) {
        double surface_area=4*(Math.PI*Math.pow(r,2));
        System.out.println("The Surface Area of Sphere is: "+surface_area);
    }
    @Override
    public void calculateArea(double r, double h) {
    }
    @Override
    public void calculateArea(double l, double w, double h) {

    }
    @Override
    public void calculateVolume() {
    }
    @Override
    public void calculateVolume(double r) {
        double volume=(4/3)*(Math.PI*Math.pow(r,3));
        System.out.println("The Volume  of Sphere "+volume);

    }
    @Override
    public void calculateVolume(double r, double h) {
    }
    @Override
    public void calculateVolume(double l, double w, double h) {
    }
}
