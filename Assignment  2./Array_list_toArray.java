package JAVA_LAB_ASSIGNMENTS.Ass3;

import java.util.ArrayList;

public class Array_list_toArray {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println(list);

        int [] array = new int[list.size()];
        int indx=0;
        for(final Integer value: list){
            array[indx++]= value;
        }

        System.out.println("The elems are");
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}

