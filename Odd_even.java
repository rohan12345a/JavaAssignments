package JAVA_LAB_ASSIGNMENTS.Ass3;

import java.util.Scanner;
class array_operation{

    int [] odd = new int[10];
    int [] even= new int[10];
    int even_no=0;
    int odd_no= 0;

    Scanner sc= new Scanner(System.in);
    int no= sc.nextInt();

    void  even_odd(){
        for(int i=0;i<no;i++){
            System.out.println("Enter numbers");
            int num= sc.nextInt();
            if(num%2==0){
                even[even_no]= num;

            }
            else {
                odd[odd_no]= num;
            }
        }
    }
}

public class Odd_even {
    public static void main(String[] args) {
        array_operation arr= new array_operation();
        arr.even_odd();
    }
}
