package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εναλλακτικα της do-while με while (true)
 * και break.
 */
public class DoMenu2App {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("Παρακαλω επιλεξτε μια απο τις παρακατω επιλογες:");
            System.out.println("1. Εισαγωγη προιοντος");
            System.out.println("2. Ενημερωση προιοντος");
            System.out.println("3.Διαγραφη προιοντος");
            System.out.println("4.Αναζητηση προιοντος");
            System.out.println("5.Εξοδος");
            choice = in.nextInt();

            if (choice == 5) {
                System.out.println("Καλη συνεχεια");
                break;
            }
        }

    }
}
