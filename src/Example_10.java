public class Example_10 {
    public static void main(String[] args) {
        int[] test = {1,2,3,4,5,6,7,8,9,10};
       System.out.println( SumOfNumbers(test));

    }
    // Calculate the sum of numbers in an array of numbers
    private static double SumOfNumbers(int[] array) {
       double sum = 0;
        for (int i = 0; i < array.length; i++) {
           sum += array[i];
       }
        return sum;
    }
}
