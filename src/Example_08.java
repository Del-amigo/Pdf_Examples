public class Example_08 {
    public static void main(String[] args) {
        convertToFahrenheit(50);
    }
    // Create a function that will convert from Celsius to Fahrenheit
    private static void convertToFahrenheit(double value) {
  // (0°C × 9/5) + 32 = 32°F
        System.out.println( (value * 9/5)+ 32);
    }
}
