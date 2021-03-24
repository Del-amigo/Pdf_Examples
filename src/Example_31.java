public class Example_31 {
    public static void main(String[] args) {
        String example = "    My name is Behruz    ";

        System.out.println(getNumber(example));
    }
    // Create a function that will return the number of words in a text
    private static int getNumber(String text){
        text = text.trim();
     if(text == null || text.isEmpty()){
         return 0;
     }
     String[] words = text.split("\s+");
     return words.length;
    }
}
