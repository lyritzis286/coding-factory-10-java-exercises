package gr.aueb.cf.review;

/**
 *
 */
public class DiagonalDiff {

    public static void main(String[] args) {

    }

    public static int diagonalDiff(int[][] arr) {
        int digonalA = 0; //Left to Right
        int diagonalB = 0; //Right to Left

        int diff = 0;
        for (int i =0; i < arr.length; i++) {
            digonalA += arr[i][i];
            diagonalB += arr[i][arr[i].length - 1 -i];
        }
        return Math.abs(digonalA - diagonalB);
    }
}
