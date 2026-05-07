package gr.aueb.cf.review;

/**
 * Εστω ενας πινακας με n στοιχεια απο 1 εως n+1
 * Βρειτε το στοιχεο που λειπει
 */
public class MissingElement {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int missing = 0;

        missing = findMissingElement(arr1);
        System.out.println(missing);

    }

    public static int findMissingElement(int[] arr) {
        int counter = 0;

        while (counter < arr.length) {
            counter++;
            if (arr[counter]-counter > 1){
                break;
            }

        }
        return counter + 1;
    }

    public static int missingElement2(int[] arr) {
        int expectedSum = 0;
        int actualSum = 0;
        int n = 0;

         n = arr.length;
         expectedSum = (n +1) * (n +2) / 2;
         for (int el : arr) {
             actualSum +=el;
         }
         return  expectedSum - actualSum;
    }
}
