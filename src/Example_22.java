import java.util.*;

public class Example_22 {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(reverse(numbers)));
      List<?> list = Arrays.asList(numbers);
     System.out.println( reverse_02(list));
    }
    // Reverse an array
    private static Object[] reverse(Integer[] array){
          ArrayList<Integer> list = new ArrayList<Integer>();
          for(int i = array.length - 1; i>=0; i--){
          list.add(array[i]);
        }
          return list.toArray();
    }
    public static List<?> reverse_02(List<?> array){
     Collections.reverse(array);
     return array;
}
}
