package gr.aueb.cf.ch15.interfaces;

public class Main {

    public static void main(String[] args) {
        ISchoolService studentService = new StudentServiceImpl();
        ISchoolService teacherService = new TeacherServiceImpl();

        studentService.register();
        teacherService.register();

        studentService.unregister();
        teacherService.unregister();
    }

    //Agnostic
    public static void doRegister(ISchoolService service) {
        service.register();
    }
}
