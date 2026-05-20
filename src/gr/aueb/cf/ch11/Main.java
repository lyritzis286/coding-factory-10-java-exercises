package gr.aueb.cf.ch11;

public class Main {

    public static void main(String[] args) {
        Student alice = new Student(); //Default constructor
        Student bob = new Student(); //Default constructor
        Student student = new Student();

        System.out.println("Student instances count " + Student.getStudentCount());

        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("Smith");

        Student student2 = new Student(4, "Dennis" , "D.");
        Student student3 = new Student(5, "Eva" , "E.");;



        bob.setId(2);
        bob.setFirstname("Bob");
        bob.setLastname("Smith");
        bob.setLastname("Smith");;


        student.setId(3);
        student.setFirstname("Student");
        student.setLastname("K.");

        System.out.println("Alice id " + alice.getId());
        System.out.println("Alice Firstname " + alice.getFirstname());
        System.out.println("Alice Lastname " + alice.getLastname());

        System.out.println("Bob id " + bob.getId());
        System.out.println("Bob Firstname " + bob.getFirstname());
        System.out.println("Bob Lastname " + bob.getLastname());

        System.out.println("Student id " + student.getId());
        System.out.println("Student Firstname " + student.getFirstname());
        System.out.println("Student Lastname " + student.getLastname());

//        //Get Values
//        System.out.println("Alice id " + Alice.id);
//        System.out.println("Alice Firstname " + Alice.firstname);
//        System.out.println("Alice Lastname " + Alice.lastname);
//
//        System.out.println("Bob id " + Bob.id);
//        System.out.println("Bob Firstname " + Bob.firstname);
//        System.out.println("Bob Lastname " + Bob.lastname);
//
//        System.out.println("Student id " + student.id);
//        System.out.println("Student Firstname " + student.firstname);
//        System.out.println("Student Lastname " + student.lastname);

    }
}
