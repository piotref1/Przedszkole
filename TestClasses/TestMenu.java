package TestClasses;

import Classes.Menu;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.testng.AssertJUnit.assertEquals;

public class TestMenu {
    @Test
    public void setInformationAboutMenu(){
        Menu menu = new Menu();
        menu.setInformationAboutMenu("Wege","Obiadek");
        assertEquals(menu.getTypeOfMeal(), "Wege");
        assertEquals(menu.getComposition(), "Obiadek");
    }

    @Test
    public void checkInformationAboutMenu(){
        Menu menu = new Menu();
        menu.setInformationAboutMenu("Wege","Obiadek");
        OutputStream actualOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualOutput));
        menu.checkInformationAboutMenu();
        String expectedOutput = "Wege" + " " + "Obiadek\r\n";
        assertEquals(expectedOutput, actualOutput.toString());
    }

}
