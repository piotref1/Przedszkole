package Classes;

public class Informative implements Meeting {

    private final String name = "Spotkanie informacyjne";

    @Override
    public String checkInformationAboutMeeting() {
        return name;

    }
}
