package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Demo of rounding doubles.
 */
public class RoundingDoubles {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        double area = 0.0;
        double roundedArea = 0.0;
        double truncatedArea = 0.0;

        System.out.println("Δωστε την εκταση με 6 δεκαδικα ψηφια: ");
        area = in.nextDouble();

        //Επειδη η μαθ ραουντ στρογγυλοποιει μονο σε ακεραιο
        //χρησιμοποιουμε ενα χακ με πολλαπλασιασμο και διαιρεση
        roundedArea = Math.round(area * 100.0) / 100.0;

        //Για αποκοπη των δεκαδικων κανουμε typecast σε int
        truncatedArea = (int) (area * 100.0) / 100.0;

        System.out.printf("Εκταση (αρχικη) : %.6f\n" , area);
        System.out.printf("Εκταση (στρογγυλοποιημενη): %.2f\n", roundedArea);
        System.out.printf("Εκταση (αποκομμενη): %.2f\n", truncatedArea);

    }
}
