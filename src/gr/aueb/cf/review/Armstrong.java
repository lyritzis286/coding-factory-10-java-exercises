package gr.aueb.cf.review;

/**
 * Ένας αριθμός Armstrong είναι ένας ακέραιος
 * αριθμός που είναι ίσος με το άθροισμα των ψηφίων του
 * όπου το κάθε ψηφίο έχει υψωθεί στην δύναμη του αριθμού
 * των ψηφίων
 *
 * Για παράδειγμα: 153 = 1^3 + 5^3 + 3^3
 */
public class Armstrong {
    public static void main(String[] args) {

    }

    public static boolean isArmstrong(int num) {
        int numberOfDigits = 0;
        int temp = num;
        int digit = 0;
        int sum = 0;

        //Πρωτο βρισκουμε το πληθος των ψηφιων
        //με διαδοχικες διαιρεσεις με το 10
        temp = num;
        while(temp !=0) {
            temp /= 10;    //temp = temp / 10
            numberOfDigits++;
        }

        //Βρισκουμε το καθε ψηφιο με mod 10 και προσθετουμε
        //το ψηφιο υψωμενο στη δυναμη του πληθους των ψηφιων
        temp = num;
        while (temp !=0) {
            digit = temp % 10;
            sum += (int) Math.pow(digit, numberOfDigits);
            temp /= 10;
        }
        return sum == num;
    }
}
