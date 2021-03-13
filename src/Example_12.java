import java.util.*;

public class Example_12 {
public static void main(String[] args) {
    double[] array ={-11.05, 23, -5.3};
   System.out.println( Arrays.toString(positiveArray(array)) );
}   
/*
Create a function that receives an array of numbers as argument and
returns an array containing only the positive numbers
*/              
private static Object[] positiveArray (double[] numbers){
    List<Double> arrlist = new ArrayList<>(); 
             for (int i = 0; i < numbers.length; i++) {
                 if(numbers[i]>=0){
                     arrlist.add(numbers[i]);
                 }
             }
    return arrlist.toArray();
}
}

