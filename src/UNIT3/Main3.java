package UNIT3;

public class Main3 {


    public static void main(String[] args) {

        char[] s = new char[]{'v', 'e', 'h', 'i', 'c', 'l', 'e'};
        System.out.println(reverseArray(s));


        String a = "A man, a plan, a canal: Panama";

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

    //Space complexity is O(N)  Time complexity is also O(N)
//TODO - this is not currently accounting for non alpha characters like commas
    public static boolean validPalindrome (String s) {
//-Empty string, one character strings or string containing spaces only should return true.
        boolean isIt = false;
        //removing all non-alphabetic characters including spaces and brings all characters to lower case.
        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();

        //This one below was just removing spaces
        //s= s.replaceAll("\\s", "");

        //Edge case, when string contains one null character or is empty
        if (s.isEmpty() || (s.length() == 1))
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
