public class Example_14 {
public static void main(String[] args) {
    Fibonacci_01(10);
  for (int i = 2; i <= 11; i++) {
    System.out.println(i-1+" -> " + Fibonacci_02(i));
}   
}
// Print the first 10 Fibonacci numbers without recursion
private static void Fibonacci_01(int numbers){
    int f0 = 0;
    int f1 = 1;
    for (int i = 2; i <= numbers; i++) {
        int fi = f1 + f0;
        System.out.println(fi);
        f0 = f1;
        f1 = fi;
    }
} 
// Print the first 10 Fibonacci numbers with recursion
     private static int Fibonacci_02(int numbers){
         if(numbers<=1)
             return numbers;
          return Fibonacci_02(numbers-1)+Fibonacci_02(numbers-2);
     }
}
