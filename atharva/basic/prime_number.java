package atharva.basic;

public class prime_number {
    public static void main(String[] args) {
        final int num = 14;
        System.out.println(isPrime(num));
    }

    static boolean isPrime(final int num)
    {
        if(num <= 2)
        {
            return true;
        }

        return !(num % 2 == 0);
    }
}
