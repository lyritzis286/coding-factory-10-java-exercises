package gr.aueb.cf.ch7;

public class AllAboutStrings {

    public static void main(String[] args) {
        // ========================================
// Όλες οι βασικές μέθοδοι της κλάσης String
// ========================================

        String s = "Hello World";

// 1. ΒΑΣΙΚΕΣ ΠΛΗΡΟΦΟΡΙΕΣ
        s.length();                          // 11 — μήκος
        s.isEmpty();                         // false — αν είναι ""
        s.isBlank();                         // false — αν είναι "" ή μόνο κενά (Java 11+)

// 2. ΠΡΟΣΒΑΣΗ ΣΕ ΧΑΡΑΚΤΗΡΕΣ
        s.charAt(0);                         // 'H'
        s.charAt(6);                         // 'W'
        s.toCharArray();                     // {'H','e','l','l','o',' ','W','o','r','l','d'}

// 3. ΑΝΑΖΗΤΗΣΗ
        s.indexOf('o');                      // 4 — πρώτη εμφάνιση χαρακτήρα
        s.indexOf("World");                  // 6 — πρώτη εμφάνιση substring
        s.indexOf('z');                      // -1 — δεν υπάρχει
        s.lastIndexOf('o');                  // 7 — τελευταία εμφάνιση
        s.contains("World");                 // true
        s.contains("world");                 // false — case sensitive!
        s.startsWith("Hello");               // true
        s.endsWith("World");                 // true

// 4. ΣΥΓΚΡΙΣΗ (ΠΟΤΕ με ==!)
        String a = "Java";
        String b = "java";
        a.equals(b);                         // false — case sensitive
        a.equalsIgnoreCase(b);               // true — αγνοεί κεφαλαία/πεζά
        a.compareTo(b);                      // αρνητικός — αλφαβητικά πριν
        a.compareTo("Java");                 // 0 — ίσα

// 5. ΠΕΖΑ / ΚΕΦΑΛΑΙΑ
        s.toUpperCase();                     // "HELLO WORLD"
        s.toLowerCase();                     // "hello world"

// 6. ΑΦΑΙΡΕΣΗ ΚΕΝΩΝ
        "   Hello   ".trim();                // "Hello"
        "   Hello   ".strip();               // "Hello" — καλύτερο (Java 11+)

// 7. ΑΝΤΙΚΑΤΑΣΤΑΣΗ
        s.replace('o', '0');                 // "Hell0 W0rld"
        s.replace("World", "Java");          // "Hello Java"
        s.replaceAll("[aeiou]", "*");        // "H*ll* W*rld" — με regex
        s.replaceFirst("l", "L");            // "HeLlo World" — μόνο πρώτη

// 8. SUBSTRING
        s.substring(6);                      // "World" — από τη θέση 6 ως το τέλος
        s.substring(0, 5);                   // "Hello" — από 0 ως 5 (όχι ίδιο 5)
        s.substring(6, 11);                  // "World"

// 9. SPLIT (διαχωρισμός σε array)
        "apple,banana,cherry".split(",");    // {"apple", "banana", "cherry"}
        "name;age;city".split(";");          // {"name", "age", "city"}
        "hello world java".split(" ");       // {"hello", "world", "java"}

// 10. JOIN (ένωση πολλαπλών strings)
        String.join(", ", "apple", "banana", "cherry");  // "apple, banana, cherry"
        String[] arr = {"a", "b", "c"};
        String.join("-", arr);                            // "a-b-c"

// 11. CONCATENATION
        "Hello".concat(" ").concat("World"); // "Hello World"

// 12. ΑΛΛΟΣ ΤΥΠΟΣ → STRING
        String.valueOf(42);                  // "42"
        String.valueOf(3.14);                // "3.14"
        String.valueOf(true);                // "true"
        Integer.toString(42);                // "42"

// 13. STRING → ΑΛΛΟΣ ΤΥΠΟΣ
        Integer.parseInt("42");              // 42
        Double.parseDouble("3.14");          // 3.14
        Boolean.parseBoolean("true");        // true

// 14. FORMAT (μορφοποίηση)
        String.format("Name: %s, Age: %d", "Maria", 25);  // "Name: Maria, Age: 25"
        String.format("%.2f", 3.14159);                    // "3.14"
        String.format("%5d", 42);                          // "   42"

// 15. ΕΠΑΝΑΛΗΨΗ (Java 11+)
        "abc".repeat(3);                     // "abcabcabc"
        "-".repeat(10);                      // "----------"

// 16. ΜΕΤΑΤΡΟΠΗ ΣΕ BYTES
        s.getBytes();                        // bytes της ASCII αναπαράστασης

// ========================================
// ΠΡΟΣΟΧΗ: Τα Strings είναι IMMUTABLE!
// ========================================
        String x = "hello";
        x.toUpperCase();                     // ❌ Δεν αλλάζει τίποτα
        System.out.println(x);               // "hello" — ΑΜΕΤΑΒΛΗΤΟ

        x = x.toUpperCase();                 // ✅ Πρέπει να εκχωρήσεις
        System.out.println(x);               // "HELLO"

// Για πολλές αλλαγές χρησιμοποίησε StringBuilder



    }
}
