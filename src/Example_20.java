import java.util.*;

public class Example_20 {
   public static void main(String[] args) {
    Integer[] numbers ={1,2,3,4,5,6,7,8,9,10,11,12};
      
        rotate(numbers);
   } 

   // Rotate an array to the left 1 position
   private static void rotate(Integer[] array){
    Collections.rotate(Arrays.asList(array),2);
    System.out.println(Arrays.toString(array));
   }
}
