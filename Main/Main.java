package Main;

import Database.DatabaseConnection;

import java.awt.*;

public class Main {


    public static void main(String[] args){
        DatabaseConnection database = new DatabaseConnection();
        try {
            database.stwTab();
        }catch(Exception e)
        {
            System.out.println(e);
        }
        EventQueue.invokeLater( () ->{
            new LogFrame();
        });
    }
}
