package gr.aueb.cf.ch6;

/**
 * Traverse an array. Επισκεψη σε καθε στοιχειο του πινακα
 * και εκτυπωση της τιμης.
 */
public class ArrayTraverse {

    public static void main(String[] args) {
        int[] scores = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        //Traverse the array using a for loop
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]);
        }

        //Enhanced for.
        for (int element : scores) {
            System.out.println(element);
        }



    }
}
