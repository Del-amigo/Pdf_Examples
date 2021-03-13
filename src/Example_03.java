public class Example_03 {
    public static void main(String[] args) {
        method_01(7);
    }
    // Print the multiplication table with 7
    private static void method_01 (int num){
          for (int i = 0; i <= 10; i++) {
              System.out.println(num + " * " + i + " = " + num*i);
          }
    }
    
}
