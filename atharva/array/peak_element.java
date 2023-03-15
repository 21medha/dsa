package atharva.array;

import java.util.ArrayList;

public class peak_element {
    public static void main(String[] args) {
     int[] arr = {10, 20, 15, 2, 23, 90, 67};
        System.out.println(peakElement(arr));
//        Output: 20
//        Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.


    }

    static ArrayList<Integer> peakElement(final int[] arr)
    {
        ArrayList<Integer> resultList = new ArrayList<>();
        if(arr.length == 2)
        {
            return resultList;
        }
        for(int i = 1 ; i < arr.length - 1;i++)
        {
            if(arr[i - 1] < arr[i] && arr[i+1] < arr[i])
            {
                resultList.add(arr[i]);
            }
        }
        return resultList;
    }
}
