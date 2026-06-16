package gr.aueb.cf.review.ergasia;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Path path = Path.of("C:/Users/lore/Desktop/test.txt");
        LinkedList<Character> chars = new LinkedList<>();
        Map<Character, Integer> frequencies = new HashMap<>();


        try {
            FileReader reader = new FileReader(path.toFile());

            int c;
            while ((c = reader.read()) != -1) {
                char ch = (char) c;
                if (ch == '\r' || ch == '\n' ) continue;
                chars.add(ch);
            }

        } catch (IOException e) {
            System.out.println("Δεν βρέθηκε το αρχείο: " + e.getMessage());
        }

        System.out.println(chars);

        chars.forEach(c -> frequencies.merge(c, 1, Integer::sum));
        System.out.println(frequencies);

        TreeMap<Character, Integer> byChar = new TreeMap<>(frequencies);
        byChar.forEach((key, value) -> System.out.println("key: " + key + " value: " + value));

        int total = chars.size();

        frequencies.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .forEach(entry -> {
                    double percent = 100 * entry.getValue() / total;
                    System.out.println(entry.getKey() + " : " + percent);

                });




    }
}
