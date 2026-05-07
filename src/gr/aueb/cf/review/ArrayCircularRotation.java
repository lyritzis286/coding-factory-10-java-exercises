package gr.aueb.cf.review;

import java.util.Arrays;

public class ArrayCircularRotation {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 7, 2};
        int[] rotatedRight;
        rotatedRight = shiftRightBy(arr1, 3);
        int[]  rotatedLeft;
        System.out.println(Arrays.toString(rotatedRight));
        rotatedLeft = shiftLeftBy(arr1, 3);
        System.out.println(Arrays.toString(rotatedLeft));

    }

    public static int[] shiftRightBy(int[] arr, int offset) {
        if (arr == null) return new int[0];
        if (offset < 0 ) return new int[0];

        int[] rotated = new int[arr.length];

        for (int i =0; i < arr.length; i++) {
            rotated[(i + offset) % arr.length] = arr[i];
        }
        return rotated;
    }

    public static int[] shiftLeftBy(int[] arr, int offset) {
        if (arr == null) return new int[0];
        if (offset < 0 ) return new int[0];

        int[] rotated = new int[arr.length];

        for (int i =0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length];
        }
        return rotated;
    }
}
