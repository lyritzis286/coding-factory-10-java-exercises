package gr.aueb.cf.ch7;

/**
 * Δημιουργηστε μια μεθοδο, που να παιρνει ως εισοδο ενα String
 * και ενα char και ενα επιστρεφει το πληθος των εμφανισεων του
 * char στο String.
 */
public class LetterCount {

    public static void main(String[] args) {

    }

    public static int getLetterCount(char letter , String s ) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) count++;
        }
        return count;
    }
}
