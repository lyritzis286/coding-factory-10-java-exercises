package gr.aueb.cf.review;

/**
 * Ο frog απο ενα σημειο χ φτανει η ξεπερναει ενα σημειο y οπου καθε
 * jump εχει μηκος jmp.
 */
public class FrogJumps {

    public static void main(String[] args) {

    }

    public static int howManyJumps(int start, int end, int jump) {
        int numberOfJumps = 0;
        int distanceCovered = 0;

        while (distanceCovered < end - start) {
            distanceCovered += jump;
            numberOfJumps++;
        }
        return numberOfJumps;
    }

    public static int frogJumps2(int start, int end, int jump) {
        return (int) Math.ceil((double)(end - start) / jump);
    }
}
