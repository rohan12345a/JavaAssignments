package JAVA_LAB_ASSIGNMENTS.Ass3;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Ass3_Part3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Array_to_arraylist n1= new Array_to_arraylist(); // Creating file instance
        System.out.println("Enter how many values you want");
        Integer x= sc.nextInt();
        int y;
        Integer [] array1= new Integer[x];
        for (int i=0;i<array1.length;i++){
            System.out.println("Enter elems");
            y= sc.nextInt();
            array1[i]=y;
        }
        n1.converter(array1);
    }
}
