package medha.basic;

import java.util.Arrays;

public class alphabet {
    public static void main(String[] args) {
        char[] alphabets = {'a','B','c'};
        System.out.println(Arrays.toString(isupper(alphabets)));



    }
    static boolean[] isupper(char[] alphabets){
        boolean[] resultArr = new boolean[alphabets.length];
        for (int i = 0; i < alphabets.length; i++) {
            resultArr[i] = Character.isUpperCase(alphabets[i]);
        }
        return resultArr;

    }
}
