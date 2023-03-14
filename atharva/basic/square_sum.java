package atharva.basic;

public class square_sum {
    public static void main(String[] args) {
        // int a = 13246 → 12 + 32 + 22 + 42 + 62 = 66...ans = 66
       final int num = 13246;
        System.out.println(squareSum(num));
    }

    static int squareSum(final int num)
    {
        int tempNum = num;
        int resultSum = 0;
        while(tempNum != 0)
        {
            int remainder = tempNum % 10;
            resultSum += (remainder * remainder);
            tempNum = tempNum / 10;
        }
        return resultSum;
    }
}
