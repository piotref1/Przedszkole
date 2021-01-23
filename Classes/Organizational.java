package Classes;

public class Organizational implements Meeting {

    private final String name = "Spotkanie organizacyjne";

    @Override
    public String checkInformationAboutMeeting() {
        return name;
    }
}
