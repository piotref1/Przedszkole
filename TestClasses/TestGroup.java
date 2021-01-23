package TestClasses;

import Classes.Babysitter;
import Classes.Group;
import Classes.Kid;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.testng.AssertJUnit.assertEquals;

public class TestGroup {

    @Test
    public void checkInformationAboutGroup() {
        Group group = new Group(200);
        Kid kid1 = new Kid();
        kid1.setName("Bartek");
        kid1.setSurname("Marciniak");
        kid1.setBirthDate("20.10.2010r");
        kid1.setAllergens("Orzechy");
        Babysitter babysitter = new Babysitter();
        babysitter.setSpecialization("Psycholog");
        babysitter.setName("name1");
        babysitter.setSurname("surname1");
        group.kidListGroup.add(kid1);
        group.babysitterListGroup.add(babysitter);
        OutputStream actualOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualOutput));
        group.checkInformationAboutGroup();
        String expectedOutput = "Index Grupy: 200\r\n" + "Dzieci: \r\nBartek Marciniak\r\n"
                + "Opiekunki: \r\n" + "name1 surname1 Psycholog\r\n";
        assertEquals(expectedOutput, actualOutput.toString());
    }

}
