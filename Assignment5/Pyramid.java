package Assignment5;

public class Pyramid extends Shape implements Volume{

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
    void calculateArea(double r) {

    }

    @Override
    public void calculateArea(double r, double h) {

    }

    @Override
    public void calculateArea(double l, double w, double h) {
        double surface_Area=(l * w) + (l * Math.sqrt(Math.pow(w / 2, 2) +
                Math.pow(h, 2))) + (w * Math.sqrt(Math.pow(l / 2, 2) + Math.pow(h, 2)));
        System.out.println("The Surface Area of Pyramid: "+surface_Area);
    }

    @Override
    public void calculateVolume() {

    }

    @Override
    public void calculateVolume(double r) {

    }
    @Override
    public void calculateVolume(double r, double h) {

    }
    @Override
    public void calculateVolume(double l, double w, double h) {
        double volume=((l*w*h)/3);
        System.out.println("The volume of the pyramid : "+volume);

    }
}
