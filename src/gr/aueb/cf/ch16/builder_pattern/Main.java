package gr.aueb.cf.ch16.builder_pattern;

public class Main {

    public static void main(String[] args) {
        Book pythonBook = new Book.Builder(1, "978-3-16-148410-0").build();

        Book javaBook = new Book.Builder(2, "978-0-13-468599-1")
                .title("Effective Java")
                .author("Joshua Bloch")
                .build();

        Book javascriptBook = new Book.Builder(3, "978-1-59327-584-6")
                .title("Eloquent JavaScript")
                .build();


    }
}
