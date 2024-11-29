package UNIT3;

public class Main3 {


    public static void main(String[] args) {

        char[] s = new char[]{'v', 'e', 'h', 'i', 'c', 'l', 'e'};
        System.out.println(reverseArray(s));


        String a = "a  na";

        System.out.println(validPalindrome(a));
    }


    //Reverse Array-- Double pointer method
    public static char [] reverseArray (char [] c) {
        for (int i = 0, j = c.length - 1; i < c.length / 2; i++, j--) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
        }
        return c;
    }

    public static boolean validPalindrome (String s) {
//TODO need to account for edge case such as:
//-Empty characters, for instance when the string is just " " (non- alphanumerical) should return true
        boolean isIt = false;

        //Edge case, when string contains one null character or is empty
        if (s.isEmpty() || (s.length() == 1) && s.charAt(0) == ' ')
            return true;
        else {
            for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
                if (s.charAt(i) == s.charAt(j))
                    isIt = true;
                else
                    return false;
            }
            
            return isIt;

        }
    }

}
