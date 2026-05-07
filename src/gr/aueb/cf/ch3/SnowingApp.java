package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρηστης εισάγει αν βρεχει και τη θερμοκρασια
 * και το προγραμμα υπολογιζει αν χιονιζει
 * Χιονιζει σημαινει οτι βρεχει και η θερμοκρασια
 * ειναι κατω απτο μηδεν.
 */
public class SnowingApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isRaining = false;
        int temperature = 0;
        boolean isSnowing = false;

        System.out.println("Βρέχει; (true/false)");
        isRaining = scanner.nextBoolean();
        System.out.println("Παρακαλω εισαγετε την θερμοκρασια");
        temperature = scanner.nextInt();

        isSnowing = isRaining && (temperature < 0);

        System.out.println("Χιονίζει:" +isSnowing);
    }
}
