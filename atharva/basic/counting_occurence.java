package atharva.basic;

public class counting_occurence {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,2};
        System.out.println(countOcc(arr));

    }


    static int countOcc(int[] arr)
    {
        int zeroCount = 0 ;
        for (int num : arr) {
            if (num == 0) {
                zeroCount++;
            }
        }

        return zeroCount;
    }
}
