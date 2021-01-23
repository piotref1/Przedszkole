package TestClasses;

import Classes.*;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.assertEquals;


public class TestMeeting {


    @Test
    public void checkInformationAboutMeetingTest(){
        Meeting meeting1 = new Tour(new Organizational(), LocalDateTime.of(2002, Month.MARCH, 1, 17, 00), "Kowalska", "312d", "Bardzo wazne spotkanie, prosze wszystkich o przybycie.");
        String acualOutput1= meeting1.checkInformationAboutMeeting();
        String expectedOutput1 = "Spotkanie organizacyjne w sprawie wycieczki. Data: 2002-03-01T17:00 opiekun: Kowalska grupa: 312d opis: Bardzo wazne spotkanie, prosze wszystkich o przybycie.";
        assertEquals(acualOutput1,expectedOutput1);

        Meeting meeting2 = new ParentTeacherConference(new Organizational(), LocalDateTime.of(2001, Month.MARCH, 2, 17, 30), "Nowak", "313d", "Bardzo wazne spotkanie, prosze wszystkich o przybycie.");
        String acualOutput2= meeting2.checkInformationAboutMeeting();
        String expectedOutput2 = "Spotkanie organizacyjne z rodzicami. Data: 2001-03-02T17:30 opiekun: Nowak grupa: 313d opis: Bardzo wazne spotkanie, prosze wszystkich o przybycie.";
        assertEquals(acualOutput2,expectedOutput2);

        Meeting meeting3 = new Contest(new Informative(), LocalDateTime.of(2002, Month.MARCH, 1, 17, 45), "Kowalska", "312d", "Bardzo wazne spotkanie, prosze wszystkich o przybycie.");
        String acualOutput3= meeting3.checkInformationAboutMeeting();
        String expectedOutput3 = "Spotkanie informacyjne w sprawie konkursu. Data: 2002-03-01T17:45 opiekun: Kowalska grupa: 312d opis: Bardzo wazne spotkanie, prosze wszystkich o przybycie.";
        assertEquals(acualOutput3,expectedOutput3);

        Meeting meeting4 = new EducationalMeeting(new Informative(), LocalDateTime.of(2005, Month.MARCH, 1, 17, 55), "Kowalska", "312d", "Bardzo wazne spotkanie, prosze wszystkich o przybycie.");
        String acualOutput4= meeting4.checkInformationAboutMeeting();
        String expectedOutput4 = "Spotkanie informacyjne wychowawcze. Data: 2005-03-01T17:55 opiekun: Kowalska grupa: 312d opis: Bardzo wazne spotkanie, prosze wszystkich o przybycie.";
        assertEquals(acualOutput4,expectedOutput4);

    }
}

