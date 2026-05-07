package gr.aueb.cf.ch7;

/**
 * s1 δείχνει σε νέα τιμή στο Heap ενώ το παλιό sting
 * μενει χωρις αναφορα και γινεται garbage collected
 *
 * επομενως τα stings ειναι immutable.
 */
public class ImmutableApp {

    public static void main(String[] args) {
        String s1 = "Coding Factory";

        s1 = "Coding Plus";

    }
}
