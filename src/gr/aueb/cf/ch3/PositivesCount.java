package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Μετραει το πληθος των θετικων ακεραιων που δινει ο χργστγς
 * και σταματαει οταν ο χρηστης
 * δωσει εναν αρνητικο ακεραιο
 */
public class PositivesCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int positivesCount = 0;

        System.out.println("Παρακαλω εισαγετε εναν ακεραιο (αρνητικος για εξοδο)");
        num = scanner.nextInt();

        while (num >= 0){
            positivesCount++;
            System.out.println("Παρακαλω εισαγετε εναν ακεραιο (αρνητικος για εξοδο)");
            num = scanner.nextInt();
        }
        System.out.println("Το πληθος των θετικων είναι: "+ positivesCount);
    }
}
