
package lab_jdbc;

import javax.swing.JSpinner;

public class UserTarget {

    static void submit(DataBaseHandler dataBase, JSpinner sTargetThigh, JSpinner sTargetCalf, 
            JSpinner sTargetForearm, JSpinner sTargetChest, JSpinner sTargetBiceps, JSpinner sTargetWeight, JSpinner sTargetWaist) {
        String firstName = dataBase.getAnswer("SELECT `imie` FROM `uzytkownik`");
        String lastName = dataBase.getAnswer("SELECT `nazwisko` FROM `uzytkownik`");
        String query = "DELETE FROM `cel` WHERE `imie` like '" + firstName + "' and `nazwisko` like '" + lastName + "'";
        //System.out.println(query);
        dataBase.update(query);

        query = "INSERT INTO `cel`(`Imie`, `Nazwisko`, `Udo`, `Lydka`, `Przedramie`, `Klatka`, `Biceps`, `Waga`, `Pas`) VALUES (";
        query += "'" + firstName + "'";
        query += ", '" + lastName + "'";
        query += ", " + sTargetThigh.getValue();
        query += ", " + sTargetCalf.getValue();
        query += ", " + sTargetForearm.getValue();
        query += ", " + sTargetChest.getValue();
        query += ", " + sTargetBiceps.getValue();
        query += ", " + sTargetWeight.getValue();
        query += ", " + sTargetWaist.getValue() + ");";
        System.out.println(query);
        dataBase.update(query);
    }
    
}
