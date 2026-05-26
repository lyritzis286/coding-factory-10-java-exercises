package gr.aueb.cf.ch13;

public class OnlyOneCodingFactory {

    private static OnlyOneCodingFactory INSTANCE = new OnlyOneCodingFactory();

    private OnlyOneCodingFactory() {
    }

    public static OnlyOneCodingFactory getInstance() {
        return INSTANCE;
    }

    public void doSomething() {
        System.out.println("Say Hello");
    }
}
