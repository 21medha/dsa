package atharva.array;

public class search_in_2d_array {
    public static void main(String[] args) {
        int[][] arr=  {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        System.out.println(searchIn2ndArr(arr,-1));
    }

    static boolean searchIn2ndArr(int[][] arr,int num)
    {
        for(int i = 0 ; i < arr.length;i++)
        {
            for(int j =0 ;j < arr.length;j++)
            {
                if(arr[i][j] == num)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
