package atharva.strings;

public class palindrome {
    public static void main(String[] args) {
        String str = "aabaa";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(final String str)
    {
        int i = 0;
        int j = str.length() - 1;
        while(i < j)
        {
            if(str.charAt(i) == str.charAt(j))
            {
                i++;
                j--;

            }else {
                return false;
            }


        }
        return true;
    }
}
