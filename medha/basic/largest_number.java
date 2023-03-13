package medha.basic;

public class largest_number {

    public static void main(String[] args) {
        int[] arr ={3,1,21,45,11,200};
        int a =largestnum(arr);
        System.out.println(a);
    }
    public static int largestnum(int[] arr){
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }

        }
        return max;
    }
}
