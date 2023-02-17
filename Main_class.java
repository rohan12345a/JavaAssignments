package java_assignments_package;

import java.util.Scanner;
import java.io.*;
public class Main_class {
    static double[] result;
    static double[] numbers;

    public static void main(String[] args) {
        UserInput_01 input= new UserInput_01();
        Calculator_01 cal= new Calculator_01();
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter operation :");
        System.out.println("+ For addition");
        System.out.println("- for subtraction");
        System.out.println("* for multiplication");
        System.out.println("/ for division");
        System.out.println("@ for array operations");

        char operator= sc.next().charAt(0);

        switch(operator){
            case '+':
                numbers= input.input_2_nos();
                result= cal.perform_add(numbers);
                System.out.println("Sum is"+ result[0]);
                break;

            case '-':
                numbers= input.input_2_nos();
                result= cal.perform_sub(numbers);
                System.out.println("Sub is"+ result[0]);
                break;

            case '*':
                numbers= input.input_2_nos();
                result= cal.perform_multi(numbers);
                System.out.println("Multiplication is"+ result[0]);
                break;

            case '/':
                numbers= input.input_2_nos();
                result= cal.perform_div(numbers);
                System.out.println("Div is"+ result[0]);

            case '@':
                try{
                    numbers= input.input_Multiple_nos();
                    result= cal.perform_array_operations(numbers);

                }catch (IOException e){
                    System.out.println("Array is empty");
                };
                System.out.println("Addition of array is:"+result[0]);

                System.out.println("Subtraction of array is:"+ result[1]);

                System.out.println("Multiplication is"+ result[2]);

                System.out.println("Division is"+ result[3]);

                System.out.println("Mean of array is"+ result[4]);

                System.out.println("Variance is"+result[5]);

                System.out.println("Standard devation is "+result[6]);

        }

    }

}
