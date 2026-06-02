package gr.aueb.cf.ch15.interfaces;

public class SchoolServiceProvider {
    private TeacherServiceImpl teacherService;

    public SchoolServiceProvider() {
        teacherService = new TeacherServiceImpl();
    }

    public void register() {
        teacherService.register();
    }

    public void unregister() {
        teacherService.unregister();
    }
}
