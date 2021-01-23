package TestClasses;

import Classes.ForKidsThreePlus;
import Classes.ForKidsUnderThree;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.testng.AssertJUnit.assertEquals;

public class TestToys {

    @Test
    public void checkInformationAboutToy() {
        ForKidsUnderThree forKidsUnderThree = new ForKidsUnderThree();
        ForKidsThreePlus forKidsThreePlus = new ForKidsThreePlus();
        forKidsUnderThree.setNameOfToy("kretka");
        forKidsThreePlus.setNameOfToy("pistolet");
        forKidsUnderThree.setPrice(2.5);
        forKidsThreePlus.setPrice(5.5);
        forKidsUnderThree.setSerialNumber(123456);
        forKidsThreePlus.setSerialNumber(654321);
        forKidsUnderThree.setTypeOfToy("kretka do rysowania");
        forKidsThreePlus.setTypeOfToy("bron zaglady");
        OutputStream actualOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualOutput));
        forKidsUnderThree.checkInformationAboutToy();
        String expectedOutput = "Type: kretka do rysowania serialnumber: 123456 price: 2.5" +
                " Name: kretka\r\n";
        assertEquals(expectedOutput, actualOutput.toString());

        OutputStream actualOutput2 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualOutput2));
        forKidsThreePlus.checkInformationAboutToy();
        String expectedOutput2 = "Type: bron zaglady serialnumber: 654321 price: 5.5" +
                " Name: pistolet\r\n";
        assertEquals(expectedOutput2, actualOutput2.toString());
    }
}
