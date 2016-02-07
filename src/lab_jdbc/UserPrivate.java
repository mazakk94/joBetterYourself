package lab_jdbc;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class UserPrivate {

    static void loadPersonInfo(String secondName, DataBaseHandler dataBase, JTextField eFirstName,
            JTextField eLastName, JDateChooser eBirthDate, JRadioButton rbMale,
            JRadioButton rbFemale, JSpinner eHeight, JSpinner eNeed, JSpinner sProteins,
            JSpinner sCarbs, JSpinner sFats, JSpinner eBodyFat) {

        String query = "SELECT * FROM `uzytkownik`";

        ArrayList<ArrayList<String>> list = new ArrayList<>();
        list = dataBase.getAnswerListofList(query);
        //System.out.println(list.get(0));

        eFirstName.setText(list.get(0).get(0));
        eLastName.setText(list.get(0).get(1));

        String birthDate = list.get(0).get(2);
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(birthDate);
            eBirthDate.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(WindowMaker.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (list.get(0).get(3).equals("M")) {
            rbMale.setSelected(true);
        } else {
            rbFemale.setSelected(true);
        }
        eHeight.setValue(Integer.parseInt(list.get(0).get(4)));
        eNeed.setValue(Integer.parseInt(list.get(0).get(5)));
        sProteins.setValue(Integer.parseInt(list.get(0).get(6)));
        sCarbs.setValue(Integer.parseInt(list.get(0).get(7)));
        sFats.setValue(Integer.parseInt(list.get(0).get(8)));
        eBodyFat.setValue(Integer.parseInt(list.get(0).get(9)));
    }

    static void personInfoListener(JTabbedPane tabbedPanel, String secondName,
            DataBaseHandler dataBase, JTextField eFirstName, JTextField eLastName,
            JDateChooser eBirthDate, JRadioButton rbMale, JRadioButton rbFemale,
            JSpinner eHeight, JSpinner eNeed, JSpinner sProteins,
            JSpinner sCarbs, JSpinner sFats, JSpinner eBodyFat) {
        tabbedPanel.addChangeListener(new ChangeListener() {
            @SuppressWarnings("override")
            public void stateChanged(ChangeEvent e) {
                loadPersonInfo(secondName, dataBase, eFirstName, eLastName, eBirthDate, rbMale,
                        rbFemale, eHeight, eNeed, sProteins, sCarbs, sFats, eBodyFat);
            }
        }
        );
    }

    static void updatePersonalInformation(DataBaseHandler dataBase, JTextField eFirstName,
            JTextField eLastName, JDateChooser eBirthDate, JSpinner eHeight,
            JSpinner eNeed, JSpinner sProteins, JSpinner sCarbs, JSpinner sFats,
            JSpinner eBodyFat, JCalendar jCalendar, JRadioButton rbMale) {
        if (validateInfo(eFirstName, eLastName, eBirthDate, eHeight,
                eNeed, sProteins, sCarbs, sFats, eBodyFat, jCalendar, rbMale).length() > 0) {
            String query = new String();
            query = "DELETE FROM `uzytkownik` WHERE nazwisko like '" + eLastName.getText() + "'";
            dataBase.update(query);
            query = validateInfo(eFirstName, eLastName, eBirthDate, eHeight,
                    eNeed, sProteins, sCarbs, sFats, eBodyFat, jCalendar, rbMale);
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
