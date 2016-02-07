package lab_jdbc;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class UserPrivate {

    static void updatePersonalInformation(DataBaseHandler dataBase, JTextField eFirstName, 
            JTextField eLastName, JDateChooser eBirthDate, JSpinner eHeight,
            JSpinner eNeed, JSpinner sProteins, JSpinner sCarbs, JSpinner sFats, 
            JSpinner eBodyFat, JCalendar jCalendar, JRadioButton rbMale) {
        if (validateInfo(eFirstName, eLastName, eBirthDate, eHeight,
                eNeed, sProteins, sCarbs, sFats, eBodyFat, jCalendar,rbMale).length() > 0) {
            String query = new String();
            query = "DELETE FROM `uzytkownik` WHERE nazwisko like '" + eLastName.getText() + "'";
            dataBase.update(query);
            query = validateInfo(eFirstName, eLastName, eBirthDate, eHeight,
                    eNeed, sProteins, sCarbs, sFats, eBodyFat,jCalendar,rbMale);
            dataBase.update(query);
            JOptionPane.showMessageDialog(null, "Dane zaktualizowane pomyślnie!", "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Dane niepoprawne!", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    static String validateInfo(JTextField eFirstName, JTextField eLastName, JDateChooser eBirthDate, 
            JSpinner eHeight, JSpinner eNeed, JSpinner sProteins, JSpinner sCarbs, JSpinner sFats, 
            JSpinner eBodyFat, JCalendar jCalendar, JRadioButton rbMale) {
        /*
         imię i nazwisko nie puste
         data urodzenia < obecna data
         jak mężczyzna to M itd
         wzrost między 100 a 250
         zapotrzebowanie 4-cyfrowe
         bwt min 2 lub 3 cyfrowe
         bodyfat między 1 a 60
         */
        String query = "";

        int len = 0;
        if (eFirstName.getText().length() == 0) {
            System.out.println("1");
            return query;
        }
        if (eBirthDate.getDate().after(new Date())) {
            System.out.println("2");
            return query;
        }
        if (Integer.parseInt(eHeight.getValue().toString()) < 100 || Integer.parseInt(eHeight.getValue().toString()) > 250) {
            System.out.println("3");
            return query;
        }
        len = eNeed.getValue().toString().length();
        if (len != 4) {
            System.out.println("4");
            return query;
        }
        len = sProteins.getValue().toString().length();
        if (len > 3 || len < 2) {
            System.out.println("5");
            return query;
        }
        len = sCarbs.getValue().toString().length();
        if (len > 3 || len < 2) {
            System.out.println("6");
            return query;
        }
        len = sFats.getValue().toString().length();
        if (len > 3 || len < 2) {
            System.out.println("7");
            return query;
        }
        int bf = Integer.parseInt(eBodyFat.getValue().toString());
        if (bf <= 0 || bf > 60) {
            System.out.println("8");
            return query;
        }
        query += "INSERT INTO `uzytkownik`(`Imie`, `Nazwisko`, `Data_urodzenia`, `Plec`, `Wzrost`, `kcal`, `B`, `W`, `T`, `BF`) VALUES (";
        query += "'" + eFirstName.getText() + "'";
        query += ", '" + eLastName.getText() + "'";
        query += ", " + DateHandler.changeDateFormat(eBirthDate.getDate().toString(), jCalendar);
        if (rbMale.isSelected()) {
            query += ", '" + "M" + "'";
        } else {
            query += ", '" + "K" + "'";
        }
        query += ", " + eHeight.getValue();
        query += ", " + eNeed.getValue();
        query += ", " + sProteins.getValue();
        query += ", " + sCarbs.getValue();
        query += ", " + sFats.getValue();
        query += ", " + eBodyFat.getValue();
        query += " );";

        return query;
    }
}
