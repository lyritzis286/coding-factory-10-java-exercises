package gr.aueb.cf.ch4;

/**
 * Εκτυπωνει οριζοντια , καθετα,
 * απο 1..10, απο 10..1
 * 10 χ 10 αστερακια
 */
public class Stars {

    public static void main(String[] args) {

        // Δέκα Οριζόντια Stars

        for (int i = 1; i<= 10; i++) {
            System.out.print(" * ");
        }

        // Δέκα Κάθετα αστερακια
        for (int i = 1; i<= 10; i++) {
            System.out.println("*");
        }

        // 10 γραμμές χ 10 αστεράκια η κάθε γραμμή
       for (int i = 1; i<=10; i++) {
           for (int j = 1; j <= 10; j++) {
               System.out.print("*");
           }
           System.out.println();
       }

       // 1η γραμμη 1, 2η γραμμη 2 , 3η γραμμη 3 , .... ,10η γραμμη 10 αστερια

        for (int i = 1; i <=10; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();

        }

        // Το αντιθετο απτο τελευταιο
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j>=i; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
