package gr.aueb.cf.ch17.enums;

public enum WeekDay {
    MONDAY("Δευτέρα"),     //0
    TUESDAY("Τρίτη"),    //1
    WEDNESDAY("Τετάρτη"),  //2
    THURSDAY("Πέμπτη"),   //3
    FRIDAY("Παρασκευή"),     //4
    SATURDAY("Σάββατο"),   //5
    SUNDAY("Κυριακή");     //6

    private final String day;

    WeekDay(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }
}
