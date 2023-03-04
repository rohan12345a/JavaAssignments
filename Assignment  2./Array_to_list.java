package JAVA_LAB_ASSIGNMENTS.Ass3;

import java.util.ArrayList;
import java.util.Arrays;

class Array_to_arraylist{

    void converter(Integer arr[]){
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(arr));
        System.out.println("Converted array list is:");
        System.out.println(list);
    }
}

