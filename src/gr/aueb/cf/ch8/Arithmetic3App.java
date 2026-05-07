package gr.aueb.cf.ch8;

import java.util.Scanner;

public class Arithmetic3App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Παρακαλω εισαγετε δυο ακεραιους :");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        if (num2 == 0) {
            System.out.println("Δεν επιτρεπεται η διαιρεση με το 0");
            System.out.println();
            System.out.println("Παρακαλω εισάγετε ξανα παρονομαστη");
            num2 = scanner.nextInt();
            result = num1 / num2;
            System.out.println("Το αποτελεσμα ειναι : " + result);


        } else {
            result = num1 / num2;
            System.out.println("Το αποτελεσμα ειναι : " + result);
        }
    }
}
