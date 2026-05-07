package gr.aueb.cf.review;

/**
 * Δινεται ενας πινακας με τα υψη κεριων πχ [3 , 2 , 3 ,1]
 * Μετρηστε ποσα κερια εχουν το μεγιστο υψος
 *
 * Για παραδειγμα εισοδος [4, 4, 1, 3]
 * Εξοδος 2.
 */
public class Candles {

    public static void main(String[] args) {
        int[] candles = {4, 4, 1, 3, 4, 4, 4,};
        System.out.println(maxHeight(candles));

    }

    public static int maxHeight(int[] arr) {
        int maxValue = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        for (int el : arr) {
            if (el == maxValue) {
                count++;
            }
        }
        return count;
    }
}
