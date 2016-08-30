package lab_jdbc;

import java.awt.Color;
import java.util.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import javax.swing.table.*;

public class WindowMaker extends javax.swing.JFrame {

    String result = new String();

    int deletedRow = 0;

    public DataBaseHandler dataBase;

    public WindowMaker() {
        dataBase = new DataBaseHandler();
        initComponents();
        myInitComponents();
    }
    
    public WindowMaker(String dbName, String dbUser, String dbPass) {
        dataBase = new DataBaseHandler(dbName, dbUser, dbPass);
        initComponents();
        myInitComponents();
    }
    
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbWhichBody = new javax.swing.ButtonGroup();
        rbGender = new javax.swing.ButtonGroup();
        pMainPanel = new javax.swing.JTabbedPane();
        pCalendar = new javax.swing.JPanel();
        lChooseDay = new javax.swing.JLabel();
        jCalendar = new com.toedter.calendar.JCalendar();
        pDailyUpdate = new javax.swing.JTabbedPane();
        pDailyDiet = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        bSubmitDiet = new javax.swing.JButton();
        lFindProduct = new javax.swing.JLabel();
        bAddProduct = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblNeeds = new javax.swing.JTable();
        cbChooseCategory = new javax.swing.JComboBox();
        cbChooseProduct = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        sGrams = new javax.swing.JSpinner();
        jLabel23 = new javax.swing.JLabel();
        bDeleteProduct = new javax.swing.JButton();
        pDailyMeasurement = new javax.swing.JPanel();
        lWeight = new javax.swing.JLabel();
        lWaist = new javax.swing.JLabel();
        lBiceps = new javax.swing.JLabel();
        lChest = new javax.swing.JLabel();
        lThigh = new javax.swing.JLabel();
        lCalf = new javax.swing.JLabel();
        lForearm = new javax.swing.JLabel();
        sWeight = new javax.swing.JSpinner();
        sBiceps = new javax.swing.JSpinner();
        sWaist = new javax.swing.JSpinner();
        sChest = new javax.swing.JSpinner();
        sThigh = new javax.swing.JSpinner();
        sCalf = new javax.swing.JSpinner();
        sForearm = new javax.swing.JSpinner();
        bSubmitDailyMeasurement = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        pDailyTraining = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblExercises = new javax.swing.JTable();
        bSubmitSet = new javax.swing.JButton();
        lTrening = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        eTrainingName = new javax.swing.JTextField();
        cbChooseBodyPart = new javax.swing.JComboBox();
        lWhichBodyPart = new javax.swing.JLabel();
        cbChooseExercise = new javax.swing.JComboBox();
        lChooseExercise = new javax.swing.JLabel();
        sSetWeight = new javax.swing.JSpinner();
        sReps = new javax.swing.JSpinner();
        lSetWeight = new javax.swing.JLabel();
        lReps = new javax.swing.JLabel();
        jSubmitTraining = new javax.swing.JButton();
        bChangeTrainingName = new javax.swing.JButton();
        jDeleteSet = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jSubmitSetEdit = new javax.swing.JButton();
        bUndoDeleteSet = new javax.swing.JButton();
        pAccount = new javax.swing.JTabbedPane();
        pTarget = new javax.swing.JPanel();
        bAdvanced = new javax.swing.JToggleButton();
        pAdvanced = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        sTargetWeight = new javax.swing.JSpinner();
        sTargetBiceps = new javax.swing.JSpinner();
        sTargetWaist = new javax.swing.JSpinner();
        sTargetChest = new javax.swing.JSpinner();
        sTargetThigh = new javax.swing.JSpinner();
        sTargetCalf = new javax.swing.JSpinner();
        sTargetForearm = new javax.swing.JSpinner();
        bSubmitTarget = new javax.swing.JButton();
        iPudzian = new javax.swing.JLabel();
        iArnold = new javax.swing.JLabel();
        lChudzian = new javax.swing.JLabel();
        lSportowiec = new javax.swing.JLabel();
        lOwcaWK = new javax.swing.JLabel();
        lPudzian = new javax.swing.JLabel();
        lArnold = new javax.swing.JLabel();
        rbChudzian = new javax.swing.JRadioButton();
        rbChudzian.setVisible(false);
        rbOwcaWK = new javax.swing.JRadioButton();
        rbOwcaWK.setVisible(false);
        rbSportowiec = new javax.swing.JRadioButton();
        rbSportowiec.setVisible(false);

