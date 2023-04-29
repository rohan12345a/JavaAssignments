package Assignment7;

import java.util.Scanner;


public class main {


    public static void main(String[] args) {
        try {
            double[] numbers = numparse(args);

            Calculation calculator = new Calculation();
            Scanner scan = new Scanner(System.in);
            System.out.println("Number 1 is "+numbers[0]);
            System.out.println("NUmber 2 is "+numbers[1]);
            double [] result = calculator.performAdditionoperation(numbers);
            System.out.println("Sum is: " + result[0]);
            result = calculator.performSubtractionoperation(numbers);
            System.out.println("Subraction is: " + result[0]);
            result = calculator.performMultiplicationoperation(numbers);
            System.out.println("Product of two numbers  is: " + result[0]);

            result = calculator.performDivisionoperation(numbers);
            System.out.println("Division of the two numbers is: " + result[0]);



            calculator.compare(numbers);
            calculator.absolute(numbers);
        }
        catch(NumberFormatException e){
            System.out.println("Input not  in a number  format ");
        }
        catch(ArithmeticException e){
            System.out.println("Number cannot be divided by 0");
        }






    }
    public static double [] numparse(String [] S) throws NumberFormatException,ArithmeticException {
        String [] nums=S;




        String num1[]=new String [2];

        String num2[]=new String [2];




        num1= nums[0].split("/");


        num2=nums[1].split("/");

        double n1=(Double.parseDouble(num1[0])/Double.parseDouble(num1[1]));
        double  n2=(Double.parseDouble(num2[0])/Double.parseDouble(num2[1]));

        double [] result=new double [2];
        result [0]=n1;
        result[1]=n2;
        return result;



    }
}
