package gr.aueb.cf.ch6;

/**
 *
 */
public class ArrayCountApp {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, };
        int count  = 0;

        count = getCount(arr , 4);

    }

    /**
     * Calculates the count of times an element
     * exists in a given array
     * @param arr   the input array to search through
     * @param value  the value to count in the array
     * @return       the count of occurrences of the value in the array
     */
    public static int getCount(int[] arr, int value) {
        if (arr ==  null)return -1;
        int count = -1;
        for (int i : arr){
           if (i == value ) {
               count++;
           }

        }
        return count;

    }
}
