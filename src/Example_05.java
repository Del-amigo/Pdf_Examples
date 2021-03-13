public class Example_05 {
    public static void main(String[] args) {
       System.out.println( sum(10));
    }
    // Calculate the sum of numbers from 1 to 10
    private static int sum(int endValue){
        int sum = 0;
        for (int i = 0; i <= endValue; i++) {
            sum += i;
        }
        return sum;
    }
}
