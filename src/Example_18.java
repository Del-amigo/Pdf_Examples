import java.util.Scanner;

public class Example_18 {
public static void main(String[] args) {
    System.out.println("Which number you want to test?");
    Scanner scanner = new Scanner(System.in);
    int prime = scanner.nextInt();
    System.out.println(prime+" is a prime number: "+isPrime( prime ) );
    scanner.close();

 //   printPrime(100);
}   

// Print the first 100 prime numbers
// private static void printPrime (int prime){
//     int num = 1, i = 2;
//     while (num <= prime){
//         if(isPrime(i)){
//             System.out.println(num+ " --> "+i);
//             num++;
//         }
//         i++;
//     }
// }

public static boolean isPrime(int prime) {
    if (prime<=1){
        return false;
    }
   for (int i = 2; i < prime; i++) {
       if (prime%i==0){
           return false;
       }
   }
   return true;
}
}
