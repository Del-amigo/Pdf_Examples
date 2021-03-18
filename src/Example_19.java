import java.util.*;

public class Example_19 extends Example_18{
   public static void main(String[] args) {
       System.out.println(Arrays.toString(getPrime(10,100)));
   } 

   // Create a function that will return in an array the first “p” prime numbers greater than “n”
   private static Object[] getPrime (int nPrimes, int startAt) {
    ArrayList<Integer> arrlist = new ArrayList<>(); 
    int i = startAt;
    while (arrlist.size() < nPrimes){
    if(isPrime(i)){
      arrlist.add(i);
    }
    i++;
    }  
return arrlist.toArray();
   }
}
