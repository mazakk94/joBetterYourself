package lab_jdbc;

//import java.sql.*;
import java.util.*;
import java.util.logging.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

final public class DataBaseHandler {

    Connection conn;
    Properties connectionProps;    
    
    
    public DataBaseHandler() { //init and make connection (for localhost at the moment)
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.conn = null;
        this.connectionProps = new Properties();
        this.connectionProps.put("user", "root");
        this.connectionProps.put("password", "");

        try {  
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost/betteryourself", this.connectionProps);
            //this.conn = DriverManager.getConnection("jdbc:mysql://sql7.freesqldatabase.com/sql7133294", this.connectionProps);
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, "nie udało się połączyć z bazą danych", ex);
            System.exit(-1);
        }
    }
    
    
    DataBaseHandler(String dbName, String dbUser, String dbPass) {        //init and make connection for external db
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.conn = null;
        this.connectionProps = new Properties();
        this.connectionProps.put("user", dbUser);
        this.connectionProps.put("password", dbPass);

        try {            
            //this.conn = DriverManager.getConnection("jdbc:mysql://localhost/betteryourself", this.connectionProps);
            this.conn = DriverManager.getConnection("jdbc:mysql://sql7.freesqldatabase.com/" + dbName, this.connectionProps);
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, "nie udało się połączyć z bazą danych", ex);
            System.exit(-1);
        }
    }
    
    
    final public static String getResultString(ResultSet rs) throws SQLException {
        ResultSetMetaData rsmd = rs.getMetaData();
        String resultString = new String();
        int columnsNumber = rsmd.getColumnCount();
        while (rs.next()) {
            for (int i = 1; i <= columnsNumber; i++) {
                if (i > 1) {
                    System.out.print(" | ");
                    resultString = resultString + " ";
                }
                resultString = resultString + rs.getString(i);
            }
            if (columnsNumber > 1) {
                //System.out.println("");
                resultString = resultString + "\n";
            }
        }
        return resultString;
    }

    

    public String getAnswer(String query) {
        
        /*
         Tworzymy statement
         tworzymy resultset
         zadajemy zapytanie
         dodajemy je do zmiennej wybranego typu
         usuwamy resultset
         usuwamy statement
         return zmienna
         */
        
        String result = null;
        Statement stmt = null;
        ResultSet rset = null;

        try {
            stmt = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rset = stmt.executeQuery(query);                                        
            result = getResultString(rset);            
            rset.close();
            stmt.close();            
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    final public static ArrayList<Vector<String>> getResultListofVector(ResultSet rs) throws SQLException {
        ResultSetMetaData rsmd = rs.getMetaData();

        ArrayList<Vector<String>> resultListofVector = new ArrayList<>();
        int columnsNumber = rsmd.getColumnCount();

        while (rs.next()) {
            Vector<String> subVector = new Vector<>();
            for (int i = 1; i <= columnsNumber; i++) {
                subVector.add(rs.getString(i));
            }
            resultListofVector.add(subVector);
        }

        return resultListofVector;
    }

    public ArrayList<Vector<String>> getAnswerListofVector(String query) {

        ArrayList<Vector<String>> resultListofVector = new ArrayList<>();
        Statement stmt = null;
        ResultSet rset = null;
        
        try {
            stmt = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rset = stmt.executeQuery(query);
            resultListofVector = getResultListofVector(rset);
            rset.close();        
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultListofVector;
    }

    final public static ArrayList<ArrayList<String>> getResultListofList(ResultSet rs) throws SQLException {
        ResultSetMetaData rsmd = rs.getMetaData();

        ArrayList<ArrayList<String>> resultListofList = new ArrayList<>();
        int columnsNumber = rsmd.getColumnCount();

        while (rs.next()) {
            ArrayList<String> subList = new ArrayList<>();
            for (int i = 1; i <= columnsNumber; i++) {
                subList.add(rs.getString(i));
            }
            resultListofList.add(subList);
        }

        return resultListofList;
    }

    public ArrayList<ArrayList<String>> getAnswerListofList(String query) {

        ArrayList<ArrayList<String>> resultListofList = new ArrayList<>();
        Statement stmt = null;
        ResultSet rset = null;
        
        try {
            stmt = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);       
            rset = stmt.executeQuery(query);
            resultListofList = getResultListofList(rset);
            rset.close();
            stmt.close();  
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultListofList;
    }

    final public static ArrayList<String> getResultList(ResultSet rs) throws SQLException {

        ArrayList<String> resultList = new ArrayList<>();

        while (rs.next()) {
            String item = new String();
            item = rs.getString(1);
            resultList.add(item);
        }

        return resultList;
    }

    public ArrayList<String> getAnswerList(String query) {

        ArrayList<String> resultList = new ArrayList<>();
        Statement stmt = null;
        ResultSet rset = null;
        
        try {
            stmt = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);        
            rset = stmt.executeQuery(query);
            resultList = getResultList(rset);
            rset.close();        
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultList;
    }

    public void closeEverything() {

        try {
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    void update(String query) {
        Statement stmt = null;

        try {
            stmt = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

/*final public static void printResultList(ResultSet rs) throws SQLException {
 ResultSetMetaData rsmd = rs.getMetaData();

 @SuppressWarnings("Convert2Diamond")
 ArrayList<ArrayList<String>> resultList = new ArrayList<ArrayList<String>>();

 //System.out.println("Zaczynam printResultList ...");
 int columnsNumber = rsmd.getColumnCount();
 while (rs.next()) {
 //List subList = new ArrayList();
 @SuppressWarnings("Convert2Diamond")
 ArrayList<String> subList = new ArrayList<String>();
 for (int i = 1; i <= columnsNumber; i++) {
 subList.add(rs.getString(i));// = resultString + " " + rs.getString(i);
 }
 resultList.add(subList);
 }

 for (int i = 0; i < resultList.size(); i++) {
 for (int j = 0; j < resultList.get(i).size(); j++) {
 System.out.print(resultList.get(i).get(j));
 System.out.print(" ");
 }
 //System.out.println("");
 }
 //System.out.println("Kończę printResultList ...");
 }*/
