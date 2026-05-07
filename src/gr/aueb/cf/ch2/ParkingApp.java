package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Σε εβα χωρο σταθμευσης η 1η ωρα κοστιζει
 * 2 ευρω (200λεπτα) και καθε επιπλεον ωρα
 * κοστιζει 1.5 ευρω (150 λεπτα).
 *
 * Ο χρηστης εισαγει τον αριθμο των ωρων που σταθμευσε
 * και το προγραμμα επιστρεφει το συνολικο κοστος.
 *
 * Αν για παραδειγμα ο χρηστης εισαγει 5 ωρες τοτε το
 * κοστος
 */
public class ParkingApp {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        int inputHours = 0;
        int euros = 0;
        int cents = 0;
        int totalCostInCents = 0;
        final int FIRST_HOUR_PRICE = 200;
        final int EACH_ADDITIONAL_HOUR = 150;

        System.out.println("Εισάγετε ώρες στάθμευσης");
        inputHours = scanner.nextInt();
        totalCostInCents = FIRST_HOUR_PRICE + (inputHours -1) * EACH_ADDITIONAL_HOUR;
        euros = totalCostInCents / 100;
        cents = totalCostInCents % 100;

        System.out.printf("Το συνολικό κόστος είναι %d ευρώ και %d λεπτά\n",euros, cents);

    }
}