        rbPudzian = new javax.swing.JRadioButton();
        rbPudzian.setVisible(false);
        rbArnold = new javax.swing.JRadioButton();
        rbArnold.setVisible(false);
        iOwcaWK = new javax.swing.JLabel();
        iSportowiec = new javax.swing.JLabel();
        iChudzian = new javax.swing.JLabel();
        pPrivate = new javax.swing.JPanel();
        eFirstName = new javax.swing.JTextField();
        eLastName = new javax.swing.JTextField();
        eBirthDate = new com.toedter.calendar.JDateChooser();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        eHeight = new javax.swing.JSpinner();
        eBodyFat = new javax.swing.JSpinner();
        eNeed = new javax.swing.JSpinner();
        iBodyFat = new javax.swing.JLabel();
        bBodyFat = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bSubmitPrivate = new javax.swing.JButton();
        sProteins = new javax.swing.JSpinner();
        sCarbs = new javax.swing.JSpinner();
        sFats = new javax.swing.JSpinner();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        pAsk = new javax.swing.JTabbedPane();
        pMailbox = new javax.swing.JPanel();
        pSent = new javax.swing.JPanel();
        scrollPanelTblSent = new javax.swing.JScrollPane();
        tblSent = new javax.swing.JTable();
        eTopic1 = new javax.swing.JTextField();
        scrollPanelTextArea1 = new javax.swing.JScrollPane();
        eSentTextArea = new javax.swing.JTextPane();
        bSentDelete = new javax.swing.JButton();
        lTopic1 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        bInboxChoose = new javax.swing.JToggleButton();
        bSentChoose = new javax.swing.JToggleButton();
        pNew = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        setLocation(new java.awt.Point(10, 10));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 476));

        pMainPanel.setBackground(new java.awt.Color(153, 204, 255));
        pMainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pMainPanel.setToolTipText("");
        pMainPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pMainPanel.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        pMainPanel.setMaximumSize(new java.awt.Dimension(900, 476));
        pMainPanel.setMinimumSize(new java.awt.Dimension(900, 476));
        pMainPanel.setPreferredSize(new java.awt.Dimension(900, 476));

        pCalendar.setBackground(new java.awt.Color(153, 204, 255));
        pCalendar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pCalendar.setForeground(new java.awt.Color(153, 204, 255));
        pCalendar.setToolTipText("");
        pCalendar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lChooseDay.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lChooseDay.setText("Wybierz dzień w kalendarzu");

        jCalendar.setBackground(new java.awt.Color(255, 255, 255));
        jCalendar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jCalendar.setDecorationBackgroundColor(new java.awt.Color(255, 255, 255));
        jCalendar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jCalendar.setWeekOfYearVisible(false);
        jCalendar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendarPropertyChange(evt);
            }
        });

        pDailyUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pDailyUpdate.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "kurczak",  new Integer(100),  new Integer(100),  new Integer(0),  new Integer(21),  new Integer(2)},
                { new Integer(2), "ryż",  new Integer(100),  new Integer(650),  new Integer(70),  new Integer(5),  new Integer(0)}
            },
            new String [] {
                "ID", "Produkt", "Ilość", "kcal", "Węglowodany", "Białko", "Tłuszcze"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProducts.setRowHeight(24);
        tblProducts.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductsMouseClicked(evt);
            }
        });
        tblProducts.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblProductsPropertyChange(evt);
            }
        });
        jScrollPane3.setViewportView(tblProducts);

        jLabel20.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Uzupełnij dziennik żywieniowy");

        bSubmitDiet.setText("Zapisz zmiany");
        bSubmitDiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubmitDietActionPerformed(evt);
            }
        });

        lFindProduct.setText("Znajdź produkt:");

        bAddProduct.setText("Dodaj");
        bAddProduct.setEnabled(false);
        bAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddProductActionPerformed(evt);
            }
        });

        tblNeeds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {new String("Dodano:"), null, null, null, null},
                {new String("Pozostało:"), null, null, null, null},
                {new String("Zapotrzebowanie:"), null, null, null, null}
            },
            new String [] {
                "0", "0", "0", "0", "0"
            }
        ));
        tblNeeds.setEnabled(false);
        tblNeeds.setTableHeader(null);
        jScrollPane4.setViewportView(tblNeeds);

        cbChooseCategory.setModel(new javax.swing.DefaultComboBoxModel(CalendarDiet.initCbChooseCategory(dataBase)));
        cbChooseCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChooseCategoryActionPerformed(evt);
            }
        });

        cbChooseProduct.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--wybierz produkt--" }));
        cbChooseProduct.setEnabled(false);
        cbChooseProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChooseProductActionPerformed(evt);
            }
        });

        jLabel21.setText("Kategoria");

        jLabel22.setText("Produkt");

        sGrams.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(100), Integer.valueOf(0), null, Integer.valueOf(1)));
        sGrams.setEnabled(false);
        sGrams.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                sGramsPropertyChange(evt);
            }
        });

        jLabel23.setText("g");

        bDeleteProduct.setText("Usuń");
        bDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pDailyDietLayout = new javax.swing.GroupLayout(pDailyDiet);
        pDailyDiet.setLayout(pDailyDietLayout);
        pDailyDietLayout.setHorizontalGroup(
            pDailyDietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDailyDietLayout.createSequentialGroup()
                .addGroup(pDailyDietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDailyDietLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pDailyDietLayout.createSequentialGroup()
                        .addGroup(pDailyDietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pDailyDietLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lFindProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pDailyDietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pDailyDietLayout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addGap(96, 96, 96))
                                    .addComponent(cbChooseCategory, 0, 156, Short.MAX_VALUE))
                                .addGroup(pDailyDietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pDailyDietLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel22))
                                    .addGroup(pDailyDietLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(cbChooseProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sGrams, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pDailyDietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pDailyDietLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(bSubmitDiet, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pDailyDietLayout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDailyDietLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bDeleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pDailyDietLayout.setVerticalGroup(
            pDailyDietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDailyDietLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDailyDietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDailyDietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbChooseCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbChooseProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sGrams, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAddProduct)
                    .addComponent(lFindProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bDeleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDailyDietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bSubmitDiet, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pDailyUpdate.addTab("Dieta", pDailyDiet);

        lWeight.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lWeight.setText("Waga");

        lWaist.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lWaist.setText("Pas");

        lBiceps.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lBiceps.setText("Biceps");

        lChest.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lChest.setText("Klatka");

        lThigh.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lThigh.setText("Udo");

        lCalf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lCalf.setText("Łydka");

        lForearm.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lForearm.setText("Przedramię");

        sWeight.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sBiceps.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sWaist.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sChest.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sThigh.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sCalf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sForearm.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        bSubmitDailyMeasurement.setText("Zatwierdź");
        bSubmitDailyMeasurement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubmitDailyMeasurementActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Zaktualizuj swoje obwody");

        javax.swing.GroupLayout pDailyMeasurementLayout = new javax.swing.GroupLayout(pDailyMeasurement);
        pDailyMeasurement.setLayout(pDailyMeasurementLayout);
        pDailyMeasurementLayout.setHorizontalGroup(
            pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDailyMeasurementLayout.createSequentialGroup()
                .addContainerGap(396, Short.MAX_VALUE)
                .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDailyMeasurementLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDailyMeasurementLayout.createSequentialGroup()
                        .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDailyMeasurementLayout.createSequentialGroup()
                                .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pDailyMeasurementLayout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(sThigh, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDailyMeasurementLayout.createSequentialGroup()
                                .addComponent(lThigh)
                                .addGap(46, 46, 46)))
                        .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDailyMeasurementLayout.createSequentialGroup()
                                .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lWaist)
                                    .addComponent(sWaist, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pDailyMeasurementLayout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(sCalf, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pDailyMeasurementLayout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(lCalf)))
                                .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pDailyMeasurementLayout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pDailyMeasurementLayout.createSequentialGroup()
                                                .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(sBiceps, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lBiceps))
                                                .addGap(65, 65, 65)
                                                .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lChest)
                                                    .addComponent(sChest, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(pDailyMeasurementLayout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addComponent(sForearm, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(pDailyMeasurementLayout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(lForearm))))
                            .addComponent(bSubmitDailyMeasurement, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(113, 113, 113))))
        );
        pDailyMeasurementLayout.setVerticalGroup(
            pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDailyMeasurementLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lWaist, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lBiceps, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lChest, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sBiceps, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sWaist, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sChest, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lThigh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCalf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lForearm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sThigh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sCalf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sForearm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(bSubmitDailyMeasurement, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pDailyUpdate.addTab("Pomiary", pDailyMeasurement);

        tblExercises.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "asd",  new Integer(12),  new Integer(4)},
                { new Integer(2), "dsa",  new Integer(12), null}
            },
            new String [] {
                "Nr", "Ćwiczenie", "Obciążenie", "Liczba Powt."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblExercises.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblExercises.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblExercisesMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblExercises);

        bSubmitSet.setText("Dodaj nowy");
        bSubmitSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubmitSetActionPerformed(evt);
            }
        });

        lTrening.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lTrening.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTrening.setText("Uzupełnij swój trening");

        jLabel1.setText("Nazwa treningu");

        cbChooseBodyPart.setModel(new javax.swing.DefaultComboBoxModel(CalendarTraining.initCbChooseBodyPart(dataBase)));
        cbChooseBodyPart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChooseBodyPartActionPerformed(evt);
            }
        });

        lWhichBodyPart.setText("Wybierz partię ciała");

        cbChooseExercise.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--wybierz partię--" }));
        cbChooseExercise.setEnabled(false);
        cbChooseExercise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChooseExerciseActionPerformed(evt);
            }
        });

        lChooseExercise.setForeground(new java.awt.Color(102, 102, 102));
        lChooseExercise.setText("Wybierz ćwiczenie");

        sSetWeight.setEnabled(false);

        sReps.setEnabled(false);

        lSetWeight.setForeground(new java.awt.Color(102, 102, 102));
        lSetWeight.setText("Obciążenie");

        lReps.setForeground(new java.awt.Color(102, 102, 102));
        lReps.setText("Liczba powtórzeń");

        jSubmitTraining.setText("Zapisz zmiany");
        jSubmitTraining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubmitTrainingActionPerformed(evt);
            }
        });

        bChangeTrainingName.setText("Zmień nazwę treningu");
        bChangeTrainingName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bChangeTrainingNameActionPerformed(evt);
            }
        });

        jDeleteSet.setText("Usuń");
        jDeleteSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteSetActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Dodawanie/edycja");

        jSubmitSetEdit.setText("Zatwierdź edycję");
        jSubmitSetEdit.setEnabled(false);
        jSubmitSetEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubmitSetEditActionPerformed(evt);
            }
        });

        bUndoDeleteSet.setText("Cofnij");
        bUndoDeleteSet.setEnabled(false);
        bUndoDeleteSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUndoDeleteSetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pDailyTrainingLayout = new javax.swing.GroupLayout(pDailyTraining);
        pDailyTraining.setLayout(pDailyTrainingLayout);
        pDailyTrainingLayout.setHorizontalGroup(
            pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDailyTrainingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTrening, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pDailyTrainingLayout.createSequentialGroup()
                .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDailyTrainingLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDailyTrainingLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(bChangeTrainingName, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pDailyTrainingLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eTrainingName, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pDailyTrainingLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDailyTrainingLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(pDailyTrainingLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lReps)
                            .addGroup(pDailyTrainingLayout.createSequentialGroup()
                                .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lChooseExercise, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbChooseBodyPart, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lWhichBodyPart, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbChooseExercise, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(sReps, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lSetWeight))
                                    .addComponent(sSetWeight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(bUndoDeleteSet, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bSubmitSet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pDailyTrainingLayout.createSequentialGroup()
                                    .addComponent(jSubmitSetEdit)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDeleteSet, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSubmitTraining, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))))
        );
        pDailyTrainingLayout.setVerticalGroup(
            pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDailyTrainingLayout.createSequentialGroup()
                .addComponent(lTrening, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDailyTrainingLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eTrainingName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bChangeTrainingName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDailyTrainingLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lWhichBodyPart)
                            .addComponent(lSetWeight))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbChooseBodyPart, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sSetWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lChooseExercise)
                            .addComponent(lReps))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbChooseExercise, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sReps, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDeleteSet, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jSubmitSetEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bUndoDeleteSet)
                        .addGap(20, 20, 20)
                        .addComponent(bSubmitSet, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jSubmitTraining, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pDailyUpdate.addTab("Trening", pDailyTraining);

        javax.swing.GroupLayout pCalendarLayout = new javax.swing.GroupLayout(pCalendar);
        pCalendar.setLayout(pCalendarLayout);
        pCalendarLayout.setHorizontalGroup(
            pCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCalendarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lChooseDay, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pDailyUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                .addContainerGap())
        );
        pCalendarLayout.setVerticalGroup(
            pCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCalendarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pDailyUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pCalendarLayout.createSequentialGroup()
                        .addComponent(lChooseDay, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pMainPanel.addTab("", pCalendar);

        pAccount.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        pAccount.setName("pAccount"); // NOI18N

        bAdvanced.setText("Zaawansowane");
        bAdvanced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdvancedActionPerformed(evt);
            }
        });

        pAdvanced.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setText("Waga");

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel13.setText("Pas");

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel14.setText("Biceps");

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel15.setText("Klatka");

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel16.setText("Udo");

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel17.setText("Łydka");

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel18.setText("Przedramię");

        sTargetWeight.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sTargetBiceps.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sTargetWaist.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sTargetChest.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sTargetThigh.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sTargetCalf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sTargetForearm.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        javax.swing.GroupLayout pAdvancedLayout = new javax.swing.GroupLayout(pAdvanced);
        pAdvanced.setLayout(pAdvancedLayout);
        pAdvancedLayout.setHorizontalGroup(
            pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAdvancedLayout.createSequentialGroup()
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pAdvancedLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(sTargetThigh, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pAdvancedLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sTargetCalf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pAdvancedLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(sTargetForearm, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pAdvancedLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sTargetChest, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAdvancedLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(8, 8, 8)))
                .addGap(63, 63, 63)
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sTargetBiceps)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addGap(62, 62, 62)
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sTargetWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sTargetWaist, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAdvancedLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(23, 23, 23)))
                .addGap(30, 30, 30))
        );
        pAdvancedLayout.setVerticalGroup(
            pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAdvancedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pAdvancedLayout.createSequentialGroup()
                        .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sTargetWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sTargetWaist, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pAdvancedLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sTargetBiceps, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pAdvancedLayout.createSequentialGroup()
                        .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sTargetChest, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pAdvancedLayout.createSequentialGroup()
                        .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sTargetThigh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sTargetCalf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sTargetForearm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        bSubmitTarget.setText("Zatwierdź");
        bSubmitTarget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubmitTargetActionPerformed(evt);
            }
        });

        iPudzian.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mazi\\Documents\\NetBeansProjects\\lab_JDBC\\img\\pudzian.jpg")); // NOI18N
        iPudzian.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        iPudzian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iPudzian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                iPudzianMouseReleased(evt);
            }
        });

        iArnold.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mazi\\Documents\\NetBeansProjects\\lab_JDBC\\img\\arnold.jpg")); // NOI18N
        iArnold.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iArnold.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                iArnoldMouseReleased(evt);
            }
        });

        lChudzian.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lChudzian.setText("Chudzian");

        lSportowiec.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lSportowiec.setText("Sportowiec");

        lOwcaWK.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lOwcaWK.setText("Warszawski Koks");

        lPudzian.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lPudzian.setText("Pudzian");

        lArnold.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lArnold.setText("Mr. Olympia");

        rbWhichBody.add(rbChudzian);
        rbChudzian.setText("jRadioButton1");
        rbChudzian.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbChudzianStateChanged(evt);
            }
        });

        rbWhichBody.add(rbOwcaWK);
        rbOwcaWK.setText("jRadioButton3");
        rbOwcaWK.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbOwcaWKStateChanged(evt);
            }
        });

        rbWhichBody.add(rbSportowiec);
        rbSportowiec.setText("jRadioButton2");
        rbSportowiec.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbSportowiecStateChanged(evt);
            }
        });

        rbWhichBody.add(rbPudzian);
        rbPudzian.setSelected(true);
        rbPudzian.setText("jRadioButton4");
        rbPudzian.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbPudzianStateChanged(evt);
            }
        });

        rbWhichBody.add(rbArnold);
        rbArnold.setText("jRadioButton5");
        rbArnold.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbArnoldStateChanged(evt);
            }
        });

        iOwcaWK.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mazi\\Documents\\NetBeansProjects\\lab_JDBC\\img\\owcawk.jpg")); // NOI18N
        iOwcaWK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iOwcaWK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                iOwcaWKMouseReleased(evt);
            }
        });

        iSportowiec.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mazi\\Documents\\NetBeansProjects\\lab_JDBC\\img\\sportowiec.jpg")); // NOI18N
        iSportowiec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iSportowiec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                iSportowiecMouseReleased(evt);
            }
        });

        iChudzian.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mazi\\Documents\\NetBeansProjects\\lab_JDBC\\img\\chudzian.jpg")); // NOI18N
        iChudzian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iChudzian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                iChudzianMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pTargetLayout = new javax.swing.GroupLayout(pTarget);
        pTarget.setLayout(pTargetLayout);
        pTargetLayout.setHorizontalGroup(
            pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTargetLayout.createSequentialGroup()
                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTargetLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lChudzian)
                        .addGap(90, 90, 90)
                        .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iOwcaWK, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pTargetLayout.createSequentialGroup()
                                .addComponent(lSportowiec)
                                .addGap(75, 75, 75)
                                .addComponent(lOwcaWK)))
                        .addGap(80, 80, 80)
                        .addComponent(lPudzian, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pTargetLayout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(bSubmitTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pTargetLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pAdvanced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pTargetLayout.createSequentialGroup()
                                .addComponent(iChudzian, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(iSportowiec, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pTargetLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bAdvanced)
                        .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pTargetLayout.createSequentialGroup()
                                .addGap(410, 410, 410)
                                .addComponent(iPudzian, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(iArnold)
                                    .addGroup(pTargetLayout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(lArnold))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTargetLayout.createSequentialGroup()
                                .addGap(440, 440, 440)
                                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pTargetLayout.createSequentialGroup()
                                        .addComponent(rbSportowiec)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbArnold))
                                    .addGroup(pTargetLayout.createSequentialGroup()
                                        .addComponent(rbPudzian)
                                        .addGap(93, 93, 93)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbChudzian)
                                    .addComponent(rbOwcaWK))
                                .addGap(10, 10, 10)))))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        pTargetLayout.setVerticalGroup(
            pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTargetLayout.createSequentialGroup()
                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTargetLayout.createSequentialGroup()
                        .addComponent(rbSportowiec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbPudzian))
                    .addGroup(pTargetLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbArnold)
                            .addComponent(bAdvanced)))
                    .addGroup(pTargetLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(rbOwcaWK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbChudzian)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSubmitTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lChudzian)
                    .addComponent(lSportowiec)
                    .addComponent(lOwcaWK)
                    .addComponent(lPudzian)
                    .addComponent(lArnold))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(iSportowiec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iOwcaWK, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(iArnold)
                        .addComponent(iPudzian))
                    .addComponent(iChudzian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pAdvanced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pAccount.addTab("Edytuj swój cel", pTarget);

        eLastName.setToolTipText("");
        eLastName.setEnabled(false);

        rbGender.add(rbMale);
        rbMale.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        rbMale.setSelected(true);
        rbMale.setText("Mężczyzna");

        rbGender.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        rbFemale.setText("Kobieta");

        eHeight.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        eBodyFat.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        eNeed.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        iBodyFat.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mazi\\Documents\\NetBeansProjects\\lab_JDBC\\img\\bodyfat.jpg")); // NOI18N

        bBodyFat.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        bBodyFat.setText("Co to?");
        bBodyFat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBodyFatActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Imię");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Nazwisko");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Data urodzenia");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("Wzrost");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("Zapotrzebowanie kcal");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setText("Bodyfat %");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setText("cm");

        bSubmitPrivate.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        bSubmitPrivate.setText("Zatwierdź zmiany");
        bSubmitPrivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubmitPrivateActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel24.setText("Białko");

        jLabel25.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel25.setText("Węglowodany");

        jLabel26.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel26.setText("Tłuszcze");

        javax.swing.GroupLayout pPrivateLayout = new javax.swing.GroupLayout(pPrivate);
        pPrivate.setLayout(pPrivateLayout);
        pPrivateLayout.setHorizontalGroup(
            pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPrivateLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(eFirstName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                    .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(eBirthDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eLastName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                    .addGroup(pPrivateLayout.createSequentialGroup()
                        .addComponent(eHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pPrivateLayout.createSequentialGroup()
                        .addComponent(rbMale)
                        .addGap(18, 18, 18)
                        .addComponent(rbFemale)))
                .addGap(75, 75, 75)
                .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bSubmitPrivate, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(eNeed, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pPrivateLayout.createSequentialGroup()
                        .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eBodyFat)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(sFats, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sCarbs, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sProteins, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bBodyFat))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(iBodyFat, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        pPrivateLayout.setVerticalGroup(
            pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPrivateLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPrivateLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pPrivateLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eNeed, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pPrivateLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(8, 8, 8)
                        .addComponent(eLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel6)
                        .addGap(11, 11, 11)
                        .addComponent(eBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbMale)
                            .addComponent(rbFemale))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eHeight, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPrivateLayout.createSequentialGroup()
                        .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sProteins, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sCarbs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sFats, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(bBodyFat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eBodyFat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bSubmitPrivate, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPrivateLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iBodyFat, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pAccount.addTab("Edytuj dane osobowe", pPrivate);

        pMainPanel.addTab("", pAccount);

        pAsk.setBackground(new java.awt.Color(153, 204, 255));
        pAsk.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        pMailbox.setBackground(new java.awt.Color(153, 204, 255));

        pSent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblSent.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tblSent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Do:", "Data:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSent.setTableHeader(null);
        scrollPanelTblSent.setViewportView(tblSent);

        eTopic1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        eTopic1.setEnabled(false);

        eSentTextArea.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        eSentTextArea.setEnabled(false);
        scrollPanelTextArea1.setViewportView(eSentTextArea);

        bSentDelete.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        bSentDelete.setText("Usuń");

        lTopic1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lTopic1.setText("Temat:");

        jLabel28.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel28.setText("Od:");

        jLabel29.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel29.setText("Data:");

        javax.swing.GroupLayout pSentLayout = new javax.swing.GroupLayout(pSent);
        pSent.setLayout(pSentLayout);
        pSentLayout.setHorizontalGroup(
            pSentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSentLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pSentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bSentDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollPanelTblSent, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pSentLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(95, 95, 95)
                        .addComponent(jLabel29)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pSentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollPanelTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pSentLayout.createSequentialGroup()
                        .addComponent(lTopic1)
                        .addGap(18, 18, 18)
                        .addComponent(eTopic1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pSentLayout.setVerticalGroup(
            pSentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pSentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pSentLayout.createSequentialGroup()
                        .addGroup(pSentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eTopic1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lTopic1))
                        .addGap(18, 18, 18)
                        .addComponent(scrollPanelTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pSentLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pSentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPanelTblSent, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bSentDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
        );

        bInboxChoose.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        bInboxChoose.setText("Odebrane");
        bInboxChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInboxChooseActionPerformed(evt);
            }
        });

        bSentChoose.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        bSentChoose.setText("Wysłane");
        bSentChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSentChooseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pMailboxLayout = new javax.swing.GroupLayout(pMailbox);
        pMailbox.setLayout(pMailboxLayout);
        pMailboxLayout.setHorizontalGroup(
            pMailboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMailboxLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(pMailboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pSent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pMailboxLayout.createSequentialGroup()
                        .addComponent(bInboxChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bSentChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        pMailboxLayout.setVerticalGroup(
            pMailboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMailboxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pMailboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bInboxChoose, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(bSentChoose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pSent, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        pAsk.addTab("Skrzynka odbiorcza", pMailbox);

        pNew.setBackground(new java.awt.Color(153, 204, 255));

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton2.setText("Wyślij");

        jButton3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton3.setText("Wyczyść");

        jScrollPane5.setViewportView(jTextPane1);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Do:");

        jLabel27.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel27.setText("Temat");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Od:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, 500, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout pNewLayout = new javax.swing.GroupLayout(pNew);
        pNew.setLayout(pNewLayout);
        pNewLayout.setHorizontalGroup(
            pNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pNewLayout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
        );
        pNewLayout.setVerticalGroup(
            pNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pAsk.addTab("Nowa wiadomość", pNew);

        pMainPanel.addTab("", pAsk);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1045, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSubmitPrivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitPrivateActionPerformed
        UserPrivate.updatePersonalInformation(dataBase, eFirstName,
                eLastName, eBirthDate, eHeight,
                eNeed, sProteins, sCarbs, sFats,
                eBodyFat, jCalendar, rbMale);

    }//GEN-LAST:event_bSubmitPrivateActionPerformed

    private void bBodyFatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBodyFatActionPerformed
        iBodyFat.setVisible(bBodyFat.isSelected());
    }//GEN-LAST:event_bBodyFatActionPerformed

    private void iChudzianMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iChudzianMouseReleased
        rbChudzian.setSelected(true);
    }//GEN-LAST:event_iChudzianMouseReleased

    private void iSportowiecMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iSportowiecMouseReleased
        rbSportowiec.setSelected(true);
    }//GEN-LAST:event_iSportowiecMouseReleased

    private void iOwcaWKMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iOwcaWKMouseReleased
        rbOwcaWK.setSelected(true);
    }//GEN-LAST:event_iOwcaWKMouseReleased

    private void rbArnoldStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbArnoldStateChanged
        if (rbArnold.isSelected()) {
            iArnold.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.RED));
            sTargetBiceps.setValue(56);
            sTargetCalf.setValue(51);
            sTargetChest.setValue(147);
            sTargetForearm.setValue(45);
            sTargetThigh.setValue(73);
            sTargetWaist.setValue(86);
            sTargetWeight.setValue(115);
        } else {
            iArnold.setBorder(null);
        }
    }//GEN-LAST:event_rbArnoldStateChanged

    private void rbPudzianStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbPudzianStateChanged
        if (rbPudzian.isSelected()) {
            iPudzian.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.RED));
            sTargetBiceps.setValue(56);
            sTargetCalf.setValue(50);
            sTargetChest.setValue(148);
            sTargetForearm.setValue(45);
            sTargetThigh.setValue(80);
            sTargetWaist.setValue(92);
            sTargetWeight.setValue(142);
        } else {
            iPudzian.setBorder(null);
        }
    }//GEN-LAST:event_rbPudzianStateChanged

    private void rbSportowiecStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbSportowiecStateChanged
        if (rbSportowiec.isSelected()) {
            iSportowiec.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.RED));
            sTargetBiceps.setValue(40);
            sTargetCalf.setValue(40);
            sTargetChest.setValue(111);
            sTargetForearm.setValue(33);
            sTargetThigh.setValue(60);
            sTargetWaist.setValue(83);
            sTargetWeight.setValue(75);
        } else {
            iSportowiec.setBorder(null);
        }
    }//GEN-LAST:event_rbSportowiecStateChanged

    private void rbOwcaWKStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbOwcaWKStateChanged
        if (rbOwcaWK.isSelected()) {
            iOwcaWK.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.RED));
            sTargetBiceps.setValue(45);
            sTargetCalf.setValue(42);
            sTargetChest.setValue(120);
            sTargetForearm.setValue(40);
            sTargetThigh.setValue(65);
            sTargetWaist.setValue(85);
            sTargetWeight.setValue(95);
        } else {
            iOwcaWK.setBorder(null);
        }
    }//GEN-LAST:event_rbOwcaWKStateChanged

    private void rbChudzianStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbChudzianStateChanged
        if (rbChudzian.isSelected()) {
            iChudzian.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.RED));
            sTargetBiceps.setValue(25);
            sTargetCalf.setValue(20);
            sTargetChest.setValue(70);
            sTargetForearm.setValue(20);
            sTargetThigh.setValue(30);
            sTargetWaist.setValue(50);
            sTargetWeight.setValue(45);
        } else {
            iChudzian.setBorder(null);
        }
    }//GEN-LAST:event_rbChudzianStateChanged

    private void iArnoldMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iArnoldMouseReleased
        rbArnold.setSelected(true);
    }//GEN-LAST:event_iArnoldMouseReleased

    private void iPudzianMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iPudzianMouseReleased
        rbPudzian.setSelected(true);
    }//GEN-LAST:event_iPudzianMouseReleased

    private void bSubmitTargetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitTargetActionPerformed
        /*
         po kliknieciu zapisujemy wartosci z editów i nadpisujemy dla danego nazwiska
         */
        UserTarget.submit(dataBase, sTargetThigh, sTargetCalf,
                sTargetForearm, sTargetChest, sTargetBiceps, sTargetWeight, sTargetWaist);


    }//GEN-LAST:event_bSubmitTargetActionPerformed

    private void bAdvancedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdvancedActionPerformed
        boolean flag = true;
        if (bAdvanced.isSelected()) {
            flag = true;
        } else {
            flag = false;
        }
        pAdvanced.setVisible(flag);
    }//GEN-LAST:event_bAdvancedActionPerformed

    private void bUndoDeleteSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUndoDeleteSetActionPerformed

        //jak uda sie cofnac to:
        jSubmitTraining.setText("Zapisz zmiany");

        /*
         dodanie:  >= row - nic nie rób, < row - trzeba inkrementowac
         usuniecie: >= row - nic nie rób, < row - trzeba dekrementować
         */

        /*
         //System.out.println("chce przywrócić dane:");
         DefaultTableModel table = (DefaultTableModel) tblExercises.getModel();
         //table.addRow(lastDeletedSet);
         table.insertRow(deletedRow, lastDeletedSet);
         //System.out.println(lastDeletedSet);
         for (int i = 0; i < 4; i++) {
         lastDeletedSet.removeElementAt(0);
         }

         bUndoDeleteSet.setEnabled(false);
         //System.out.println("kończę przywracać dane");*/
        //System.out.println("narazie nie zrobione");
    }//GEN-LAST:event_bUndoDeleteSetActionPerformed

    private void jSubmitSetEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubmitSetEditActionPerformed

        CalendarTraining.submitSet(tblExercises, jSubmitTraining, sSetWeight,
                sReps, cbChooseBodyPart, cbChooseExercise, jSubmitSetEdit,
                dataBase);
    }//GEN-LAST:event_jSubmitSetEditActionPerformed

    private void jDeleteSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteSetActionPerformed
        CalendarTraining.deleteSet(tblExercises, jSubmitTraining);
    }//GEN-LAST:event_jDeleteSetActionPerformed

    private void bChangeTrainingNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bChangeTrainingNameActionPerformed
        /*
         jak nie istnieje taki wiersz to tworzymy nowy
         jak istnieje to zmieniamy nazwe
         */
        CalendarTraining.updateTrainingName(jCalendar, dataBase, eTrainingName, jSubmitTraining);
    }//GEN-LAST:event_bChangeTrainingNameActionPerformed

    private void jSubmitTrainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubmitTrainingActionPerformed
        CalendarTraining.submitTraining(tblExercises, jCalendar, dataBase,
                eTrainingName, jSubmitTraining);
    }//GEN-LAST:event_jSubmitTrainingActionPerformed

    private void cbChooseExerciseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChooseExerciseActionPerformed
        lSetWeight.setForeground(Color.black);
        lReps.setForeground(Color.black);
        sSetWeight.setEnabled(true);
        sReps.setEnabled(true);
    }//GEN-LAST:event_cbChooseExerciseActionPerformed

    private void cbChooseBodyPartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChooseBodyPartActionPerformed
        String part = cbChooseBodyPart.getSelectedItem().toString();
        // initCbChooseExercise(part)
        cbChooseExercise.setEnabled(true);
        lChooseExercise.setForeground(Color.black);
        cbChooseExercise.setModel(new javax.swing.DefaultComboBoxModel(CalendarTraining.initCbChooseExercise(part, dataBase)));
    }//GEN-LAST:event_cbChooseBodyPartActionPerformed

    private void bSubmitSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitSetActionPerformed
        CalendarTraining.insertSet(sSetWeight, sReps, cbChooseBodyPart,
                cbChooseExercise, jSubmitTraining, tblExercises);
    }//GEN-LAST:event_bSubmitSetActionPerformed

    private void tblExercisesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblExercisesMouseReleased
        CalendarTraining.listenTable(tblExercises, jSubmitTraining, jSubmitSetEdit,
                cbChooseBodyPart, cbChooseExercise, sSetWeight,
                sReps, dataBase);
    }//GEN-LAST:event_tblExercisesMouseReleased

    private void bSubmitDailyMeasurementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitDailyMeasurementActionPerformed

        String query = new String();
        String date = DateHandler.changeDateFormat(jCalendar.getDate().toString(), jCalendar);

        CalendarMeasurements.updateMeasurement(date, "'Waga'", sWeight, dataBase);
        CalendarMeasurements.updateMeasurement(date, "'Pas'", sWaist, dataBase);
        CalendarMeasurements.updateMeasurement(date, "'Biceps'", sBiceps, dataBase);
        CalendarMeasurements.updateMeasurement(date, "'Klatka'", sChest, dataBase);
        CalendarMeasurements.updateMeasurement(date, "'Udo'", sThigh, dataBase);
        CalendarMeasurements.updateMeasurement(date, "'Łydka'", sCalf, dataBase);
        CalendarMeasurements.updateMeasurement(date, "'Przedramię'", sForearm, dataBase);
        //jak sie udalo dodac to:
        bSubmitDailyMeasurement.setText("Zmiany wprowadzone!");

    }//GEN-LAST:event_bSubmitDailyMeasurementActionPerformed

    private void bDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteProductActionPerformed
        int row = tblProducts.getSelectedRow();

        if (row >= 0) {
            ((DefaultTableModel) tblProducts.getModel()).removeRow(row);
            CalendarDiet.needsTblCalculate(tblProducts, tblNeeds, dataBase);
            CalendarDiet.fixID(tblProducts);
        }
    }//GEN-LAST:event_bDeleteProductActionPerformed

    private void sGramsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_sGramsPropertyChange
        bAddProduct.setEnabled(true);
    }//GEN-LAST:event_sGramsPropertyChange

    private void cbChooseProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChooseProductActionPerformed
        // lSetWeight.setForeground(Color.black);
        //lReps.setForeground(Color.black);
        sGrams.setEnabled(true);
    }//GEN-LAST:event_cbChooseProductActionPerformed

    private void cbChooseCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChooseCategoryActionPerformed
        String category = cbChooseCategory.getSelectedItem().toString();
        cbChooseProduct.setEnabled(true);
        //lChooseExercise.setForeground(Color.black);
        cbChooseProduct.setModel(new javax.swing.DefaultComboBoxModel(CalendarDiet.initCbChooseProduct(category, dataBase)));
    }//GEN-LAST:event_cbChooseCategoryActionPerformed

    private void bAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddProductActionPerformed

        CalendarDiet.addProduct(sGrams, cbChooseProduct, cbChooseCategory,
                tblProducts, dataBase, tblNeeds);

    }//GEN-LAST:event_bAddProductActionPerformed

    private void bSubmitDietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitDietActionPerformed
        if (tblProducts.getRowCount() > 0) {

            String deleteQuery = "DELETE FROM posilek WHERE data like " + DateHandler.changeDateFormat(jCalendar.getDate().toString(), jCalendar);
            //System.out.println(deleteQuery);
            dataBase.update(deleteQuery);
            String insertQuery = CalendarDiet.generateSubmitFoodQuery(tblProducts, jCalendar);
            //System.out.println(insertQuery);
            dataBase.update(insertQuery);

        } else {
            //System.out.println("nie mam nic do dodania!");
        }
    }//GEN-LAST:event_bSubmitDietActionPerformed

    private void tblProductsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblProductsPropertyChange
        bSubmitDiet.setText("Zapisz zmiany");
    }//GEN-LAST:event_tblProductsPropertyChange

    private void tblProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductsMouseClicked
        int row = tblProducts.getSelectedRow();
        if (row >= 0) {
            CalendarDiet.needsTblCalculate(tblProducts, tblNeeds, dataBase);
        }
    }//GEN-LAST:event_tblProductsMouseClicked

    private void jCalendarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendarPropertyChange
        /*
         -opcjonalnie - jak nic nie ma to wyświetlamy komunikat, że nic nie ma
         kolorujemy te miejsca w kalendarzu, które mają jakiś trening lub dietę (obwódka i kolor)
         */
        String tmpDate = DateHandler.changeDateFormat(jCalendar.getDate().toString(), jCalendar);
        CalendarMeasurements.show(tmpDate, dataBase, sWeight,
                sWaist, sBiceps, sThigh, sCalf, sForearm, sChest, bSubmitDailyMeasurement);
        CalendarTraining.show(tmpDate, dataBase, eTrainingName, tblExercises, jSubmitTraining);
        CalendarDiet.show(tmpDate, dataBase, tblProducts, tblNeeds);


    }//GEN-LAST:event_jCalendarPropertyChange

    private void bInboxChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInboxChooseActionPerformed
        if (bInboxChoose.isSelected()) {
            bSentChoose.setSelected(false);
            jLabel28.setText("Od:");
        } else {
            bSentChoose.setSelected(true);
            jLabel28.setText("Do:");
        }
    }//GEN-LAST:event_bInboxChooseActionPerformed

    private void bSentChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSentChooseActionPerformed
        if (bSentChoose.isSelected()) {
            bInboxChoose.setSelected(false);
            jLabel28.setText("Do:");
        } else {
            bInboxChoose.setSelected(true);
            jLabel28.setText("Od:");
        }
    }//GEN-LAST:event_bSentChooseActionPerformed

    private void printArray(ArrayList<String> list) {
        System.out.println("list.size()");
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private int[] getColumnsWidths(JTable tbl) {
        int[] sizes = new int[tbl.getColumnCount()];
        for (int i = 0; i < sizes.length; i++) {
            System.out.print(i + ": ");
            System.out.print(tbl.getColumnModel().getColumn(i).getWidth());
            System.out.print("\t");
        }
        //System.out.println("");
        return sizes;
    }

    private void listenButton() {
        List<JComponent> compList = new ArrayList<>();

        compList.add(sWeight.getEditor());
        compList.add(sWaist.getEditor());
        compList.add(sBiceps.getEditor());
        compList.add(sChest.getEditor());
        compList.add(sThigh.getEditor());
        compList.add(sCalf.getEditor());
        compList.add(sForearm.getEditor());

        List<JFormattedTextField> fieldList = new ArrayList<>();
        List<DefaultFormatter> formatters = new ArrayList<>();
        for (int i = 0; i < compList.size(); i++) {
            fieldList.add((JFormattedTextField) compList.get(i).getComponent(0));
            formatters.add((DefaultFormatter) fieldList.get(i).getFormatter());
            formatters.get(i).setCommitsOnValidEdit(true);
        }

        sWeight.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                bSubmitDailyMeasurement.setText("Zatwierdź");
            }
        });
        sWaist.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                bSubmitDailyMeasurement.setText("Zatwierdź");
            }
        });
        sBiceps.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                bSubmitDailyMeasurement.setText("Zatwierdź");
            }
        });
        sChest.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                bSubmitDailyMeasurement.setText("Zatwierdź");
            }
        });
        sThigh.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                bSubmitDailyMeasurement.setText("Zatwierdź");
            }
        });
        sCalf.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                bSubmitDailyMeasurement.setText("Zatwierdź");
            }
        });
        sForearm.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                bSubmitDailyMeasurement.setText("Zatwierdź");
            }
        });

    }

    private void initTbl(int[] columnSizes, JTable tbl) {
        //System.out.println("ustalam rozmiar tablicy");
        int columnCount = tbl.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            tbl.getColumnModel().getColumn(i).setPreferredWidth(columnSizes[i]);
        }
    }

    private void initTarget() {
        iPudzian.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.RED));
        sTargetBiceps.setValue(56);
        sTargetCalf.setValue(50);
        sTargetChest.setValue(148);
        sTargetForearm.setValue(45);
        sTargetThigh.setValue(80);
        sTargetWaist.setValue(92);
        sTargetWeight.setValue(142);
    }

    private void initTables() {
        int exerciseSizes[] = {40, 150, 60, 70};
        initTbl(exerciseSizes, tblExercises);
        int productSizes[] = {10, 100, 20, 20, 20, 20, 20, 20};
        initTbl(productSizes, tblProducts);
        ((DefaultTableModel) tblProducts.getModel()).setRowCount(0);
        int needsSizes[] = {100, 30, 30, 30, 30};
        initTbl(needsSizes, tblNeeds);
        tblExercises.getColumnModel().getColumn(0).setPreferredWidth(10);
    }

    private void initCalendar() {
        CalendarMeasurements.fillMeasurements(DateHandler.changeDateFormat(jCalendar.getDate().toString(), jCalendar),
                dataBase, sWeight, sWaist, sBiceps, sThigh, sCalf, sForearm, sChest);
        CalendarDiet.detectChange(tblProducts, tblNeeds, dataBase);
        CalendarDiet.fillTblProducts(DateHandler.changeDateFormat(jCalendar.getDate().toString(), jCalendar), dataBase, tblProducts);
        CalendarDiet.needsTblCalculate(tblProducts, tblNeeds, dataBase);
    }

    private void initTabs() {
        ImageIcon tab1 = new ImageIcon("img/b1.jpg");
        ImageIcon tab2 = new ImageIcon("img/b2.jpg");
        ImageIcon tab3 = new ImageIcon("img/b3.jpg");
        pMainPanel.addTab("", tab1, pCalendar, "");
        pMainPanel.addTab("", tab2, pAsk, "");
        pMainPanel.addTab("", tab3, pAccount, "");
        pAdvanced.setVisible(false);
        iBodyFat.setVisible(false);
    }

    private void myInitComponents() {
        initTabs();
        initTables();
        initCalendar();
        listenButton();
        UserPrivate.personInfoListener(pAccount, "", dataBase, eFirstName, eLastName, eBirthDate, rbMale, rbFemale,
                eHeight, eNeed, sProteins, sCarbs, sFats, eBodyFat);
        initTarget();

    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @SuppressWarnings("override")
            public void run() {
                new WindowMaker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAddProduct;
    private javax.swing.JToggleButton bAdvanced;
    private javax.swing.JToggleButton bBodyFat;
    private javax.swing.JButton bChangeTrainingName;
    private javax.swing.JButton bDeleteProduct;
    private javax.swing.JToggleButton bInboxChoose;
    private javax.swing.JToggleButton bSentChoose;
    private javax.swing.JButton bSentDelete;
    private javax.swing.JButton bSubmitDailyMeasurement;
    private javax.swing.JButton bSubmitDiet;
    private javax.swing.JButton bSubmitPrivate;
    private javax.swing.JButton bSubmitSet;
    private javax.swing.JButton bSubmitTarget;
    private javax.swing.JButton bUndoDeleteSet;
    private javax.swing.JComboBox cbChooseBodyPart;
    private javax.swing.JComboBox cbChooseCategory;
    private javax.swing.JComboBox cbChooseExercise;
    private javax.swing.JComboBox cbChooseProduct;
    private com.toedter.calendar.JDateChooser eBirthDate;
    private javax.swing.JSpinner eBodyFat;
    private javax.swing.JTextField eFirstName;
    private javax.swing.JSpinner eHeight;
    private javax.swing.JTextField eLastName;
    private javax.swing.JSpinner eNeed;
    private javax.swing.JTextPane eSentTextArea;
    private javax.swing.JTextField eTopic1;
    private javax.swing.JTextField eTrainingName;
    private javax.swing.JLabel iArnold;
    private javax.swing.JLabel iBodyFat;
    private javax.swing.JLabel iChudzian;
    private javax.swing.JLabel iOwcaWK;
    private javax.swing.JLabel iPudzian;
    private javax.swing.JLabel iSportowiec;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JCalendar jCalendar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JButton jDeleteSet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton jSubmitSetEdit;
    private javax.swing.JButton jSubmitTraining;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lArnold;
    private javax.swing.JLabel lBiceps;
    private javax.swing.JLabel lCalf;
    private javax.swing.JLabel lChest;
    private javax.swing.JLabel lChooseDay;
    private javax.swing.JLabel lChooseExercise;
    private javax.swing.JLabel lChudzian;
    private javax.swing.JLabel lFindProduct;
    private javax.swing.JLabel lForearm;
    private javax.swing.JLabel lOwcaWK;
    private javax.swing.JLabel lPudzian;
    private javax.swing.JLabel lReps;
    private javax.swing.JLabel lSetWeight;
    private javax.swing.JLabel lSportowiec;
    private javax.swing.JLabel lThigh;
    private javax.swing.JLabel lTopic1;
    private javax.swing.JLabel lTrening;
    private javax.swing.JLabel lWaist;
    private javax.swing.JLabel lWeight;
    private javax.swing.JLabel lWhichBodyPart;
    private javax.swing.JTabbedPane pAccount;
    private javax.swing.JPanel pAdvanced;
    private javax.swing.JTabbedPane pAsk;
    private javax.swing.JPanel pCalendar;
    private javax.swing.JPanel pDailyDiet;
    private javax.swing.JPanel pDailyMeasurement;
    private javax.swing.JPanel pDailyTraining;
    private javax.swing.JTabbedPane pDailyUpdate;
    private javax.swing.JPanel pMailbox;
    private javax.swing.JTabbedPane pMainPanel;
    private javax.swing.JPanel pNew;
    private javax.swing.JPanel pPrivate;
    private javax.swing.JPanel pSent;
    private javax.swing.JPanel pTarget;
    private javax.swing.JRadioButton rbArnold;
    private javax.swing.JRadioButton rbChudzian;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.ButtonGroup rbGender;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JRadioButton rbOwcaWK;
    private javax.swing.JRadioButton rbPudzian;
    private javax.swing.JRadioButton rbSportowiec;
    private javax.swing.ButtonGroup rbWhichBody;
    private javax.swing.JSpinner sBiceps;
    private javax.swing.JSpinner sCalf;
    private javax.swing.JSpinner sCarbs;
    private javax.swing.JSpinner sChest;
    private javax.swing.JSpinner sFats;
    private javax.swing.JSpinner sForearm;
    private javax.swing.JSpinner sGrams;
    private javax.swing.JSpinner sProteins;
    private javax.swing.JSpinner sReps;
    private javax.swing.JSpinner sSetWeight;
    private javax.swing.JSpinner sTargetBiceps;
    private javax.swing.JSpinner sTargetCalf;
    private javax.swing.JSpinner sTargetChest;
    private javax.swing.JSpinner sTargetForearm;
    private javax.swing.JSpinner sTargetThigh;
    private javax.swing.JSpinner sTargetWaist;
    private javax.swing.JSpinner sTargetWeight;
    private javax.swing.JSpinner sThigh;
    private javax.swing.JSpinner sWaist;
    private javax.swing.JSpinner sWeight;
    private javax.swing.JScrollPane scrollPanelTblSent;
    private javax.swing.JScrollPane scrollPanelTextArea1;
    private javax.swing.JTable tblExercises;
    private javax.swing.JTable tblNeeds;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTable tblSent;
    // End of variables declaration//GEN-END:variables
}
