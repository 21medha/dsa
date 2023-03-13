package medha.basic;

public class counting_occurence {
    public static void main(String[] args) {
        int[] arr ={1,2,0,0,0,0,1};
        System.out.println(occurence(arr));

    }
    static int occurence(int[] arr){
        int numberOfzero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                numberOfzero++;
            }
        }
        return  numberOfzero;
    }
}
