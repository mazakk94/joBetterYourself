package lab_jdbc;

import com.toedter.calendar.JCalendar;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.table.DefaultTableModel;

public class CalendarDiet {

    static void addProduct(JSpinner sGrams, JComboBox cbChooseProduct, JComboBox cbChooseCategory,
            JTable tblProducts, DataBaseHandler dataBase, JTable tblNeeds) {
        if (!CalendarDiet.isReadyToAddProduct(sGrams, cbChooseProduct, cbChooseCategory)) {

            // TUTAJ TRZEBA DODAC INFO ZE NIEPOPRAWNE DANE
        } else {
            //jSubmitTraining.setText("Zapisz zmiany");

            DefaultTableModel table = (DefaultTableModel) tblProducts.getModel();

            //czyszcze tabele
            //table.setRowCount(0);
            @SuppressWarnings({"UseOfObsoleteCollectionType", "MismatchedQueryAndUpdateOfCollection"})
            Vector vector = new Vector();

            String nextNr = "1";
            Integer tmp = 0;
            if (table.getRowCount() > 0) {
                //System.out.println("wchodze w ifa");
                nextNr = String.valueOf(table.getValueAt(table.getRowCount() - 1, 0));
                tmp = Integer.parseInt(nextNr);
                tmp++;
                nextNr = tmp.toString();
            }

            String query = "";
            //System.out.println("Nr = " + nextNr);
            //System.out.println("nazwa produktu = " + cbChooseProduct.getSelectedItem().toString());
            int w = (int) sGrams.getValue();
            float weight = (float) w;
            //System.out.println("waga = " + sGrams.getValue());
            String product2 = cbChooseProduct.getSelectedItem().toString();
            String product = "'" + product2 + "'";
            query = "select round(" + (weight / 100) + "*kcal) from produkty where nazwa like " + product;
            String kcal = dataBase.getAnswer(query);
            query = "select round(" + (weight / 100) + "*w) from produkty where nazwa like " + product;
            String carbs = dataBase.getAnswer(query);
            query = "select round(" + (weight / 100) + "*b) from produkty where nazwa like " + product;
            String proteins = dataBase.getAnswer(query);
            query = "select round(" + (weight / 100) + "*t) from produkty where nazwa like " + product;
            String fats = dataBase.getAnswer(query);

            //System.out.println(nextNr);
            //System.out.println(product2);
            //System.out.println(sGrams.getValue());
            //System.out.println(kcal);
            //System.out.println(carbs);
            //System.out.println(proteins);
            //System.out.println(fats);
            vector.add(nextNr);
            vector.add(product2);
            vector.add(sGrams.getValue());
            vector.add(kcal);
            vector.add(carbs);
            vector.add(proteins);
            vector.add(fats);
            vector.add("Usuń");
            table.addRow(vector);

            CalendarDiet.needsTblCalculate(tblProducts, tblNeeds, dataBase);

        }
    }

    static void fixID(JTable tblProducts) {
        int rowcount = tblProducts.getRowCount();
        //System.out.println("ile wierszy: " + rowcount);
        if (rowcount > 1) {
            for (int row = 0; row < rowcount; row++) {
                //System.out.println(tblProducts.getValueAt(row, 0));
                tblProducts.setValueAt(row + 1, row, 0);
            }
        }
    }

    static String generateSubmitFoodQuery(JTable tblProducts, JCalendar jCalendar) {
        String query = "INSERT INTO `posilek` (`ILOSC`, `DATA`, `NAZWA`) VALUES\n";
        String rowQuery = new String();
        String finalQuery = new String();
        finalQuery += query;

        for (int row = 0; row < tblProducts.getRowCount(); row++) {

            rowQuery = "(";
            rowQuery += tblProducts.getValueAt(row, 2).toString(); //ilosc kcal
            rowQuery += ", ";
            rowQuery += DateHandler.changeDateFormat(jCalendar.getDate().toString(), jCalendar);
            rowQuery += ", '";
            rowQuery += tblProducts.getValueAt(row, 1).toString(); //nazwa
            rowQuery += "'"; //nazwa

            if (row != tblProducts.getRowCount() - 1) {
                rowQuery += "),\n";
            } else {
                rowQuery += ");";
            }

            finalQuery += rowQuery;
        }
        return finalQuery;
    }
    
