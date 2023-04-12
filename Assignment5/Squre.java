package Assignment5;

import java.util.Scanner;

public class Squre extends Shape{
    @Override
    public void calculateCircumference(double r) {
    }

    @Override
    public void calculatePerimeter() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the side  of the square");
        double side=Double.parseDouble(sc.nextLine());
        double perimeter=4*side;
        System.out.println("The perimeter of the square is  "+perimeter);
    }

    @Override
    public void calculateArea() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the side  of the square");

        double side=Double.parseDouble(sc.nextLine());

        double area=side*side;
        System.out.println("The area of the square is  "+area);

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
