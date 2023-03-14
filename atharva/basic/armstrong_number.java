package atharva.basic;

public class armstrong_number {
    public static void main(String[] args) {
//        153 = (1*1*1)+(5*5*5)+(3*3*3)

        int num = 370;
        System.out.println(isArmstrong(num));
    }

    static boolean isArmstrong(final int num)
    {
        int tempNum = num;
        int resultCheckNum = 0;
        while(tempNum != 0)
        {
            int remainder = tempNum % 10;
            resultCheckNum += (remainder*remainder*remainder);
            tempNum = tempNum / 10;
        }
        return resultCheckNum == num;
    }
}
