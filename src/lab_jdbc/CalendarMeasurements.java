package lab_jdbc;

import javax.swing.JButton;
import javax.swing.JSpinner;

public class CalendarMeasurements {

    static void fillMeasurements(String date, DataBaseHandler dataBase, JSpinner sWeight,
            JSpinner sWaist, JSpinner sBiceps, JSpinner sThigh, JSpinner sCalf, JSpinner sForearm, JSpinner sChest) {
        //System.out.println(date);
        String query1 = "SELECT wartosc FROM `pomiar` where data_dodania <= ";
        String query2 = " and typ_pomiaru like ";
        String query = query1 + date + query2;
        query2 = "ORDER BY data_dodania DESC limit 1";

        String Waga = dataBase.getAnswer(query + " 'Waga' " + query2);
        //System.out.println(Waga);
        if (Waga.length() > 0) {
            int foo = Integer.parseInt(Waga);
            sWeight.setValue(foo);
        }
        String Pas = dataBase.getAnswer(query + " 'pas' " + query2);
        if (Pas.length() > 0) {
            int foo = Integer.parseInt(Pas);
            sWaist.setValue(foo);
        }
        String Biceps = dataBase.getAnswer(query + " 'Biceps' " + query2);
        if (Biceps.length() > 0) {
            int foo = Integer.parseInt(Biceps);
            sBiceps.setValue(foo);
        }
        String Klatka = dataBase.getAnswer(query + " 'Klatka' " + query2);
        if (Klatka.length() > 0) {
            int foo = Integer.parseInt(Klatka);
            sChest.setValue(foo);
        }
        String Udo = dataBase.getAnswer(query + " 'Udo' " + query2);
        if (Udo.length() > 0) {
            int foo = Integer.parseInt(Udo);
            sThigh.setValue(foo);
        }
        String Lydka = dataBase.getAnswer(query + " 'Lydka' " + query2);
        if (Lydka.length() > 0) {
            int foo = Integer.parseInt(Lydka);
            sCalf.setValue(foo);
        }
        String Przedramie = dataBase.getAnswer(query + " 'Przedramie' " + query2);
        if (Przedramie.length() > 0) {
            int foo = Integer.parseInt(Przedramie);
            sForearm.setValue(foo);
        }
    }

    static void show(String date, DataBaseHandler dataBase, JSpinner sWeight,
            JSpinner sWaist, JSpinner sBiceps, JSpinner sThigh, JSpinner sCalf, 
            JSpinner sForearm, JSpinner sChest, JButton bSubmitDailyMeasurement) {
        fillMeasurements(date, dataBase, sWeight, sWaist, sBiceps, sThigh, sCalf, sForearm, sChest);
        
        bSubmitDailyMeasurement.setText("Zatwierdź");
    }


}
