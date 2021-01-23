package TestClasses;

import Classes.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotSame;

public class TestPrincipal {

    @Test
    public void addEmployeeToSystem(){
        Principal principal = new Principal();
        Employee employee = new Employee();
        employee.setName("Artur");
        employee.setSurname("Buba");
        principal.addEmployeeToSystem(employee);
        assertEquals(principal.employeeSystemList.get(0).getName(), "Artur");
        assertEquals(principal.employeeSystemList.get(0).getSurname(), "Buba");
    }

    @Test
    public void addChildToSystem() {
        Principal principal = new Principal();
        Kid kid1 = new Kid();
        kid1.setName("Bartek");
        kid1.setSurname("Marciniak");
        kid1.setBirthDate("20.10.2010r");
        kid1.setAllergens("Orzechy");
        principal.addChildToSystem(kid1);
        assertEquals(principal.kidSystemList.get(0).getName(), "Bartek");
        assertEquals(principal.kidSystemList.get(0).getSurname(), "Marciniak");
    }

    @Test
    public void deleteChildFromSystem() {
        Principal principal = new Principal();
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
        principal.addChildToSystem(kid1);
        principal.addChildToSystem(kid2);
        principal.deleteChildFromSystem(kid1);
        assertNotSame(principal.kidSystemList.get(0), kid1);

    }

    @Test
    public void deleteEmployeeFromTheSystem() {
        Principal principal = new Principal();
        Employee employee1 = new Employee();
        employee1.setName("Artur");
        employee1.setSurname("Buba");
        Employee employee2 = new Employee();
        employee2.setName("Artur2");
        employee2.setSurname("Buba2");
        principal.addEmployeeToSystem(employee1);
        principal.addEmployeeToSystem(employee2);
        principal.deleteEmployeeFromTheSystem(employee1);
        assertNotSame(principal.employeeSystemList.get(0), employee1);

    }

    @Test
    public void addBabysitterToGroup() {
        Principal principal = new Principal();
        Babysitter babysitter= new Babysitter();
        babysitter.setName("name1");
        babysitter.setSurname("surname1");
        babysitter.setSpecialization("Medyk");
        babysitter.CreateChildGroup(111);
        principal.addBabysitterToGroup(babysitter,babysitter.groupList.get(0));
        assertEquals(babysitter.groupList.get(0).babysitterListGroup.get(0).getName(),"name1");
        assertEquals(babysitter.groupList.get(0).babysitterListGroup.get(0).getSurname(),"surname1");
        assertEquals(babysitter.groupList.get(0).babysitterListGroup.get(0).getSpecialization(),"Medyk");

    }

    @Test
    public void deleteBabysitterFromTheGroup() {
        Principal principal = new Principal();
        Babysitter babysitter1= new Babysitter();
        babysitter1.setName("name1");
        babysitter1.setSurname("surname1");
        babysitter1.setSpecialization("Medyk");
        Babysitter babysitter2= new Babysitter();
        babysitter2.setName("name2");
        babysitter2.setSurname("surname2");
        babysitter2.setSpecialization("Medyk2");
        babysitter2.CreateChildGroup(111);
        principal.addBabysitterToGroup(babysitter1,babysitter2.groupList.get(0));
        principal.addBabysitterToGroup(babysitter2,babysitter2.groupList.get(0));
        principal.deleteBabysitterFromTheGroup(babysitter1,babysitter2.groupList.get(0));
        assertNotSame(babysitter2.groupList.get(0).babysitterListGroup.get(0),babysitter1);
    }

    @Test
    public void buyToys() {
        Principal principal = new Principal();
        Toys toys = new Toys();
        toys.setPrice(3);
        toys.setSerialNumber(111111111);
        toys.setTypeOfToy("Samochodzik");
        principal.buyToys(toys);
        OutputStream actualOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualOutput));
        toys.checkInformationAboutToy();
        String expectedOutput = "Type: Samochodzik" + " serialnumber: 111111111"
                + " price: 3.0\r\n";
        assertEquals(expectedOutput, actualOutput.toString());
    }

    @Test
    public void checkListOfEmployeesInSystem() {
        Principal principal = new Principal();
        Employee employee = new Employee();
        employee.setName("Artur");
        employee.setSurname("Buba");
        principal.addEmployeeToSystem(employee);
        OutputStream actualOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualOutput));
        principal.checkListOfEmployeesInSystem();
        String expectedOutput = "Pracownicy w systemie: \r\n" + "Artur Buba\r\n";
        assertEquals(expectedOutput, actualOutput.toString());
    }

    @Test
    public void checkListOfKidsInSystem() {
        Principal principal = new Principal();
        Kid kid1 = new Kid();
        kid1.setName("Bartek");
        kid1.setSurname("Marciniak");
        kid1.setBirthDate("20.10.2010r");
        kid1.setAllergens("Orzechy");
        principal.addChildToSystem(kid1);
        OutputStream actualOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualOutput));
        principal.checkListOfKidsInSystem();
        String expectedOutput = "Dzieci w systemie: \r\n" + "Bartek Marciniak\r\n";
        assertEquals(expectedOutput, actualOutput.toString());
    }

}
