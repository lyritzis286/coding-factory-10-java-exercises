package gr.aueb.cf.review;

import java.util.Arrays;

/**
 * Έστω οτι θέλουμε να αναπαριστούμε μεγάλους ακεραίους σε μορφή πίνακα
 *και θέλουμε να προσθέσουμε τη μονάδα.
 */
public class AddOneApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 8};
        int[] result;
        result = addOne(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] addOne(int[] arr) {
        int [] arrOut = new int[arr.length + 1];
        int sum = 0;
        int carry = 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            sum = arr[i] + carry;
            arrOut[i + 1] = sum % 10;
            carry = sum / 10;
        }
        if (carry == 1) {
            arrOut[0] = 1;
        }

        return arrOut;
    }
}
