package Classes;

import java.time.LocalDateTime;

public class Tour extends Types{

    private String name = " w sprawie wycieczki.";
    private LocalDateTime date;
    private String babysitter;
    private String group;
    private String specification;

    public Tour(Meeting meeting, LocalDateTime date, String babysitter, String group, String specification){
        super(meeting);
        this.date=date;
        this.babysitter=babysitter;
        this.group=group;
        this.specification=specification;
    }

    public String checkInformationAboutMeeting(){
        return super.checkInformationAboutMeeting() + checkInformationAboutTourMeeting();
    }

    private String checkInformationAboutTourMeeting(){
        return name + " Data: "+ date + " opiekun: " + babysitter + " grupa: " + group + " opis: " + specification;
    }

}
