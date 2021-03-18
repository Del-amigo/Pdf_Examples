import java.util.*;

public class Example_24{
    public static void main(String[] args) {
        Integer[]first = {1,2,3,4};
        Integer[]second = {5,6,7,8,1};
        System.out.println(Arrays.toString(merge(first, second)));
    }
    // Create a function that will merge two arrays and return the result as a new array
     private static Object[] merge(Integer[] a, Integer[] b){
       List<Integer> result = new ArrayList<>();
       for (Integer integer : a) {
           result.add(integer);
       }
       for (Integer integer : b) {
        result.add(integer);
    }
        return result.toArray();
     }
}