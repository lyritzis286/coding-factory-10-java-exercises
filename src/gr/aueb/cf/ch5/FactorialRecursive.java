package gr.aueb.cf.ch5;

/**
 * Υπολογίζει το παραγοντικό του n
 * με αναδρομικό τρόπο
 */
public class FactorialRecursive {

    public static void main(String[] args) {
        int result = 0;
        int n = 0;
        result = facto(5);
        System.out.println("The factorial of " + n + " is " + result);

    }

    public static int facto(int n) {
//        if (n <= 1) return 1;
//        return n * facto(n -1);

        return (n ==1) ? 1 : n * facto(n -1);
    }


//    facto(5) = 5 * facto(4)
//         = 5 * (4 * facto(3))
//            = 5 * (4 * (3 * facto(2)))
//            = 5 * (4 * (3 * (2 * facto(1))))
//            = 5 * (4 * (3 * (2 * 1)))           ← base case! σταματάει εδώ
//            = 5 * (4 * (3 * 2))
//            = 5 * (4 * 6)
//            = 5 * 24
//            = 120
}
