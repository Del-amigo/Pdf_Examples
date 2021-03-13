public class Example_06 {
    public static void main(String[] args) {
        method_01(10);
    }
    // Calculate 10!
    private static void method_01 (int number){
          int prod = 1;
        for (int i = 1; i <= number; i++) {
           System.out.println( prod*=i);
        }
    }
}
