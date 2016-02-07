package lab_jdbc;

import com.toedter.calendar.JCalendar;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CalendarTraining {

    static void deleteSet(JTable tblExercises, JButton jSubmitTraining) {
        int row = tblExercises.getSelectedRow();

        //System.out.println("usuwam wiersz nr: " + row);
        if (row >= 0) {
            jSubmitTraining.setText("Zapisz zmiany");
            //String strNr = Integer.toString(row);
            String nr = tblExercises.getValueAt(row, 0).toString();
            String exercise = (String) tblExercises.getValueAt(row, 1);
            String strWeight = tblExercises.getValueAt(row, 2).toString();
            String strReps = tblExercises.getValueAt(row, 3).toString();
            /*
             lastDeletedSet.add(nr);
             lastDeletedSet.add(exercise);
             lastDeletedSet.add(strWeight);
             lastDeletedSet.add(strReps);
             */
            ((DefaultTableModel) tblExercises.getModel()).removeRow(row);
            //deletedRow = row;
            //bUndoDeleteSet.setEnabled(true);
        }
    }
    
    
    

     private static void fillTblExercises(String date, DataBaseHandler dataBase, JTable tblExercises) {
        String dateString = date;
        //System.out.println(dateString);
        String query = new String();
        //query = "SELECT `NR`, `CWICZENIE`, `OBCIAZENIE`, `LICZBA_POWT` FROM `seria` WHERE data_treningu = " + dateString;
        query = "SELECT `NR`, `CWICZENIE`, `OBCIAZENIE`, `LICZBA_POWT` FROM `seria` where data_treningu like " + dateString + " ORDER BY `NR` ASC";
        @SuppressWarnings({"UseOfObsoleteCollectionType", "Convert2Diamond"})
        ArrayList<Vector<String>> arrayList = new ArrayList<Vector<String>>();
        arrayList = dataBase.getAnswerListofVector(query);

        DefaultTableModel table = (DefaultTableModel) tblExercises.getModel();
        table.setRowCount(0);

        for (int i = 0; i < arrayList.size(); i++) {
            Vector subVector = new Vector();
            for (int j = 0; j < arrayList.get(i).size(); j++) {
                subVector.add(arrayList.get(i).get(j));
            }
            table.addRow(subVector);

        }
    }
    
    private static String generateSubmitQuery(JTable tblExercises, JCalendar jCalendar) {
        /*
         zbieramy wszystko z tabelki i trzeba zrobić od razu kod sql
         */
        String query = "INSERT INTO `seria` (`NR`, `CWICZENIE`, `OBCIAZENIE`, `LICZBA_POWT`, `CZAS_PRZERWY`, `DATA_TRENINGU`) VALUES\n";
        String rowQuery = new String();
        String finalQuery = new String();
        finalQuery += query;

        for (int row = 0; row < tblExercises.getRowCount(); row++) {
            rowQuery = "(";
            for (int column = 0; column < 4; column++) {
                if (column == 1) {
                    rowQuery += "'";
                    rowQuery += tblExercises.getValueAt(row, column).toString();
                    rowQuery += "'";
                } else {
                    rowQuery += tblExercises.getValueAt(row, column).toString();
                }
                if (column != 3) {
                    rowQuery += ", ";
                }
            }
            rowQuery += ", 120, ";
            rowQuery += DateHandler.changeDateFormat(jCalendar.getDate().toString(), jCalendar);

            if (row != tblExercises.getRowCount() - 1) {
                rowQuery += "),\n";
            } else {
                rowQuery += ");";
            }

            finalQuery += rowQuery;
        }
        return finalQuery;
    }

    static String getBodyPart(String exercise, DataBaseHandler dataBase) {
        /*
         mając ćwiczenie trzeba wskazac jaka to partia miesni
         */
        String bodyPart = new String();
        String query = "select partia from cwiczenie where nazwa like '" + exercise + "'";
        bodyPart = dataBase.getAnswer(query);
        //System.out.println("bodypart = " + bodyPart);
        return bodyPart;
    }

    static boolean isReadyToSubmit(JSpinner sSetWeight, JSpinner sReps, JComboBox cbChooseBodyPart, JComboBox cbChooseExercise) {
        if ((Integer) sSetWeight.getValue() >= 0
                && (Integer) sReps.getValue() > 0
                && !cbChooseBodyPart.getSelectedItem().toString().equals("--wybierz partię--")
                && !cbChooseExercise.getSelectedItem().toString().equals("--wybierz ćwiczenie--")) {
            return true;
        } else {
            return false;
        }
    }

    static void insertSet(JSpinner sSetWeight, JSpinner sReps, JComboBox cbChooseBodyPart, 
            JComboBox cbChooseExercise, JButton jSubmitTraining, JTable tblExercises ){
                //insert wszystko
        if (CalendarTraining.isReadyToSubmit(sSetWeight, sReps, cbChooseBodyPart, cbChooseExercise)) {
            jSubmitTraining.setText("Zapisz zmiany");

            DefaultTableModel table = (DefaultTableModel) tblExercises.getModel();

            //czyszcze tabele
            //table.setRowCount(0);
            @SuppressWarnings({"UseOfObsoleteCollectionType", "MismatchedQueryAndUpdateOfCollection"})
            Vector vector = new Vector();
            /*
             1. bierzemy ostatni element tabelki i nasz numer to numer tego elementu + 1
             - jak nie ma nic to dodajemy nowy element z indeksem 1
             2. "nazwa cwiczenia = " + cbChooseExercise.getSelectedItem().toString()
             */

            String nextNr = "1";
            Integer tmp = 0;
            if (table.getRowCount() > 0) {
                //System.out.println("wchodze w ifa");
                nextNr = (String) table.getValueAt(table.getRowCount() - 1, 0);
                tmp = Integer.parseInt(nextNr);
                tmp++;
                nextNr = tmp.toString();
            }

            //System.out.println("Nr = " + nextNr);
            //System.out.println("nazwa cwiczenia = " + cbChooseExercise.getSelectedItem().toString());
            //System.out.println("obciazenie = " + sSetWeight.getValue());
            //System.out.println("liczba powtorzen  = " + sReps.getValue());
            vector.add(nextNr);
            vector.add(cbChooseExercise.getSelectedItem().toString());
            vector.add(sSetWeight.getValue());
            vector.add(sReps.getValue());
            table.addRow(vector);

        } else {
            // TUTAJ TRZEBA DODAC INFO ZE NIEPOPRAWNE DANE
        }

        /*
         na klik dodajemy do bazy danych i odświeżamy listę na tabelce, czyli usuwamy wszystkie wiersze i dodajemy je na nowo
         */
    }
    
    static void listenTable(JTable tblExercises, JButton jSubmitTraining, JButton jSubmitSetEdit, 
            JComboBox cbChooseBodyPart, JComboBox cbChooseExercise, JSpinner sSetWeight, 
            JSpinner sReps, DataBaseHandler dataBase){
        int row = tblExercises.getSelectedRow();
        jSubmitTraining.setText("Zapisz zmiany");
        if (row >= 0) {
            jSubmitSetEdit.setEnabled(true);
        }
        cbChooseBodyPart.setSelectedItem(CalendarTraining.getBodyPart((String) tblExercises.getValueAt(row, 1), dataBase));
        cbChooseExercise.setSelectedItem(tblExercises.getValueAt(row, 1));

        String strWeight = tblExercises.getValueAt(row, 2).toString();
        String strReps = tblExercises.getValueAt(row, 3).toString();
        int intWeight = Integer.parseInt(strWeight);
        int intReps = Integer.parseInt(strReps);
        sSetWeight.setValue(intWeight);
        sReps.setValue(intReps);

        //sSetWeight.setValue((Integer) tblExercises.getValueAt(row, 2));
        //sReps.setValue((Integer) tblExercises.getValueAt(row, 3));
        //
        //String tblExercises.getValueAt(row, col);
    }
    
    static void show(String tmpDate, DataBaseHandler dataBase, JTextField eTrainingName, JTable tblExercises, JButton jSubmitTraining){
        String query = "select nazwa from trening where data_treningu like " + tmpDate;
        String trainingName = dataBase.getAnswer(query);
        eTrainingName.setText(trainingName);
        fillTblExercises(tmpDate,  dataBase,  tblExercises);

        jSubmitTraining.setText("Zapisz zmiany");
    }
    
    static void submitSet(JTable tblExercises, JButton jSubmitTraining, JSpinner sSetWeight,
            JSpinner sReps, JComboBox cbChooseBodyPart, JComboBox cbChooseExercise, JButton jSubmitSetEdit,
            DataBaseHandler dataBase) {
        int row = tblExercises.getSelectedRow();

        if (row != -1) {
            if (isReadyToSubmit(sSetWeight, sReps, cbChooseBodyPart, cbChooseExercise)) {
                jSubmitTraining.setText("Zapisz zmiany");

                DefaultTableModel table = (DefaultTableModel) tblExercises.getModel();

                String nr = (String) tblExercises.getValueAt(row, 0);

                @SuppressWarnings({"UseOfObsoleteCollectionType", "MismatchedQueryAndUpdateOfCollection"})
                Vector vector = new Vector();

                //System.out.println("Nr = " + nr);
                //System.out.println("nazwa cwiczenia = " + cbChooseExercise.getSelectedItem().toString());
                //System.out.println("obciazenie = " + sSetWeight.getValue());
                //System.out.println("liczba powtorzen  = " + sReps.getValue());
                vector.add(nr);
                vector.add(cbChooseExercise.getSelectedItem().toString());
                vector.add(sSetWeight.getValue());
                vector.add(sReps.getValue());
                table.insertRow(row, vector);
                table.removeRow(row + 1);

                jSubmitSetEdit.setEnabled(false);
                cbChooseBodyPart.setSelectedIndex(0);
                cbChooseExercise.setSelectedIndex(0);
                sSetWeight.setValue(0);
                sReps.setValue(0);
            } else {

                cbChooseBodyPart.setSelectedItem(getBodyPart((String) tblExercises.getValueAt(row, 1), dataBase));
                cbChooseExercise.setSelectedItem(tblExercises.getValueAt(row, 1));

                String strWeight = tblExercises.getValueAt(row, 2).toString();
                String strReps = tblExercises.getValueAt(row, 3).toString();
                int intWeight = Integer.parseInt(strWeight);
                int intReps = Integer.parseInt(strReps);
                sSetWeight.setValue(intWeight);
                sReps.setValue(intReps);

                // TUTAJ TRZEBA DODAC INFO ZE NIEPOPRAWNE DANE
            }
        }
    }

    static void submitTraining(JTable tblExercises, JCalendar jCalendar, DataBaseHandler dataBase, 
            JTextField eTrainingName, JButton jSubmitTraining) {
        /*
         - usuwamy poprzednia tabelke z bazy danych
         - dodajemy wszystko z bieżącej tabeli z bieżącą datą
         - aktualizaujemy nazwe treningu
         */
        if (tblExercises.getRowCount() > 0) {

            String deleteQuery = "DELETE FROM seria WHERE data_treningu like "
                    + DateHandler.changeDateFormat(jCalendar.getDate().toString(), jCalendar);
            //System.out.println(deleteQuery);
            dataBase.update(deleteQuery);
            String insertQuery = generateSubmitQuery(tblExercises, jCalendar);
            //System.out.println(insertQuery);
            dataBase.update(insertQuery);

            CalendarTraining.updateTrainingName(jCalendar, dataBase, eTrainingName, jSubmitTraining);
        } else {
            //System.out.println("nie mam nic do dodania!");
        }
    }

    static void updateTrainingName(JCalendar jCalendar, DataBaseHandler dataBase,
            JTextField eTrainingName, JButton jSubmitTraining) {
        String query = "SELECT nazwa FROM `trening` where data_treningu like "
                + DateHandler.changeDateFormat(jCalendar.getDate().toString(), jCalendar);
        ////System.out.println(query);
        @SuppressWarnings("LocalVariableHidesMemberVariable")
        String result = dataBase.getAnswer(query);
        boolean insert = false;
        if (result.length() > 0) { //istnieje
            query = "UPDATE trening SET nazwa='" + eTrainingName.getText()
                    + "' WHERE data_treningu like " + DateHandler.changeDateFormat(jCalendar.getDate().toString(), jCalendar);
            //System.out.println("zmiany zostaly wprowadzone");
            jSubmitTraining.setText("Zmiany wprowadzone!");
            insert = true;
        } else if (eTrainingName.getText().length() > 0) {
            query = "INSERT INTO `trening` (`nazwa`, `data_treningu`) VALUES ('" + eTrainingName.getText()
                    + "', " + DateHandler.changeDateFormat(jCalendar.getDate().toString(), jCalendar) + ")";
            //System.out.println("dodalem nowy wiersz");
            insert = true;
        }

        if (insert) {
            dataBase.update(query);
        }
    }

}
