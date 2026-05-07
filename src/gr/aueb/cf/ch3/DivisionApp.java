package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Επιτρεπει στον χρηστη να εισαγει αριθμητη και παρανομαστη
 * και να εκτελει τη διαιρεση
 */
public class DivisionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Εισαγετε τον αριθμητη: (Εξοδος με 0)");
            numerator = scanner.nextInt();

            if (numerator == 0) {
                System.out.println("Εξοδος απο το προγραμμα");
                break;
            }

            System.out.println("Εισαγετε τον παρανομαστη");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("O παρονομαστης δεν μπορει να ειναι 0. Προσπαθηστε ξανα.");
                continue;
            }

            result = numerator / denominator;
            System.out.println("Tο αποτελεσμα της διαιρεσης "+ numerator + " / " + denominator + " ειναι " + result);
        }
        System.out.println("Eυχαριστουμε που χρησιμοποιησατε το προγραμμα.");

    }
}
