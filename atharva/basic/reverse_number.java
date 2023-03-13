package atharva.basic;

public class reverse_number {
    public static void main(String[] args)
    {
        int num = 313131;
        System.out.println(reverseNum(num));
    }

    static int reverseNum(int num)
    {
        int reverseNum = 0;
        int tempNum = num;
        while(tempNum != 0)
        {
             int r = tempNum % 10;
             reverseNum = reverseNum * 10 + r;
             tempNum = tempNum / 10;
        }

        return reverseNum;
    }
}
