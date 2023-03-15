package medha.basic;

public class checkPrime {
    public static void main(String[] args) {
        int num = 13;
        System.out.println(isPrime(num));
    }
    static boolean isPrime(int num){

        for (int i = 2; i < num/2; i++){
            if (num%i==0);
            return false;
        }
         return true;
    }
}
