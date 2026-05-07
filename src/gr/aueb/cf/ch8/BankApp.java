package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * Η {@link BankApp} παρέχει μόνο μία υπηρεσία
 * την υπηρεσία κατάθεσης.
 */
public class BankApp {
static double balance = 0.0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = 0.0;
        try {
            System.out.println("Παρακαλώ εισάγετε το ποσό που θέλτε να καταθέσετε");
            amount = scanner.nextDouble();
            deposit(amount);
        } catch (Exception e) {
            System.out.println("Η κατάθεση απετυχε.");
        }

    }

    /**
     *
     * @param amount ποσό προς κατάθεση
     * @throws Exception αν το ποσό ειναι αρνητικο πεταει exception
     */
    public static void deposit(double amount) throws Exception{
        try {
            if (amount < 0) throw new Exception("Το ποσο δεν μπορει να ειναι αρνητικο");
            balance += amount;
        } catch (Exception e) {
            System.err.println(e.getMessage());  //logging καταγραφη
            throw e;   //rethrow
        }
    }
}
