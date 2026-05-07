package gr.aueb.cf.ch5;

/**
 * Ορίζει μια μέθοδο void swap(int a, int b) η
 * οποια εχει στοχο να ανταλλαξει αμοιβαια τις τιμες των a και b
 * δηλαδη το α να γινει β και το β να γινει α
 */
public class SwapApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.printf("Πριν το swap : a = %d, b = %d\n", a, b);
        swap(a, b);

        System.out.printf("Μετα το swap : a = %d, b = %d\n", a, b);

    }

    /**
     * Swaps the values of a and b.
     * @param a  the first integer to swap.
     * @param b  the second integer to swap.
     */
    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b= tmp;





    }
}
