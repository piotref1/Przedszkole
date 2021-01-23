package Classes;

public abstract class Types implements Meeting {

    private Meeting meet;

    public Types(Meeting meet){
        this.meet = meet;
    }

    @Override
    public String checkInformationAboutMeeting() {
        return meet.checkInformationAboutMeeting();

    }
}
