package java_assignments_package;
import java.util.Scanner;
import java.io.*;
public class UserInput_01 {
    Scanner sc= new Scanner(System.in);
    BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
    double[] numbers= new double[2];

    public double[] input_2_nos(){
        System.out.println("Enter first no");
         numbers[0]= sc.nextDouble();
        System.out.println("Enter second no");
        numbers[1]= sc.nextDouble();
        return numbers;
    }

    public double[] input_Multiple_nos() throws IOException{
        //uses bufer reader
        System.out.println("Enter size of array");
        int size= sc.nextInt();
        double array[]= new double[size];
        String str= bf.readLine();
        String[] array_numbers= str.trim().split("\\s+");
        for(int i=0;i<size;i++){
            array[i]= Double.parseDouble(array_numbers[i]);
        }
        return array;
    }
}
