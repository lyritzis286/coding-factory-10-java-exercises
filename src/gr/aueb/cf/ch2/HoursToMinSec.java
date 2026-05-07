package gr.aueb.cf.ch2;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Λαμβανει απο τον χρηστη ενα ακεραιο
 * που αντιστοιχει σε ωρες, Μετατρεπει
 * σε λεπτα και δευτερολεπτα και τα εκτυπωνει
 */
public class HoursToMinSec {
    public static void main(String[] args) {

        //Δηλωση και αρχικοποιηση μεταβλητων

        Scanner scanner = new Scanner(System.in);
        final int HOURS_TO_MINUTES = 60;
        final int HOURS_TO_SECONDS = 3600;
        int inputHours = 0;
        int minutes = 0;
        int seconds = 0;

        //Input Data Binding
        System.out.println("Παρακαλώ εισάγετε τον αριθμό των ωρών");
        inputHours = scanner.nextInt();

        //Εντολές επεξεργασίας
        minutes = inputHours * HOURS_TO_MINUTES;
        seconds = inputHours * HOURS_TO_SECONDS;

        //Εκτυπωση αποτελεσματος
        System.out.printf("Ώρες: %d, Λεπτά: %d, Δευτερόλεπτα: %d\n",inputHours, minutes, seconds);



    }
}
