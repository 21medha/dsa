package medha.basic;

public class amstrong {
    public static void main(String[] args) {
        int num = 371;
        System.out.println(checkArmstrong(num));
    }
    static boolean checkArmstrong(int num){
        int product = 0;
        int temp =num;

        while(temp>0){
            int rem = temp%10;
            product += (rem*rem*rem);
            temp=temp/10;

        }
        if (product==num){
            return true;
        }
        return false;
    }
}
