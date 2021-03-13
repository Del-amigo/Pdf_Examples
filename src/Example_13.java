import java.util.*;

public class Example_13 {
public static void main(String[] args) {
    int[] values = {1,2,3,4,5,6,7,8,5,0,11,100,99};
    System.out.println(maxNumber_01(values));
    System.out.println(maxNumber_02(values));
  //  System.out.println(maxNumber_03(values));
}   
// Find the maximum number in an array of numbers
private static int maxNumber_01(int[] numbers) {
    int max = 0; 
    for (int i = 0; i < numbers.length-1; i++) {
       if(numbers[i]>numbers[i+1]){
           max = numbers[i];
       }
     }
    return max;
}

private static int maxNumber_02(int[] values) {
     Arrays.sort(values);
     return values[values.length-1];
}

// private static int maxNumber_03(Integer[] values) {
//      List<Integer> numbersList = Arrays.asList(values);
//          Collections.sort(numbersList);
//     return numbersList.get(values.length-1);
}

