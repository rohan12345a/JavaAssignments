package Assignment5;

import java.util.Scanner;
import java.util.*;

public class Rectangle extends Shape{
    @Override
    public void calculateCircumference(double r) {
    }
    @Override
    public void calculatePerimeter() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        double L=Double.parseDouble(sc.nextLine());
        System.out.println("Enter the breadth of rectangle: ");
        double B=Double.parseDouble(sc.nextLine());
        double perimeter=2*(L+B);
        System.out.println("The perimeter of Rectangle is "+perimeter);
    }
    @Override
    public void calculateArea() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length of rectangle ");
        double l=Double.parseDouble(sc.nextLine());
        System.out.println("Enter the breadth of rectangle ");
        double b=Double.parseDouble(sc.nextLine());

        double area=l*b;
        System.out.println("The area of Rectangle is "+area);

    }
    @Override
    void calculateArea(double r) {
    }
    @Override
    public void calculateArea(double r, double h) {
    }
    @Override
    public void calculateArea(double l, double w, double h) {

    }
}
