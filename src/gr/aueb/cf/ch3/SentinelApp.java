package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβάζει ακεραιους απο το χρηστη
 * μεχρι να δοθει -1 (sentinel).
 */
public class SentinelApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Παρακαλω εισαγετε εναν ακεραιο ( -1 για εξοδο) :");

        while ((num = in.nextInt()) != -1) {
            iterations++;
            System.out.println("Παρακαλω εισαγετε εναν ακεραιο (-1 για εξοδο):");
        }

        System.out.println("Ο χρηστης εισηγαγε " + iterations + " ακεραιους πριν δοσει τον sentinel");


    }
}
