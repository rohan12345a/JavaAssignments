package JAVA_LAB_ASSIGNMENTS.Ass3;
import java.util.*;
public class Finding_Distance_part2 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println(mindist(array));

    }

    public static int mindist(int array[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nos");
        for (int i=0;i<array.length;i++){
            System.out.println("No- ");
            array[i]= sc.nextInt();
        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int min= Integer.MAX_VALUE;
        int dist;
        int index=0;
        for(int i=0; i< array.length-1;i++){
            dist= array[i+1]- array[i];
            if(dist < min){
                min= dist;
                index=i;
            }
        }
        return index;
    }
}
