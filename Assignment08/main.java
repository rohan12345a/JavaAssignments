package Assignment08;

import java.util.*;
public class main {
    public static void main(String[] args) throws NoMatchException{
        Scanner sc= new Scanner(System.in);
        try{
            System.out.println("Enter a string ");
            String  input=sc.nextLine();
            if (input.equals("India")){
                System.out.println("Input matches India");


            }
            else{
                throw new NoMatchException(input+" is not equal to India");
            }


        }
        catch(NoMatchException e) {
            System.out.println(e);
            e.printStackTrace();

        }

    }
}
