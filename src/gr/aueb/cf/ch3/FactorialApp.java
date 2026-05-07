package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογιζει το παραγοντικο του n (n!)
 * οπου το n το δινει ο χρηστης.
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int result = 1;
        int i =1;

        System.out.println("Παρακαλω εισάγετε εναν ακεραιο:");
        n = scanner.nextInt();

        while (i<=n) {
            result *= i;
            i++;

        }
        System.out.printf("Το παραγοντικο του %,d είναι; %d\n ", n, result);

    }
}
