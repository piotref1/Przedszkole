package TestClasses;

import Classes.Parent;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.testng.AssertJUnit.assertEquals;

public class TestParent {

    @Test
    public void checkInformationAboutParent(){
        Parent parent = new Parent();
        parent.setAddress("Ul. Niepokoju 3");
        parent.setKidIndex(20);
        parent.setPhoneNumber("000999888");
        OutputStream actualOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualOutput));
        parent.checkInformationAboutParent();
        String expectedOutput = "20" + " " + "Ul. Niepokoju 3" + " " + "000999888\r\n";
        assertEquals(expectedOutput, actualOutput.toString());
    }


}
