package TestClasses;

import Classes.Babysitter;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.testng.AssertJUnit.assertEquals;

public class TestBabysitter {


    @Test
    public void checkInformationAboutBabysitter(){
        Babysitter babysitter = new Babysitter();
        babysitter.setSpecialization("Psycholog");
        OutputStream actualOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualOutput));
        babysitter.checkInformationAboutBabysitter();
        String expectedOutput = "Psycholog\r\n";
        assertEquals(expectedOutput, actualOutput.toString());
    }
}
