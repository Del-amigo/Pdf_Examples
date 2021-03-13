public class Example_11 {
    public static void main(String[] args) {
        double[] test = {0.5, 1.0, 2.0, 3.0, 4.0};
        System.out.println(average(test));
    }
    // Calculate the average of the numbers in an array of numbers
    private static double average(double[] numbers){
        double sum = 0;
        int count = 0;   
          for (int i = 0; i < numbers.length; i++) {
              sum += numbers[i];
              count++; 
          }
        return sum / count;
    }
}
