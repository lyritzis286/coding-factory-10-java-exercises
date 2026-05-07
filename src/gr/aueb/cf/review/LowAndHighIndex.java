package gr.aueb.cf.review;

/**
 * Εστω ενας πινακας {1,2,4,4,4,6,7,8,8,8,12,12}
 * Να επιστρεφει το low και high index για ενa key
 * Αν το key ειναι το 8 τοτε πρεπει να επιστρεψει {7, 9}
 * ή {8,10} user friendly
 *
 */
public class LowAndHighIndex {

    public static void main(String[] args) {
        int[] arr = {1,2,4,4,4,6,7,8,8,8,12,12};
        int key = 8;
        int[] lowAndHighIndex = lowHighIndex(arr , key);
        System.out.println("low index " + lowAndHighIndex[0]);
        System.out.println("high index " + lowAndHighIndex[1]);

    }

    public static int[] lowHighIndex(int[] arr , int key) {
        int lowIndex = 0;
        int highIndex = 0;
        int pivot = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                lowIndex = i;
                break;
            }
            while (arr[i] == key){
                count++;
            }
        }
        highIndex = lowIndex + count -1;
//        highIndex = lowIndex;
//        pivot = lowIndex +1;
//        while (pivot < arr.length && arr[pivot++] == key) {
//            highIndex++;
//        }

        return new int[] {lowIndex, highIndex};
    }
}
