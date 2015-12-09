package lab_jdbc;

import java.awt.Color;
//import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Lab_JDBC extends JFrame {

    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;

    public Lab_JDBC(String title) {

        //super(title);                     // invoke the JFrame constructor
        frame = new JFrame(title);
        frame.setVisible(true);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLayout(new FlowLayout());      // set the layout manager

        panel = new JPanel();
        panel.setBackground(Color.red);

        button = new JButton("Click Me!"); // construct a JButton
        label = new JLabel("Label1");

        panel.add(button);
        panel.add(label);
        frame.add(panel);
    }

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

    @SuppressWarnings("null")
    public static void main(String[] args) {

        new Lab_JDBC("Koksy");

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
            rs = stmt.executeQuery("SELECT ID_PRAC, RPAD(NAZWISKO, 12, ' '), ETAT FROM PRACOWNICY");
            System.out.println("Udało się stworzyć ResultSet");
        } catch (SQLException ex) {
            Logger.getLogger(Lab_JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            printResultSet(rs);
        } catch (SQLException ex) {
            Logger.getLogger(Lab_JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*
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
         */
        //TU NIE TRZEBA ZAMYKAC RS BO JEST ZAMYKANY W CLOSEEVERYTHING
        closeEverything(rs, stmt, conn);

    }
}
