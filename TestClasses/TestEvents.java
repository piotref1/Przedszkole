package TestClasses;

import Classes.Events;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.testng.AssertJUnit.assertEquals;

public class TestEvents {
    @Test
    public void checkInformationAboutEvent() {
        Events events = new Events();
        events.setPlaceOfEvent(308);
        events.setPrizes("Plecak");
        events.setTypeOfEvent("Konkurs");
        OutputStream actualOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualOutput));
        events.checkInformationAboutEvent();
        String expectedOutput = "Konkurs" + " " + "Plecak" + " " + "308\r\n";
        assertEquals(expectedOutput, actualOutput.toString());

    }

}
