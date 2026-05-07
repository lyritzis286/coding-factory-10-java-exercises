package gr.aueb.cf.ch7;

public class StrIndexOf {

    public static void main(String[] args) {
        String s = "Coding Factory";

        int positionOfo = s.indexOf('o');  // 1
        int positionOfLasto = s.lastIndexOf('0');

    }

    //Μεθοδος που επιστρεφει την καταληξη του ονοματος ενος αρχειου
    //π.χ αμα εχουμε coding.txt -> txt
    public static String getFileNameExtension(String filename) {
        int dotIndex = filename.lastIndexOf('.');
        return filename.substring(filename.lastIndexOf(dotIndex + 1));

    }
}
