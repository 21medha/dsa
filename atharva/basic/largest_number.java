package atharva.basic;

public class largest_number {
    public static void main(String[] args) {
        int[] arr = {4, 5,2,1,10,1};
        System.out.println(largestNum(arr));

    }


    static int largestNum(int[] arr)
    {
        int largestNo = Integer.MIN_VALUE;
        for(int num : arr)
        {
            if(num > largestNo)
            {
                largestNo = num;
            }
        }

        return largestNo;
    }
}
