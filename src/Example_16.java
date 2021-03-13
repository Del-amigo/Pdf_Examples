public class Example_16 {
  public static void main(String[] args) {
      for (int i = 0; i <= 20; i++) {
      System.out.println(i+" is a prime number " + prime(i));
      }
  }  
  // Create a function that will return a Boolean specifying if a number is prime
  private static boolean prime(int number) {
        return number % 2==0 ? true : false;
  }
}
