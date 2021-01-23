package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DatabaseCreate {

    public static void createTable() throws Exception{
        try
        {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement create1 = con.prepareStatement("CREATE TABLE IF NOT EXISTS User(id int NOT NULL AUTO_INCREMENT,name varchar(50),surname varchar(255), login varchar(20) UNIQUE,password varchar(16), PRIMARY KEY(id))");
            create1.executeUpdate();
        }catch(Exception e){System.out.println(e);}
        finally {System.out.println("Create table User completed");
        }

        try
        {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement create2 = con.prepareStatement("CREATE TABLE IF NOT EXISTS Parent(id int NOT NULL AUTO_INCREMENT,kidIndex int,address varchar(255),phoneNumber varchar(11) UNIQUE, PRIMARY KEY(id))");
            create2.executeUpdate();
        }catch(Exception e){System.out.println(e);}
        finally {System.out.println("Create table Parent completed");
        }

        try
        {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement create3 = con.prepareStatement("CREATE TABLE IF NOT EXISTS Events(id int NOT NULL AUTO_INCREMENT,typeOfEvent varchar(20),prizes varchar(255),placeOfEvent varchar(20) , PRIMARY KEY(id))");
            create3.executeUpdate();
        }catch(Exception e){System.out.println(e);}
        finally {System.out.println("Create table Events completed");
        }

        /*try
        {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement create4 = con.prepareStatement("CREATE TABLE IF NOT EXISTS Principal(id int NOT NULL AUTO_INCREMENT,employee_ID int, PRIMARY KEY(id))");
            create4.executeUpdate();
        }catch(Exception e){System.out.println(e);}
        finally {System.out.println("Create table Principal completed");
        }*/

        try
        {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement create5 = con.prepareStatement("CREATE TABLE IF NOT EXISTS Toys(id int NOT NULL AUTO_INCREMENT,typeOfToy varchar(50), serialNumber varchar(50), price varchar(10), PRIMARY KEY(id))");
            create5.executeUpdate();
        }catch(Exception e){System.out.println(e);}
        finally {System.out.println("Create table Toys completed");
        }

        try
        {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement create6 = con.prepareStatement("CREATE TABLE IF NOT EXISTS Timetable(id int NOT NULL AUTO_INCREMENT,group_ID int,babysitter_ID int, timetable_date datetime, PRIMARY KEY(id))");
            create6.executeUpdate();
        }catch(Exception e){System.out.println(e);}
        finally {System.out.println("Create table Timetable completed");
        }

        try
        {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement create7 = con.prepareStatement("CREATE TABLE IF NOT EXISTS kid_groups(id int NOT NULL AUTO_INCREMENT, nazwa varchar(30), PRIMARY KEY(id))");
            create7.executeUpdate();
        }catch(Exception e){System.out.println(e);}
        finally {System.out.println("Create table Kid_group completed");
        }

        try
        {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement create8 = con.prepareStatement("CREATE TABLE IF NOT EXISTS Kid(id int NOT NULL AUTO_INCREMENT,name varchar(50),surname varchar(255), birthDate varchar(20), allergies varchar(255), PRIMARY KEY(id))");
            create8.executeUpdate();
        }catch(Exception e){System.out.println(e);}
        finally {System.out.println("Create table Kid completed");
        }

        try
        {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement create9 = con.prepareStatement("CREATE TABLE IF NOT EXISTS Meeting(id int NOT NULL AUTO_INCREMENT,group_ID int,meetingType varchar(250), meeting_Date datetime, classroom varchar(30), PRIMARY KEY(id))");
            create9.executeUpdate();
        }catch(Exception e){System.out.println(e);}
        finally {System.out.println("Create table Timetable completed");
        }
    }
}
