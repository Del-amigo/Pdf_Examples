public class Example_07 {
    public static void main(String[] args) {
       System.out.println(calculateEven_01());
    }
    // Calculate the sum of even numbers greater than 10 and less than 30
    private static int calculateEven_01(){
            int sum = 0;
           for (int i = 11; i <= 30; i+= 2) {
                sum +=i;
           }
           return sum;
           }
    }
