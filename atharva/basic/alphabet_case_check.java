package atharva.basic;

import java.util.Arrays;

public class alphabet_case_check {
    public static void main(String[] args) {
        char[] alphabets = {'a','A','b'};
        System.out.println(Arrays.toString(isUpper(alphabets)));
    }


    static boolean[] isUpper(char[] alphabets)
    {
        boolean[] resultArr=  new boolean[alphabets.length];
        for(char i = 0 ; i< alphabets.length;i++)
        {
            resultArr[i] = Character.isUpperCase(alphabets[i]);
        }
        return resultArr;
    }
}
