public class Example_23 extends Example_22{
    public static void main(String[] args) {
        String name = "Behruz";
        reverse(name);
         reverse_03(name);  
    }
    // Reverse a string
    private static String reverse(String text){
        String reverse = "";
    for (int i = text.length()-1; i >= 0; i--){
     reverse += text.charAt(i);
    }
    return reverse;
    }
    private static void reverse_03(String text){
        String reversed = new StringBuilder(text).reverse().toString();
         System.out.println(reversed);
    }
}
