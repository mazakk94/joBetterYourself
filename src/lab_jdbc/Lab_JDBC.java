package lab_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab_JDBC {

    public static void main(String[] args) {
        
        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", "login");
        connectionProps.put("password", "haslo");
        try {
        conn = DriverManager.getConnection
        ("jdbc:oracle:thin:@//admlab2-main.cs.put.poznan.pl:1521/dblab01.cs.put.poznan.pl", connectionProps);
        System.out.println("Połączono z bazą danych");
        } catch (SQLException ex) {
        Logger.getLogger(Lab_JDBC.class.getName()).log(Level.SEVERE,
        "nie udało się połączyć z bazą danych", ex);
        System.exit(-1);
        }
    }
}
