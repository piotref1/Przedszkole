package TestClasses;

import Classes.PartOfTimetable;
import Classes.Timetable;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTimetable {


    @Test
    public void checkInformationAboutTimetableTest(){
        PartOfTimetable Day1= new PartOfTimetable("Wtorek","Kowalska","312d","8:00-15:00");
        PartOfTimetable Day2= new PartOfTimetable("Poniedzialek","Nowak","312b","8:00-15:00");
        Timetable test= Timetable.getInstance();
        test.getTimetable().add(Day1);
        test.getTimetable().add(Day2);
        OutputStream actualOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualOutput));
        test.checkInformationAboutTimetable();
        String expectedOutput = "Poniedzialek\t8:00-15:00\t312b\tNowak\r\nWtorek\t8:00-15:00\t312d\tKowalska\r\n";
        assertEquals(expectedOutput, actualOutput.toString());
    }

}
