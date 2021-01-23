package TestClasses;


import Classes.User;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.testng.AssertJUnit.assertEquals;

public class TestUser {
    @Test
    public void checkInformationAboutUser(){
        User user = new User();
        user.setName("name1");
        user.setSurname("surname1");
        user.setLogin("login1");
        user.setPassword("password1");
        OutputStream actualOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualOutput));
        user.checkInformationAboutUser();
        String expectedOutput = "name1 surname1 login1 password1\r\n";
        assertEquals(expectedOutput, actualOutput.toString());

    }

}
