public class Example_28 {
    public static void main(String[] args) {
        System.out.println(sumPrimes(100));
    }
    // Calculate the sum of first 100 prime numbers and return them in an array
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
    private static int sumPrimes (int prime) {
        int sum = 0, foundPrime = 0, i = 2;
        while (foundPrime<prime){
            if (isPrime(i)){
                foundPrime++;
                sum+=i;
            }
            i++;
        }
        return sum;
    }
}
