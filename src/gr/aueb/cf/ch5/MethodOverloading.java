package gr.aueb.cf.ch5;

/**
 * Overload = ιδιο ονομα μεθοδου , διαφορετικες παραμετροι εισοδου.
 * method signature => ονομα και οι παραμετροι
 */
public class MethodOverloading {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        long longNum = 100L;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        sum1 = add(num1, num2);
        sum2 = add(num1, num2, num3);
        sum3 = add(longNum, num2, num3);
        System.out.println("Το sum1 ειναι "+ sum1);
        System.out.println("Το sum2 ειναι "+ sum2);
        System.out.println("Το sum3 ειναι "+ sum3);


    }

    public static int add(int a, int b) {
        return a + b;
    }

    //Overloaded
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static int add(long a, int b, int c) {
        return (int) a + b + c;
    }

}
