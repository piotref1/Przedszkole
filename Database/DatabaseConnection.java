package Database;

import jdk.jshell.spi.ExecutionControlProvider;

import java.sql.*;

public class DatabaseConnection {

    public static Connection getConnection() throws Exception {
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/pip?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String username = "root";
            String password = "root";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Connected");
            return conn;
        } catch(Exception e)
        {
            System.out.println(e);
        }
        return null;
    };

    public static void stwTab(){
        try {
            DatabaseCreate.createTable();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
