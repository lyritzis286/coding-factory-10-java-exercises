package gr.aueb.cf.ch7;

import java.util.Scanner;

public class StrInputOutput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = "";
        String str2 = "";
        System.out.println("Παρακαλω εισαγετε δυο string : ");
        str1 = in.next();        // Διαβαζει μεχρι το πρωτο γουαιτ σπεις κενο
        str2 = in.nextLine();   //Διαβαζει μεχρι να βρει new line

    }
}
