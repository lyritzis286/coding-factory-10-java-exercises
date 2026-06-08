package gr.aueb.cf.ch17;

public class GenericMethods {

    public static void main(String[] args) {
        String[] strArr = {"Hello", "World"};
        printArray(strArr);

        Integer[] intArr = {1, 2, 3};
        printArray(intArr);
    }

    public static <T> void printArray(T[] array) {
        for (T el : array) {
            System.out.println(el);
        }
    }

    public static void print(GenericNode<?> node) {
        System.out.println(node.getValue());
    }

    public static void printNumbers(GenericNode<? extends Number> node) {
        System.out.println(node.getValue());
    }

    public static void printNumbers2(GenericNode<? super Number> node) {
        System.out.println(node.getValue());
    }
}
