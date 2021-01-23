package Classes;

import java.time.LocalDateTime;

public class EducationalMeeting extends Types{

    private String name = " wychowawcze.";
    private LocalDateTime date;
    private String babysitter;
    private String group;
    private String specification;

    public EducationalMeeting(Meeting meeting, LocalDateTime date, String babysitter, String group, String specification){
        super(meeting);
        this.date=date;
        this.babysitter=babysitter;
        this.group=group;
        this.specification=specification;
    }

    public String checkInformationAboutMeeting(){
        return super.checkInformationAboutMeeting() + checkInformationAboutEducationalMeeting();
    }

    private String checkInformationAboutEducationalMeeting(){
        return name + " Data: "+ date + " opiekun: " + babysitter + " grupa: " + group + " opis: " + specification;
    }

}
