package TestClasses;

import Classes.Kid;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.testng.AssertJUnit.assertEquals;

public class TestKid {

    @Test
    public void checkInformationAboutKid(){
        Kid kid1 = new Kid();
        kid1.setName("Bartek");
        kid1.setSurname("Marciniak");
        kid1.setBirthDate("20.10.2010r");
        kid1.setAllergens("Orzechy");
        OutputStream actualOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualOutput));
        kid1.checkInformationAboutKid();
        String expectedOutput = "Bartek" + " " + "Marciniak" + " " + "20.10.2010r" + " " + "Orzechy\r\n";
        assertEquals(expectedOutput, actualOutput.toString());

    }

}
