package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρηστης εισαγει ακεραιους
 * προσπαθωντας να μαζεψει εναν μυστικο ακεραιο
 */
public class SecretApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 12; //Μυστικος ακεραιος
        int guess = 0;  //εικασια χρηστη

        System.out.println("Προσπαθηστε να μαντεψετε τον μυστικο ακεραιο.");
        guess = scanner.nextInt();


        if (guess == SECRET) {
            System.out.println("Συγχαρητηρια βρήκατε τον μυστικο αριθμο.");
        }
        else {
            System.out.println("Λυπαμαι,η εικασια σας ειναι λαθος.");

        }
    }
}
