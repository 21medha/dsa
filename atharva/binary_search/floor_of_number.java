package atharva.binary_search;

public class floor_of_number {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        int target  =  1000;
        System.out.println(floorNumber(arr,target));

    }

    static int floorNumber(int[] arr,int target)
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

        return end;
    }
}
