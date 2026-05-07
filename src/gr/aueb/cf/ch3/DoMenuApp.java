package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * εμφανίζει ένα μενού επιλογών
 * στον χρηστη μεχρι να επιλεξει 0 ( εξοδο).
 */
public class DoMenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Παρακαλω επιλεξτε μια απο τις παρακατω επιλογες:");
            System.out.println("1. Εισαγωγη προιοντος");
            System.out.println("2. Ενημερωση προιοντος");
            System.out.println("3.Διαγραφη προιοντος");
            System.out.println("4.Αναζητηση προιοντος");
            System.out.println("5.Εξοδος");
            choice = in.nextInt();
        } while (choice != 5);

        System.out.println("Ευχαριστουμε για την επιλογη της εγαρμογης μας.");

    }
}
