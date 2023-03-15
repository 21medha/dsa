package atharva.array;

import java.util.Arrays;

public class largest_smallest {
    public static void main(String[] args) {
        int[] arr = {5,4,2,6,8,-1};

        System.out.println(Arrays.toString(largestSmallest(arr)));
    }

    static int[] largestSmallest(int[] arr)
    {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int j : arr) {
            if (j > largest) {
                largest = j;
            }
            if (j < smallest) {
                smallest = j;
            }
        }
        return new int[]{largest,smallest};
    }
}
