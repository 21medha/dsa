package atharva.strings.search_in_string;

public class dart {
    public static void main(String[] args) {
        String str = "atharva";
        System.out.println(searchInString(str,'c'));
    }

    static boolean searchInString(String str,char ch)
    {
        for(int i =0 ; i < str.length();i++)
        {
            if(str.charAt(i) == ch)
            {
                return true;
            }
        }
        return false;
    }
}
