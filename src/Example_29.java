public class Example_29 extends Example_28{
  public static void main(String[] args) {
      print(100);
  }  
  // Print the distance between the first 100 prime numbers
  private static void print(int num){
      int lastPrime = 2, i = lastPrime + 1, foundPrimes = 1;
      while(foundPrimes<num){
          if(isPrime(i)){
              System.out.println(i-lastPrime+" "+ i +"-" +lastPrime);
              foundPrimes++;
              lastPrime = i;
          }
          i++;
      }
  }
}
