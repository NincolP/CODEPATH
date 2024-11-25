package UNIT3;

public class Main3 {


    public static void main(String[] args) {

        char[] s = new char[]{'v', 'e', 'h', 'i', 'c', 'l', 'e'};
        System.out.println(reverseArray(s));
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

}
