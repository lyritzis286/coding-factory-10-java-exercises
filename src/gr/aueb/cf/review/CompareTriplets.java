package gr.aueb.cf.review;

/**
 * Δινονται ως εισοδος 2 πινακες - ενας για την Alice
 * και ενας για τον Bob που περιεχουν 3 βαθμολογιες
 * ο καθενας σε 3 μαθηματα (Μουσικη, Μαθηματικα, Φυσικη).
 * Καθε βαθμος μπορει να ειναι απο 1 εως 100
 *
 * Αν η Alice εχει μεγαλυτερη βαθμολογια σε ενα μαθημα
 * παιρνει 1 ποντο
 * αντιστοιχα για τον Bob.
 * Αν η βαθμοι του μαθηματος ειναι ισοι κανεις δεν παιρνει τον ποντο.
 * Επιστρεφει πινακα με 2 θεσεις [ποντοι Alice , ποντοι Bob]
 */
public class CompareTriplets {

    public static void main(String[] args) {
        int[] alice = {52, 66, 79};
        int[] bob = {34, 66, 100};
        int[] points;
        points = compareScores(alice, bob);
        System.out.println("Alice points " + points[0] + " Bob points " + points[1]);


    }

    public static int[] compareScores(int[] alice, int[] bob) {
        int[] points = new int[2]; // [0] = Alice, [1] = Bob

        for (int i = 0; i < alice.length; i++) {
            if (alice[i] > bob[i]) {
                points[0]++;
            } else if (bob[i] > alice[i]) {
                points[1]++;
            }
            // αν είναι ίσοι, κανείς δεν παίρνει πόντο
        }
        return points;
    }
}
