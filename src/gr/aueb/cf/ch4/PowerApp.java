package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ο χρηστης εισαγει τα base και power και το προγραμμα
 * υπολογιζει και εκτυπωνει το base ^ power
 * για παραδειγμα 2^10=1024
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;

        System.out.println("Εισαγετε την βαση και την δυναμη");
        base = in.nextInt();
        power = in.nextInt();

        for (int i = 0; i<=power; i++){
            result *= base;


        }
        System.out.printf("result:%d\n" , result);
    }
}
