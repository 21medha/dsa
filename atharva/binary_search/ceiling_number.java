package atharva.binary_search;

public class ceiling_number {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        int target  =  7;
        System.out.println(ceilingOfNumber(arr,target));

    }

    static int ceilingOfNumber(int[] arr,int target)
    {

        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            int mid = (start + end) / 2;

            if(arr[mid] == target)
            {
                return mid;
            }
            if(arr[mid] > target)
            {
                end = mid - 1;
            }
            if(arr[mid] < target)
            {
                start = mid + 1;
            }
        }
        if(start >= arr.length)
        {
            return - 1;
        }
        return start;
    }
}
