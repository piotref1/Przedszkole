package Classes;

import java.time.LocalDateTime;

public class ParentTeacherConference extends Types {

    private String name = " z rodzicami.";
    private LocalDateTime date;
    private String babysitter;
    private String group;
    private String specification;

    public ParentTeacherConference(Meeting meeting, LocalDateTime date, String babysitter, String group, String specification){
        super(meeting);
        this.date=date;
        this.babysitter=babysitter;
        this.group=group;
        this.specification=specification;
    }

    public String checkInformationAboutMeeting(){
        return super.checkInformationAboutMeeting() + checkInformationAboutParentTeacherConferenceeeting();
    }

    private String checkInformationAboutParentTeacherConferenceeeting(){
        return name + " Data: "+ date + " opiekun: " + babysitter + " grupa: " + group + " opis: " + specification;
    }
}
