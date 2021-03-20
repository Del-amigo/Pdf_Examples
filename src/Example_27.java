import java.util.*;

public class Example_27{
   public static void main(String[] args) {
       int[] numbers = {1,2,3,6,-1,2,9,7,1,-1,100};

      System.out.println(Arrays.toString(getDistinctValues(numbers)));
    //  merge(numbers);
   } 
   // Create a function that will reveceive an array of numbers as argument and will return a new array with distinct elements
   private static boolean isArray(int n, int[] array, int fromIndex, int toIndex) {
         for (int i = fromIndex; i < toIndex; i++){
             if(array[i]==n)
             return true;
         }
         return false;
   }
   private static Object[] getDistinctValues(int[]array){
    List<Integer> result = new ArrayList<>();
         for(int i = 0; i < array.length-1;i++){
                     if(!isArray(array[i],array,i+1,array.length-1)){
                         result.add(array[i]);
                     }
         }
         Collections.sort(result);
         return result.toArray();
   }

//    private static void merge (int[] a) {
//     Map<Integer, Integer> map = new HashMap<>();
// for (int i = 0; i < a.length; i++) {
//     map.put(a[i],i);
// }
//         for(Map.Entry mapElement : map.entrySet())
//     {
//         System.out.print(mapElement.getKey() + " ");
// }
// }
}