    static String[] initCbChooseCategory(DataBaseHandler dataBase) {
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist = dataBase.getAnswerList("SELECT distinct kategoria FROM produkty order by kategoria asc");

        ArrayList<String> tmp = new ArrayList<>();
        tmp.add("--wybierz kategorię--");
        tmp.addAll(arraylist);

        String[] list = new String[tmp.size()];
        list = tmp.toArray(list);
        return list;
    }

    static String[] initCbChooseProduct(String category, DataBaseHandler dataBase) {

        String query = "'" + category + "'";
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist = dataBase.getAnswerList("select nazwa from produkty where kategoria like" + query + " order by nazwa");

        
        ArrayList<String> tmp = new ArrayList<>();
        tmp.add("--wybierz produkt--");

        tmp.addAll(arraylist);

        String[] list = new String[tmp.size()];
        list = tmp.toArray(list);
        return list;
    }
    
    static boolean isReadyToAddProduct(JSpinner sGrams, JComboBox cbChooseProduct, JComboBox cbChooseCategory) {
        if ((Integer) sGrams.getValue() >= 0
                && !cbChooseProduct.getSelectedItem().toString().equals("--wybierz produkt--")
                && !cbChooseCategory.getSelectedItem().toString().equals("--wybierz katerogię--")) {
            return true;
        } else {
            return false;
        }
    }

    static void detectChange(JTable tblProducts, JTable tblNeeds, DataBaseHandler dataBase) {

        CellEditorListener ChangeNotification = new CellEditorListener() {
            @SuppressWarnings("override")
            public void editingCanceled(ChangeEvent e) {
                System.out.println("The user canceled editing.");
            }

            @SuppressWarnings("override")
            public void editingStopped(ChangeEvent e) {
                System.out.println("The user stopped editing successfully.");
                //tblProducts.getSelectedRow()
                updateMacros(true, tblProducts, dataBase);
                needsTblCalculate(tblProducts, tblNeeds, dataBase);
            }
        };

        tblProducts.getDefaultEditor(Integer.class).addCellEditorListener(ChangeNotification);
        //DefaultTableModel table = (DefaultTableModel) tblProducts.getModel();
        //tblProducts.addCellEditorListener(ChangeNotification);

    }

    static void fillTblProducts(String tmpDate, DataBaseHandler dataBase, JTable tblProducts) {
        String dateString = tmpDate;
        String query = new String();
        query = "SELECT nazwa, ilosc FROM `posilek` where data like " + dateString;

        
        ArrayList<Vector<String>> arrayList = new ArrayList<>();
        arrayList = dataBase.getAnswerListofVector(query);

        DefaultTableModel table = (DefaultTableModel) tblProducts.getModel();
        table.setRowCount(0);

        for (int i = 0; i < arrayList.size(); i++) {
            table.addRow(new String[]{"", "", "", "", "", "", ""});
            table.setValueAt(i + 1, i, 0);
            table.setValueAt(arrayList.get(i).get(0), i, 1);
            table.setValueAt(arrayList.get(i).get(1), i, 2);
        }
        updateMacros(false, tblProducts, dataBase);
    }

    static void needsTblCalculate(JTable tblProducts, JTable tblNeeds, DataBaseHandler dataBase) {
        int rowlen = tblProducts.getRowCount();

        int kcal = 0;
        int w = 0;
        int b = 0;
        int t = 0;

        for (int row = 0; row < rowlen; row++) {
            kcal += Integer.parseInt(tblProducts.getValueAt(row, 3).toString());
            w += Integer.parseInt(tblProducts.getValueAt(row, 4).toString());
            b += Integer.parseInt(tblProducts.getValueAt(row, 5).toString());
            t += Integer.parseInt(tblProducts.getValueAt(row, 6).toString());
        }//        kcal w b t
        //dodano, pozostało, zapotrzebowanie
        tblNeeds.setValueAt(kcal + " kcal", 0, 1);
        tblNeeds.setValueAt(w + " W", 0, 2);
        tblNeeds.setValueAt(b + " B", 0, 3);
        tblNeeds.setValueAt(t + " T", 0, 4);
        /*
         robie zapytanie do bazy o obecnego uzytkownika i pytam o kcal, b,w , t i dodaje to do 1 pierwsza
         odejmuje od zapotrzebowania wartosci dodane i wrzucam do 2 wiersza
         */
        //kcal b w t        5678
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        list = dataBase.getAnswerListofList("SELECT * FROM `uzytkownik` WHERE nazwisko like 'Wojtasik'");
        //System.out.println("rozmiar listy"+list.size());
        //for (int i = 0; i < list.size(); i++) {
        //    System.out.println(list.get(i));
        //}

        tblNeeds.setValueAt(list.get(0).get(5) + " kcal", 2, 1);
        tblNeeds.setValueAt(list.get(0).get(6) + " W", 2, 2);
        tblNeeds.setValueAt(list.get(0).get(7) + " B", 2, 3);
        tblNeeds.setValueAt(list.get(0).get(8) + " T", 2, 4);
        Integer tmp = 0;
        tmp = Integer.parseInt(list.get(0).get(5)) - kcal;
        //System.out.println(tmp);
        tblNeeds.setValueAt(tmp.toString() + " kcal", 1, 1);
        tmp = Integer.parseInt(list.get(0).get(6)) - w;
        tblNeeds.setValueAt(tmp.toString() + " W", 1, 2);
        tmp = Integer.parseInt(list.get(0).get(7)) - b;
        tblNeeds.setValueAt(tmp.toString() + " B", 1, 3);
        tmp = Integer.parseInt(list.get(0).get(8)) - t;
        tblNeeds.setValueAt(tmp.toString() + " T", 1, 4);
    }

