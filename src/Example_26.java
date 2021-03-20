import java.util.*;

public class Example_26 {
public static void main(String[] args) {
    ArrayList<Integer> one = new ArrayList<>(Arrays.asList(1,2,3,10,5,3,14));
    ArrayList<Integer> two = new ArrayList<>(Arrays.asList(-1,4,5,6,14));
 //   int[] array = {1,2,3,10,5,3,14};
  //  int[] array_02 = {-1,4,5,6,14};
    System.out.println(Arrays.toString(mergeLeft(one, two)));
  // merge(array, array_02);
}   
// Create a function that will receive two arrays and will return an array with elements that are in the first array but not in the second 
private static Object[] mergeLeft(List<Integer> right, List<Integer> left) {

    List<Integer> result = new ArrayList<>();
     for(int integer : right) {
         if(!left.contains(integer)){ 
           result.add(integer);
         }
     }
     return result.toArray();
}
// private static void merge (int[] a, int[]b) {
//     Map<Integer, Integer> map = new HashMap<>();
// for (int i = 0; i < a.length; i++) {
//     map.put(a[i],i);
// }
//     for(int i = 0; i < b.length; i++) {
//         map.put(b[i],i);
//         }
//         for(Map.Entry mapElement : map.entrySet())
//     {
//         System.out.print(mapElement.getKey() + " ");
// }
// }
}
