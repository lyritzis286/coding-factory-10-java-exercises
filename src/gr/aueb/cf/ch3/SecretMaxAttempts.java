package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Επαναληπτικα ο χρηστης προσπαθει να μαντεψει ενα μυστικο ακεραιο
 * αλλα εχει ενα οριο προσπαθειων.
 */
public class SecretMaxAttempts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET_PIN = 1234;
        final int MAX_ATTEMPTS = 3;
        int attempts = 0;
        int inputPin = 0;

        while (true) {
            if (attempts == MAX_ATTEMPTS) {
                System.out.println("Eχετε ξεπερασει το οριο προσπαθειων.");
                break;
            }
            System.out.println("Προσπαθηστε να μαντεψετε το μυστικο PIN.Προσπαθεια "+ (attempts+ 1) +" απο"+ MAX_ATTEMPTS );
            inputPin = scanner.nextInt();

            if (inputPin != SECRET_PIN) {
                System.out.println("Λαθος PIN.Προσπαθηστε ξανα"    );
                attempts++;
                continue;
            }

            System.out.println("Συχγαρητηρια! Μαντεψατε σωστα.");
            break;

        }

    }
}
