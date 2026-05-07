package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογιζει την δυναμη α^b με μεθοδο
 */
public class PowerApp {
    public static void main(String[] args) {
        //Δηλωση και αρχικοποιηση
        int base = 0;
        int power = 0;
        int result = 0;
        Scanner in = new Scanner(System.in);

        //Input & Data Binding
        System.out.println("Δωστε την βαση και τον εκθετη");
        base = in.nextInt();
        power = in.nextInt();

        //Calls the Service - delegation
        result = pow(base, power);

        System.out.println("To αποτελεσμα ειναι"+ result);



    }

    /**
     * Calculates a^b
     * @param a the base number
     * @param b the exponent
     * @return the result of a^b
     */

    public static int pow(int a, int b) {
       int result = 1;



        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }



        }



