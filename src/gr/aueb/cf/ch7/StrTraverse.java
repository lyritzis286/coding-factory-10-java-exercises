package gr.aueb.cf.ch7;

/**
 * Traverse ena string (και reverse) με τη χρηση της charAt().
 */
public class StrTraverse {

    public static void main(String[] args) {
        String s = "Coding Factory";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
        System.out.println();

        //reverse
        for (int i = s.length()-1; i >= 0 ; i--) {
            System.out.print(s.charAt(i));

        }
    }
}
