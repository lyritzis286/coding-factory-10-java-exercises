package gr.aueb.cf.review;

/**
 * Δοθέντος ενός string επιστρεφει ena στρινγ
 * που αποτελεί επανάληψη του αρχικου string n φορες
 *
 * Για παραδειγμα αν το αρχικο string ειναι abc
 * n =3 τοτε επιστρεφει abcabcabc
 */
public class RepeatedString {

    public static void main(String[] args) {

    }

    public static String stringTimesN(String s, int n) {
        if (s == null) {
            throw new IllegalArgumentException("String Cannot Be Null");
        }
        if (n < 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(s.length() * n);
        sb.repeat(s, n);
       return sb.toString();
    }
}
