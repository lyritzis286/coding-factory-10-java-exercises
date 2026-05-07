package gr.aueb.cf.ch4;

/**
 * Υπολογιζει και εκτυπωνει το αθροισμα
 * και το γινομενο των ακεραιων απο 1 εως 10
 */
public class SumMulApp {

    public static void main(String[] args) {
        //Δηλωση και αρχικοποιηση
        int sum = 0;
        int mul= 1;

        //Επεξεργασια των δεδομενων
        for (int i = 1; i <=10; i++) {
            sum += i; //sum = sum +i
            mul *= i; // mul = mul * i
        }

        System.out.println("To αθροισμα των ακεραιων απο 1 εως 10 ειναι " + sum);
        System.out.println("Το γινομενο των ακεραιων απο 1 εως 10 ειναι " + mul);


    }
}
