package gr.aueb.cf.ch17;

public class GenericMain {
    public static void main(String[] args) {
        GenericNode<String> strNode = new GenericNode<>();
        GenericNode<Double> doubleNode = new GenericNode<>();
        var intNode = new GenericNode<Integer>();

        strNode.setValue("Hello");
        doubleNode.setValue(3.14);
        intNode.setValue(5);

        String str = strNode.getValue();
        Double doubleVal = doubleNode.getValue();
        Integer intVal = intNode.getValue();

    }
}
