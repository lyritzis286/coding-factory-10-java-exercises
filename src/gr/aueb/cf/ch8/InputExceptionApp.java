package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * {@link java.util.InputMismatchException} δημιουεγειται οταν
 * προσπαθουμε να διαβασουμε ενα διαφορετικο τυπο δεδομενων απο αυτο που περιμενουμε
 * για παραδειγμα αν περιμενουμε εναν ακεραιο και ο χρηστης εισαγε ενα στρινγκ
 * τοτε θα δημιουργηθει InputMismatchException
 */
public class InputExceptionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Parakalw eisagete ena akeraio");
        //num = scanner.nextInt();
        if (!scanner.hasNextInt()) {
            System.out.println("Den eisagate akeraio");
        } else {
            num = scanner.nextInt();
            System.out.println("O akeraios pou eisagate einai " + num);
        }

    }
}
