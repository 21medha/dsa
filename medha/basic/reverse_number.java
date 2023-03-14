package medha.basic;

public class reverse_number {
    public static void main(String[] args) {
        int num = 543;
        System.out.println(reverse(num));

    }
    static int reverse(int num){
        int rev = 0;
        int rem;
        while(num>0){

        rem = num%10;

        rev = (rev*10)+rem;
        num  = num/10;

        }
        return rev;
    }
}
