package gr.aueb.cf.ch6;

/**
 * Διαβαζεται το ιδιο απο την αρχη προς το τελος
 * και απο το τελος προς την αρχη
 * 1, 2, 3, 3, 2, 1 εινια συμμετρικος πινκας
 * 1, 2, 3, 2, 1 επισης ειναι
 */
public class ArraySymmetric {

    public static void main(String[] args) {


    }

    /**
     * Επιστρέφει true αν ο πίνακας είναι συμμετρικός
     * αλλιώς false.
     *
     * @param arr ο πίνακας
     * @return true ή false
     */
    public static boolean isArraySymmetric(int[] arr) {
        if (arr == null) return false;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) return false;
        }
        return true;
    }
}
