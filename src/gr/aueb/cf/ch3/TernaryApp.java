package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Τριαδικος τελεστης για τον υπολογισμο του
 * μικροτερου μεταξυ δυο ακεραιων
 */
public class TernaryApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("Εισαγετε δυο ακεραιους:");
        num1 = in.nextInt();
        num2 = in.nextInt();

      //  if ( (num1<num2)){
            min = num1;
       // } else {
            min = num2;


        min = num1 < num2 ? num1 : num2;

        System.out.println("Ο μικροτερος αριθμος μεταξυ " + num1 + " και " + num2 + " ειναι " + min);






    }
}
