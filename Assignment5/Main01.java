package Assignment5;

import java.util.Scanner;
import java.util.*;

public class Main01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m=1;
        while(m==1) {
            System.out.println("Choose the option for which you want the information Parameters \n 1.Rectangle \n 2.Circle \n 3.Square\n 4.Cylinder\n 5.Sphere\n 6.Pyramid");
            int n=Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    Rectangle rectangle = new Rectangle();
                    rectangle.stateShape("Rectangle");
                    rectangle.calculatePerimeter();
                    rectangle.calculateArea();
                    break;
                case 2:

                Circle circle = new Circle();

                System.out.println("Enter the desired radius ");
                double R=Double.parseDouble(sc.nextLine());
                circle.stateShape("Circle");
                circle.calculateCircumference(R);
                circle.calculateArea(R);
                break;

                case 3:
                    Squre square = new Squre();
                    square.stateShape("Square");
                    square.calculatePerimeter();
                    square.calculateArea();
                    break;
                case 4:
                    Cylinder cylinder=new Cylinder();
                    System.out.println("Enter the radius: ");
                    double r=Double.parseDouble(sc.nextLine());
                    System.out.println("Enter the height of cylinder:");
                    double h=Double.parseDouble(sc.nextLine());
                    cylinder.stateShape("cylinder");

                    cylinder.calculateArea(r,h);
                    cylinder.calculateVolume(r,h);
                    break;
                case 5:
                Sphere sphere=new Sphere();
                System.out.println("Enter the desired radius ");
                double r2=Double.parseDouble(sc.nextLine());
                sphere.stateShape("Sphere");
                sphere.calculateArea(r2);
                sphere.calculateVolume(r2);
                break;
                case 6:
                    Pyramid pyramid = new Pyramid();
//                 sc.nextLine();
                    System.out.println("Enter length of the base of pyramid:");
                    double l=Double.parseDouble(sc.nextLine());
                    System.out.println("Enter width of the base of pyramid: ");
                    double w=Double.parseDouble(sc.nextLine());
                    System.out.println("Enter height of pyramid :");

                    double H=Double.parseDouble(sc.nextLine());
                    pyramid.stateShape("pyramid");
                    pyramid.calculateArea(l,w,H);
                    pyramid.calculateVolume(l,w,H);
                    break;
            }
            System.out.println("Press 1 to continue \n") ;
            m=Integer.parseInt(sc.nextLine());
            System.out.println("\n");
        }
    }
}
