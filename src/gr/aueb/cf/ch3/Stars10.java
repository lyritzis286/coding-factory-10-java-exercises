package gr.aueb.cf.ch3;

import java.sql.SQLOutput;

/**
 * Εμφανιζει 10 οριζοντια αστεράκια,
 * δηλαδη ενα αστερακι 10 φορες
 *
 */
public class Stars10 {
    public static void main(String[] args) {

        int i = 1;
        int j = 10;

        while (i <= 10) {
            System.out.print("* ");
            i++;

        }
        while (j >= 1 ){
            System.out.print("* ");
            j--;

        }
    }
}
