import java.util.*;
public class Example_25 {
    public static void main(String[] args) {
    Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};
    Integer[] numbers_02 = {1,2,3,4,5,6,7,11,21};
        
       System.out.println(Arrays.toString(notInBoth(numbers,numbers_02)));
    }
    /*  Create a function that will receive two arrays of numbers as arguments and return an array composed 
    of all the numbers that are either in the first array or second array but not in both  */
    private static Object[] notInBoth(Integer[] a, Integer[] b){
        List<Integer> result = new ArrayList<>();
          for (int i = 0; i < a.length; i++) {
              if(!result.contains(a[i])){
                    result.add(a[i]);
              }
          }
          for (int i = 0; i < b.length; i++) {
            if(!result.contains(b[i])){
                  result.add(b[i]);
            }
        }
        return result.toArray();
    }
}
