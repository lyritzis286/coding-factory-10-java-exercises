package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *Ο χρήστης εισάγει ένα ακέραιο Το πόγραμμα υπολογίζει το απόλυτο
 * του ακεραίου το απόλυτο ενός ακεραίου είναι πάντα θετικός
 * Για παράδειγμα το απόλυτο του -5 ειναι 5 ενώ του 5 είναι 5.
 */
public class AbsTernary {
    public static void main(String[] args) {

        int num = 0;
        int abs = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλω εισαγετε εναν ακεραιο");
        num = scanner.nextInt();

        abs = (num > 0 ?  num : num * -1 );

        System.out.println("O απολυτος αριθμος του " + num + " ειναι " + abs);




    }
}
