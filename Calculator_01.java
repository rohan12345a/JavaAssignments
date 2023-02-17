package java_assignments_package;
import java.math.*;
public class Calculator_01 {
    double [] result= new double[1]; // result array
    double [] result_array= new double[7];// for returning array results

    public double[] perform_add(double[] numbers){
        result[0]= numbers[0] +numbers[1];
        return result;
    }

    public double[] perform_sub(double[] numbers){
        result[0]= numbers[0]- numbers[1];
        return result;
    }

    public double[] perform_multi(double[] numbers){
        result[0]= numbers[0]*numbers[1];
        return result;
    }

    public double[] perform_div(double[] numbers){
        result[0]= numbers[0]/numbers[1];
        return result;
    }


    public double[] perform_array_operations(double[] numbers){
        int siz= numbers.length;
        result_array[0]= 0;// for addition
        result_array[2]= 1;// for multiplication
        for(int i=0;i<siz;i++){
            result_array[0]= result_array[0] + numbers[i];
            result_array[2]= result_array[2] * numbers[i];
        };
        result_array[0]= numbers[0];//  1st no for input for sub
        result_array[3]= numbers[0];// 1st no for input for div
        for(int i=0;i<siz;i++){
            result_array[1]= result_array[1] - numbers[i];
            result_array[3]= result_array[3]/ numbers[i];
        };
        result_array[4]= result[0]/ siz;// mean;
        double sqd= 0;
        for(int i=0;i<siz;i++){
            // sum of squre of differences of mean
            sqd= sqd+ ((numbers[i]- result_array[4]) * (numbers[i]- result_array[4]));

        };
        result_array[5]=sqd/siz; //squared difference/size=variance
        result_array[6]=Math.sqrt(result_array[5]); //sqrt of variance is S.D.

        return result_array;



    }


}
