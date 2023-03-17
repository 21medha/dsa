package atharva.binary_search.smallest_letter;

public class smallest_letter {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'z';
        System.out.println(smallestChar(arr,target));
    }

    static char smallestChar(char[] arr,char target)
    {
        int start = 0 ;
        int end = arr.length - 1;

        while( start <= end)
        {
            int mid  = (start + end)/2;

            if(arr[mid] == target)
            {
                if(mid == arr.length - 1)
                {
                    return arr[0];
                }
                return arr[mid + 1];
            }

            if(arr[mid] > target)
            {
                end = mid - 1;
            }
            if(arr[mid]< target)
            {
                start = mid + 1;
            }
        }
        if(start >= arr.length)
        {
            return arr[0];
        }
        return arr[start];

    }
}
