package gr.aueb.cf.ch3;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Ο χρηστης εισαγει εναν ακεραιο που συμβολιζει
 * θερμοκρασια.Το προγραμμα υπολογιζει αν η θερμοκρασια
 * ειναι < 0 μια μεταβλητη ,εστω
 * isTempBelowZero γινεται true ,αλλιως false.
 * Τελος εκτυπωνει το αοτελεσμα.
 */

public class TemperatureApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowZero = false;

        System.out.println("Παρακαλώ εισάγετε θερμοκρασία");
        temperature = scanner.nextInt();

        isTempBelowZero = temperature < 0;

        System.out.println("Η θερμοκρασια είναι κάτω απο το μηδεν:" + isTempBelowZero);


    }
}
