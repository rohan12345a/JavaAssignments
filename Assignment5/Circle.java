package Assignment5;

import java.util.Scanner;
import java.util.*;

public class Circle extends Shape  {
    @Override
    public void calculateCircumference(double r) {
        double circumference=2*Math.PI*r;
        System.out.println("The circumference of the circle is "+circumference);
    }
    @Override
    public void calculatePerimeter() {
    }
    @Override
    public void calculateArea() {
    }
    @Override
    public void calculateArea(double r ) {

        double area=Math.PI*Math.pow(r,2);
        System.out.println("The Area of Circle "+area);
    }
    @Override
    public void calculateArea(double r, double h) {
    }
    @Override
    public void calculateArea(double l, double w, double h) {
    }
}
