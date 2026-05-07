package gr.aueb.cf.ch7;

/**
 * Παλινδρομική είναι μια πρόταση (String) που
 * διαβαζεται το ιδιο απο την αρχη και το τελος.
 */
public class Palindrome {

    public static void main(String[] args) {


    }

    public static boolean isPalindrome(String s1) {
        for (int i = 0, j = s1.length() -1; i < j; i++, j--) {
            if (s1.charAt(i) != s1.charAt(j)) {
             return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String s) {
        return new StringBuilder(s)
                .reverse()
                .toString()
                .equals(s);
    }
}
