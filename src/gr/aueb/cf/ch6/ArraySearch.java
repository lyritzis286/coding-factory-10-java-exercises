package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Αναζητηση ενός στοιχείου σεέναν πίνακα.
 */
public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 0;
        int position = 0;

        System.out.println("Please insert the value you are looking for:");
        value = scanner.nextInt();

        position = getPositionV2(arr1, value);

        if (position == -1) {
            System.out.println("Value not found");
        } else {
            System.out.println("Value: " + arr1[position] + " found at position: " + (position +1));
        }


    }

    public static int getPosition(int[] arr, int value) {
        if (arr == null) return -1;
        for (int i = 0; i < arr.length; i++) { //Διατρεχουμε ολα τα στοιχεια
            if (arr[i] == value) { //συγκριση
                return i;
            }
        }

        return -1; //Δεν βρεθηκε


    }


    public static int getPositionV2(int[] arr, int value) {
        if (arr == null) return -1;
        int positionToReturn = -1;
        for (int i =0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn =i;
                break;
            }
        }
        return positionToReturn;

    }
}


