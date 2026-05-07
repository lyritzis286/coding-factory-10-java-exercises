package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Fall Through demo of switch / case.
 * O χρηστης δινει ενα βαθμο και επιστρεφουμε
 * feedbacκ αναλογα με το ευρος του βαθμου.
 */
public class FallThrough {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade = 0;

       System.out.println("Δωστε εναν βαθμο (1-10):");
        grade = in.nextInt();

//        switch (grade) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//                System.out.println("Αποτυχία");
//                break;
//            case 5:
//            case 6:
//                System.out.println("Καλως");
//                break;
//            case 7:
//            case 8:
//                System.out.println("Λιαν Καλως");
//                break;
//            case 9:
//            case 10:
//                System.out.println("Αριστα");
//                break;
//            default:
//                System.out.println("Μη εγκυρος βαθμος.Παρακαλω εισαγετε εναν αριθμο μεταξυ 1 και 10");
//        }
        switch (grade) {
            case 1, 2, 3, 4 -> System.out.println("Αποτυχια");
            case 5, 6 -> System.out.println("Καλως");
            case 7, 8 -> System.out.println("Λιαν Καλως");
            case 9, 10 -> System.out.println("Αριστα");
            default -> System.out.println("Μη εγκυρος βαθμος.Παρακαλω εισαγετε εναν αριθμο μεταξυ 1 και 10");
        }

    }
}
