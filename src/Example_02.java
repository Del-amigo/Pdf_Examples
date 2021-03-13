public class Example_02 {
    public static void main(String[] args) {
        method_01();
       method_02(0,100);
    }
    // print the odd numbers less than 100;
    private static void method_01(){
        for (int i = 1; i <= 100; i+=2) {
         System.out.print(i+" ");
        }
    }

    private static void method_02(int start, int end){
        for (int i = start; i <= end; i++) {
         System.out.print((i%2!=0)?i+" ":i++ + " ");
    }
}
}
