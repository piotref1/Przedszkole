package TestClasses;

import Classes.Cook;
import Classes.Menu;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.testng.AssertJUnit.assertEquals;

public class TestCook {

    @Test
    public void setInformationAboutMenu() {
        Menu menu = new Menu();
        Cook cook = new Cook();
        cook.setInformationAboutMenu(menu,"Wege","Obiad");
        OutputStream actualOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualOutput));
        menu.checkInformationAboutMenu();
        String expectedOutput = "Wege" + " " + "Obiad\r\n";
        assertEquals(expectedOutput, actualOutput.toString());
    }

    public void checkInformationAboutAllergens() {

    }

}
