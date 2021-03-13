public class Example_17 {
public static void main(String[] args) {
    int[] array = {-1, -2, 1, 3, -8};
    System.out.println(calculateSum(array));
}   
// Calculate the sum of digits of a positive integer number

private static int calculateSum (int[] values){
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            if(values[i] >= 0) 
            sum += values[i];
            }
    return sum;
}
}
