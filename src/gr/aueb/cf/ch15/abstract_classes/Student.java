package gr.aueb.cf.ch15.abstract_classes;

/**
 * Java Bean - POJO (Plain Old Java Object)
 * Απλή data κλάση με τρία πεδία (fields)
 * Απλών και σύνθετων τύπων.
 */
public class Student {
    public static int studentCount = 0;
    private int id;
    private String firstname;
    private String lastname;
    private String region;

    public Student() {
        studentCount++;

    }


    public Student(int id, String firstname, String lastname, String region) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.region = region;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setId(int id) {
         this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}