    static void show(String tmpDate, DataBaseHandler dataBase, JTable tblProducts, JTable tblNeeds) {
        CalendarDiet.fillTblProducts(tmpDate, dataBase, tblProducts);
        CalendarDiet.needsTblCalculate(tblProducts, tblNeeds, dataBase);
    }

    static void updateMacros(boolean selected, JTable tblProducts, DataBaseHandler dataBase) {

        /*
         POBIERAMY WIERSZ EDYTOWANEJ KOMÓRKI
         POBIERAMY INFO O TYM JAKIE MAKRO W 100
         PRZELICZAMY ILE MAKRO DLA ZMIENIONEJ WARTOŚCI (KOMÓRKI 2 W WYBRANYM WIERSZU)
         UZUPEŁNIAMY DANE W TABELCE
         KONIEC
         */
        int rowlen = tblProducts.getRowCount();
        //System.out.println("rowcount " + rowlen);
        if (rowlen > 0) {
            if (selected == true) {
                int selectedRow = tblProducts.getSelectedRow();
                System.out.println(" selected row " + selectedRow);
                if (selectedRow > -1) {
                    int[] array = prepareToAddMacros(selectedRow, tblProducts, dataBase);
                    for (int i = 0; i < array.length; i++) {
                        tblProducts.setValueAt(array[i], selectedRow, i + 3);
                    }
                }
            } else {
                int[] array = new int[4];
                for (int row = 0; row < rowlen; row++) {
                    array = prepareToAddMacros(row, tblProducts, dataBase);
                    for (int col = 0; col < array.length; col++) {
                        tblProducts.setValueAt(array[col], row, col + 3);
                    }
                }
            }
        }
    }

    static void fillTblProducts(DataBaseHandler dataBase, JTable tblProducts, String tmpDate) {
        String dateString = tmpDate;
        //System.out.println(dateString);
        String query = new String();
        query = "SELECT nazwa, ilosc FROM `posilek` where data like " + dateString;

        
        ArrayList<Vector<String>> arrayList = new ArrayList<>();
        arrayList = dataBase.getAnswerListofVector(query);

        DefaultTableModel table = (DefaultTableModel) tblProducts.getModel();
        table.setRowCount(0);

        for (int i = 0; i < arrayList.size(); i++) {
            table.addRow(new String[]{"", "", "", "", "", "", ""});
            table.setValueAt(i + 1, i, 0);
            table.setValueAt(arrayList.get(i).get(0), i, 1);
            table.setValueAt(arrayList.get(i).get(1), i, 2);
        }
        updateMacros(false, tblProducts, dataBase);
    }

    private static int[] prepareToAddMacros(int row, JTable tblProducts, DataBaseHandler dataBase) {
        int[] array = new int[4];

        String nazwa = tblProducts.getValueAt(row, 1).toString();
        String query = "SELECT * FROM `produkty` WHERE nazwa like '" + nazwa + "'";
        @SuppressWarnings("Convert2Diamond")
        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        list = dataBase.getAnswerListofList(query);
        //System.out.println("sizeof list: " + list.size());
        int gramatura = Integer.parseInt(tblProducts.getValueAt(row, 2).toString());

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(list.get(0).get(i + 2));
            array[i] *= gramatura;
            array[i] /= 100;
        }

        return array;
    }

}
