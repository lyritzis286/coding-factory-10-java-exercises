package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyApp {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        int num = 0;

//        try {
//            num = scanner.nextInt();
//            System.out.println("Ο ακεραιος ειναι" + num);
//        }catch (InputMismatchException e) {
//            System.err.println(e.getMessage());
//        }finally {
//            try {
//                if (scanner != null) scanner.close();
//            }catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        }
        try (Scanner scanner = new Scanner(System.in)) {
            num = scanner.nextInt();
            System.out.println("O akeraios pou eisagate einai" + num);
        }catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }
    }
}
