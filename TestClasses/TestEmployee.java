package TestClasses;

import Classes.Employee;
import Classes.Kid;
import Classes.Principal;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotSame;

public class TestEmployee {

    @Test
    public void CreateChildGroup() {
        Employee employee = new Employee();
        employee.CreateChildGroup(200);
        int expectedOutput = 200;
        assertEquals(employee.groupList.get(0).groupIndex, expectedOutput);
    }

    @Test
    public void addTheChildToGroup(){
        Employee employee = new Employee();
        employee.CreateChildGroup(200);
        Kid kid1 = new Kid();
        Kid kid2 = new Kid();
        kid1.setName("Bartek");
        kid1.setSurname("Marciniak");
        kid1.setBirthDate("20.10.2010r");
        kid1.setAllergens("Orzechy");
        kid2.setName("Marcin");
        kid2.setSurname("Barciniak");
        kid2.setBirthDate("10.11.2010r");
        kid2.setAllergens("Mleko");
        employee.addTheChildToGroup(employee.groupList.get(0),kid1);
        employee.addTheChildToGroup(employee.groupList.get(0),kid2);
        assertEquals(employee.groupList.get(0).kidListGroup.get(0), kid1);
        assertEquals(employee.groupList.get(0).kidListGroup.get(1), kid2);
    }

    @Test
    public void removeTheChildFromGroup() {
        Employee employee = new Employee();
        employee.CreateChildGroup(200);
        Kid kid1 = new Kid();
        Kid kid2 = new Kid();
        kid1.setName("Bartek");
        kid1.setSurname("Marciniak");
        kid1.setBirthDate("20.10.2010r");
        kid1.setAllergens("Orzechy");
        kid2.setName("Marcin");
        kid2.setSurname("Barciniak");
        kid2.setBirthDate("10.11.2010r");
        kid2.setAllergens("Mleko");
        employee.addTheChildToGroup(employee.groupList.get(0),kid1);
        employee.addTheChildToGroup(employee.groupList.get(0),kid2);
        employee.removeTheChildFromGroup(employee.groupList.get(0), kid1);
        assertNotSame(employee.groupList.get(0).kidListGroup.get(0), kid1);
    }

    @Test
    public void checkListOfChildrenInSystem() {
        Principal principal = new Principal();
        Kid kid1 = new Kid();
        Employee employee = new Employee();
        kid1.setName("Bartek");
        kid1.setSurname("Marciniak");
        kid1.setBirthDate("20.10.2010r");
        kid1.setAllergens("Orzechy");
        principal.addChildToSystem(kid1);
        OutputStream actualOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualOutput));
        employee.checkListOfChildrenInSystem(principal);
        String expectedOutput = "Bartek" + " " + "Marciniak\r\n";
        assertEquals(expectedOutput, actualOutput.toString());
    }


}
