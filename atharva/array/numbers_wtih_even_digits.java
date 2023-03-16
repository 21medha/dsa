package atharva.array;

public class numbers_wtih_even_digits {
//    Given an array nums of integers, return how many of them contain an even number of digits.
//    Input: nums = [12,345,2,6,7896]
//    Output: 2
//    Explanation:
//            12 contains 2 digits (even number of digits).
//            345 contains 3 digits (odd number of digits).
//            2 contains 1 digit (odd number of digits).
//            6 contains 1 digit (odd number of digits).
//            7896 contains 4 digits (even number of digits).
//    Therefore only 12 and 7896 contain an even number of digits.
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] arr) {
        int totalEvenDigitsCount = 0;

        for(int num : arr)
        {
            boolean isEvenDigit = isEven(num);
            if(isEvenDigit) totalEvenDigitsCount++;
        }
        return totalEvenDigitsCount;
    }

    static boolean isEven(int n)
    {
        int count = 0 ;
        while(n!=0)
        {
            count++;
            n = n/ 10;
        }
        return count % 2== 0;
    }
}
