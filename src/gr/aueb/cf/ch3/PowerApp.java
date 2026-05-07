package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογιζει το α^ν O χρηστης
 * εισαγει τα α και ν
 *
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        System.out.println("Παρακαλω εισάγετε την βαση (a):");
        base = in.nextInt();
        System.out.println("Παρακαλω εισάγετε την δυναμη (n):");
        power = in.nextInt();

        while  (i<=power) {
            result *=base; // result =result* base
            i++;
        }

        System.out.printf("%d ^ %d = %,d\n", base, power, result);



    }
}
