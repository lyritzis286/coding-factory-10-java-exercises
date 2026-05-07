package gr.aueb.cf.ch5;

/**
 * Μεθοδος για τον υπολογισμο μιας δυναμης με αναδρομη
 */
public class PowerRecursive {

    public static void main(String[] args) {

    }

    public static int pow(int base, int power) {
//        if (power == 0) return 1;
//        return base * pow(base, power -1);
        return (power == 0) ? 1 : base * pow(base,  power -1);
    }
//    pow(2, 4) = 2 * pow(2, 3)
//          = 2 * (2 * pow(2, 2))
//            = 2 * (2 * (2 * pow(2, 1)))
//            = 2 * (2 * (2 * (2 * pow(2, 0))))
//            = 2 * (2 * (2 * (2 * 1)))           ← base case! σταματάει εδώ
//            = 2 * (2 * (2 * 2))
//            = 2 * (2 * 4)
//            = 2 * 8
//            = 16
}
