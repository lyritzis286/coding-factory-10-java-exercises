package gr.aueb.cf.ch15.interfaces;

public class GenericSchoolServiceProvider {
    private final ISchoolService schoolService;   //Interface ως private Instance.

    public GenericSchoolServiceProvider(ISchoolService schoolService) {
        this.schoolService = schoolService;  //Οχι new αλλα DI (Dependency injection) - IoC (Inversion of Control).
    }

    public void register() {
        schoolService.register();
    }

    public void unregister() {
        schoolService.unregister();
    }


}
