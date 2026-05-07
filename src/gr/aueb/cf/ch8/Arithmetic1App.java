package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * Δημιουργειται ενα {@link ArithmeticException} χώρις
 * να το χειριστουμε
 */
public class Arithmetic1App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Παρακαλω εισαγετε δυο ακεραιους : ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        result = num1 / num2 ;
        System.out.println("to apotelesma einai " +  result);
    }
}
