package lab_jdbc;

import java.sql.*;
import java.util.*;
import java.util.logging.*;

final public class DataBaseHandler {

    Connection conn;
    Properties connectionProps;
    Statement stmt;
    ResultSet rs;

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
    
    final public static void askForSomething(String query){
        /*
        Tworzymy statement
        tworzymy resultset
        
        usuwamy resultset
        usuwamy statement
        */
    }

    public void closeEverything() {

        try {
            rs.close();
            System.out.println("Rozłączono ResultSet");
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            stmt.close();
            System.out.println("Rozłączono Statement");
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            conn.close();
            System.out.println("Rozłączono z bazą danych");
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public DataBaseHandler() {
        
        //FrameMaker frame = new FrameMaker("Koksy");
            //niepotrzebne - nowa formatka
        this.conn = null;
        this.connectionProps = new Properties();
        this.connectionProps.put("user", "inf117192");
        this.connectionProps.put("password", "inf117192");

        try {
            this.conn = DriverManager.getConnection("jdbc:oracle:thin:@//admlab2-main.cs.put.poznan.pl:1521/dblab01.cs.put.poznan.pl", this.connectionProps);
            System.out.println("Połączono z bazą danych");
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, "nie udało się połączyć z bazą danych", ex);
            System.exit(-1);
        }

        this.stmt = null;
        try {
            this.stmt = this.conn.createStatement();
            System.out.println("Udało się stworzyć Statement");
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.rs = null;

        try {
            this.rs = this.stmt.executeQuery("SELECT ID_PRAC, RPAD(NAZWISKO, 12, ' '), ETAT FROM PRACOWNICY");
            System.out.println("Udało się stworzyć ResultSet");
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            printResultSet(this.rs);
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
