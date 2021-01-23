package Classes;

public class PartOfTimetable {
    int numberOfTheDay;
    String day;
    String babysitter;
    String group;
    String hour;

    public PartOfTimetable(String day, String babysitter, String group, String hour){
        this.day=day;
        switch(day){
            case "Poniedzialek":
                numberOfTheDay=1;
                break;
            case "Wtorek":
                numberOfTheDay=2;
                break;
            case "Sroda":
                numberOfTheDay=3;
                break;
            case "Czwartek":
                numberOfTheDay=4;
                break;
            case "Piatek":
                numberOfTheDay=5;
                break;
            default:
                System.out.println("Nie ma takiego dnia");
        }
        this.babysitter=babysitter;
        this.group=group;
        this.hour=hour;

    }

    @Override
    public String toString() {
        return day+"\t"+hour+"\t"+group+"\t"+babysitter;
    }

}
