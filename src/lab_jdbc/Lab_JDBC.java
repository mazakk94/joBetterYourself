package lab_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Lab_JDBC/*extends JFrame */{

    final public static void printResultSet(ResultSet rs) throws SQLException {
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        while (rs.next()) {
            for (int i = 1; i <= columnsNumber; i++) {
                if (i > 1) {
                    System.out.print(" | ");
                }
                System.out.print(rs.getString(i));
            }
            System.out.println("");
        }
    }

    final public static void closeEverything(ResultSet rs, Statement stmt, Connection conn) {

        try {
            rs.close();
            System.out.println("Rozłączono ResultSet");
        } catch (SQLException ex) {
            Logger.getLogger(Lab_JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            stmt.close();
            System.out.println("Rozłączono Statement");
        } catch (SQLException ex) {
            Logger.getLogger(Lab_JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            conn.close();
            System.out.println("Rozłączono z bazą danych");
        } catch (SQLException ex) {
            Logger.getLogger(Lab_JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {

        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", "inf117192");
        connectionProps.put("password", "inf117192");

        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//admlab2-main.cs.put.poznan.pl:1521/dblab01.cs.put.poznan.pl", connectionProps);
            System.out.println("Połączono z bazą danych");
        } catch (SQLException ex) {
            Logger.getLogger(Lab_JDBC.class.getName()).log(Level.SEVERE, "nie udało się połączyć z bazą danych", ex);
            System.exit(-1);
        }

        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            System.out.println("Udało się stworzyć Statement");
        } catch (SQLException ex) {
            Logger.getLogger(Lab_JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

        ResultSet rs = null;

        try {
            rs = stmt.executeQuery("SELECT ID_PRAC FROM PRACOWNICY");
            System.out.println("Udało się stworzyć ResultSet");
        } catch (SQLException ex) {
            Logger.getLogger(Lab_JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            printResultSet(rs);
        } catch (SQLException ex) {
            Logger.getLogger(Lab_JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs.close();
            System.out.println("Rozłączono ResultSet");
        } catch (SQLException ex) {
            Logger.getLogger(Lab_JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            rs = stmt.executeQuery("SELECT NAZWISKO FROM PRACOWNICY");
            System.out.println("Udało się stworzyć ResultSet");
        } catch (SQLException ex) {
            Logger.getLogger(Lab_JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            printResultSet(rs);
        } catch (SQLException ex) {
            Logger.getLogger(Lab_JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

        closeEverything(rs, stmt, conn);

    }
}
