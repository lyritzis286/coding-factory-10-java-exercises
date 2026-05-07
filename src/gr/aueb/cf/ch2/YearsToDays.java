package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει την ηλικία του σεέτη
 * και το πρόγραμμα σπισρέφει την ηλικία σε ημέρες
 * θεωρουμε οτι 1 εος = 365 ημέρες. Για παράδειγμα
 */
public class YearsToDays {
    public static void main(String[] args) {
         //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int inputAgeInYears = 0;
        int ageInDays = 0;
        final int DAYS_IN_YEAR = 365;
        //Input data binding
        System.out.println("Παρακαλώ εισάγετε την ηλικία σας σε έτη");
        inputAgeInYears = scanner.nextInt();


        //Λογική εφαρμογής
        ageInDays = inputAgeInYears * DAYS_IN_YEAR;

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("Ηλικία σε έτη: %d, Ηλικία σε ημέρες: %d\n", inputAgeInYears, ageInDays);

    }
}
