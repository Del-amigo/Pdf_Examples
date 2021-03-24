public class Example_32 {
public static void main(String[] args) {
    String example = "    My name is Behruz    ";
    System.out.println(toTitleCase(example));
}   
//  Create a function that will capitalize the first letter of each word in a text
private static String toTitleCase(String givenString) {
    String[] arr = givenString.split(" ");
    StringBuffer sb = new StringBuffer();

    for (int i = 0; i < arr.length; i++) {
        sb.append(Character.toUpperCase(arr[i].charAt(0)))
            .append(arr[i].substring(1)).append(" ");
    }          
    return sb.toString().trim();
}
}
