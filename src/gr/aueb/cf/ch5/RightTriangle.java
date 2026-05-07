package gr.aueb.cf.ch5;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 *Ο χρηστης εισαγει 3 πλευρες του τριγωνου.Εμφανιζουμε αν το τριγωνο
 * ειναι ορθογωνιο ή οχι
 */
public class RightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        boolean isRightTriangle = false;
        final double EPSILON = 0.000005;
        System.out.println("Δωσε τις τρεις πλευρες του τριγωνου (ξεκινωντας απο την υποτεινουσα)");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        isRightTriangle = Math.abs(a * a - b * b - c * c) < EPSILON;

        System.out.println("Το τριγωνο ειναι ορθογωνιο : "+ isRightTriangle);

    }
}
