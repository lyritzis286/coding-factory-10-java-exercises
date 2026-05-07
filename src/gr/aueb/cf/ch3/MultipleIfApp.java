package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υλοποιεί ένα μενού με πολλαπλά if
 */
public class MultipleIfApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice  = 0;

        do {
            System.out.println("Επιλεξτε μια απο τις παρακατω επιλογες");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Εξοδος");
            choice = in.nextInt();



        } while (choice != 5);

    }
}
