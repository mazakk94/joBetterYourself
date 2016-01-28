package lab_jdbc;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
/*import java.sql.ResultSet;
 import java.sql.SQLException;
 import java.util.logging.Level;
 import java.util.logging.Logger;*/
import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.text.DefaultFormatter;

public class WindowMaker extends javax.swing.JFrame {

    String result = new String();
    @SuppressWarnings({"Convert2Diamond", "UseOfObsoleteCollectionType"})
    // lastDeletedSet = new Vector<String>();
    int deletedRow = 0;

    //private Object dataBase;
    public DataBaseHandler dataBase;

    public WindowMaker() {
        dataBase = new DataBaseHandler();
        initComponents();
        myInitComponents();
    }

    class ButtonRenderer extends JButton implements TableCellRenderer {

        public ButtonRenderer() {
            setOpaque(true);
        }

        @SuppressWarnings("override")
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            if (isSelected) {
                //
            } else {
                //
            }
            setText(value.toString());
            return this;
        }
    }

    class ButtonEditor extends DefaultCellEditor {

        protected JButton button;

        private String label;
        private boolean pushed = true;
        private boolean isPushed;

        public ButtonEditor(JCheckBox checkBox) {
            super(checkBox);
            button = new JButton();
            button.setOpaque(true);
            button.addActionListener(new ActionListener() {
                @SuppressWarnings("override")
                public void actionPerformed(ActionEvent e) {
                    fireEditingStopped();
                }
            });
        }

        @SuppressWarnings("override")
        public Component getTableCellEditorComponent(JTable table, Object value,
                boolean isSelected, int row, int column) {
            label = "Usuń";
            button.setText(label);
            isPushed = true;
            return button;
        }

        @SuppressWarnings({"override", "RedundantStringConstructorCall"})
        public Object getCellEditorValue() {
            if (isPushed) {

                int row = tblProducts.getSelectedRow();
                System.out.println("jest " + tblProducts.getRowCount() + " wierszy");
                System.out.println("usuwam wiersz nr: " + row);
                if (row >= 0) {
                    System.out.println(tblProducts.getValueAt(row, 0).toString());
                    System.out.println(tblProducts.getValueAt(row, 1).toString());
                    System.out.println(tblProducts.getValueAt(row, 2).toString());
                    System.out.println(tblProducts.getValueAt(row, 3).toString());
                    /*    
                     lastDeletedSet.add(nr);
                     lastDeletedSet.add(exercise);
                     lastDeletedSet.add(strWeight);
                     lastDeletedSet.add(strReps);
                     */
                    ((DefaultTableModel) tblProducts.getModel()).removeRow(row);
                }
                /*
                 if (tblProducts.getRowCount() > 0 && tblProducts.getSelectedRow() != -1) {
                 //System.out.println("1");
                 //System.out.println("Usuwam " + (tblProducts.getSelectedRow()));
                 //System.out.println("2");
                 DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
                 System.out.println("\n" + model.getRowCount());
                 System.out.println(tblProducts.getSelectedRow());
                 model.removeRow(tblProducts.getSelectedRow());
                 System.out.println(tblProducts.getSelectedRow());
                 ////System.out.println("3");
                 }
                 */
            }
            isPushed = false;
            return new String("Usuń");
        }

        @SuppressWarnings("override")
        public boolean stopCellEditing() {
            isPushed = false;
            return super.stopCellEditing();
        }

        @SuppressWarnings("override")
        protected void fireEditingStopped() {
            super.fireEditingStopped();
        }
    }

    @SuppressWarnings({"unchecked", "Convert2Lambda"})
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbWhichBody = new javax.swing.ButtonGroup();
        rbGender = new javax.swing.ButtonGroup();
        pMainPanel = new javax.swing.JTabbedPane();
        pAsk = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
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

        pAsk.setBackground(new java.awt.Color(153, 204, 255));
        pAsk.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("jLabel2");

        jLabel4.setText("jLabel2");

        javax.swing.GroupLayout pAskLayout = new javax.swing.GroupLayout(pAsk);
        pAsk.setLayout(pAskLayout);
        pAskLayout.setHorizontalGroup(
            pAskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAskLayout.createSequentialGroup()
                .addContainerGap(470, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(147, 147, 147)
                .addComponent(jLabel4)
                .addGap(352, 352, 352))
        );
        pAskLayout.setVerticalGroup(
            pAskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAskLayout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addGroup(pAskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addContainerGap(233, Short.MAX_VALUE))
        );

        pMainPanel.addTab("", pAsk);

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
        pDailyUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pDailyUpdateMouseClicked(evt);
            }
        });

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

        cbChooseCategory.setModel(new javax.swing.DefaultComboBoxModel(initCbChooseCategory()));
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

        cbChooseBodyPart.setModel(new javax.swing.DefaultComboBoxModel(initCbChooseBodyPart()));
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

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);
        jTextArea1.getAccessibleContext().setAccessibleDescription("");

        jButton1.setText("Read");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pCalendarLayout = new javax.swing.GroupLayout(pCalendar);
        pCalendar.setLayout(pCalendarLayout);
        pCalendarLayout.setHorizontalGroup(
            pCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCalendarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lChooseDay, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pDailyUpdate)
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
                        .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pMainPanel.addTab("", pCalendar);

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
                .addContainerGap(188, Short.MAX_VALUE))
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

        rbGender.add(rbMale);
        rbMale.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        rbMale.setSelected(true);
        rbMale.setText("Mężczyzna");
        rbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMaleActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout pPrivateLayout = new javax.swing.GroupLayout(pPrivate);
        pPrivate.setLayout(pPrivateLayout);
        pPrivateLayout.setHorizontalGroup(
            pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPrivateLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPrivateLayout.createSequentialGroup()
                        .addComponent(rbMale)
                        .addGap(18, 18, 18)
                        .addComponent(rbFemale))
                    .addGroup(pPrivateLayout.createSequentialGroup()
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
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103)
                        .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bSubmitPrivate, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(eNeed, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pPrivateLayout.createSequentialGroup()
                                .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(eBodyFat, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bBodyFat)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(iBodyFat, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        pPrivateLayout.setVerticalGroup(
            pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPrivateLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPrivateLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pPrivateLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eNeed, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPrivateLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pPrivateLayout.createSequentialGroup()
                        .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(bBodyFat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eBodyFat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pPrivateLayout.createSequentialGroup()
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
                    .addComponent(bSubmitPrivate, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPrivateLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iBodyFat, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pAccount.addTab("Edytuj dane osobowe", pPrivate);

        pMainPanel.addTab("", pAccount);

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

    private void updateMeasurement(String date, String typPomiaru, javax.swing.JSpinner sWeight) {
        System.out.println("JESTEM W UPDATE MEASUREMENT");
        String query = "SELECT wartosc FROM `pomiar` where data_dodania like " + date + " and typ_pomiaru like " + typPomiaru;//'waga'";
        System.out.println(query);
        @SuppressWarnings("LocalVariableHidesMemberVariable")
        String result = dataBase.getAnswer(query);
        boolean insert = false;
        if (result.length() > 0) { //istnieje
            query = "UPDATE pomiar SET wartosc='" + sWeight.getValue() + "' WHERE data_dodania like " + date + "and typ_pomiaru like " + typPomiaru;// 'Waga'";
            System.out.println(query);
            insert = true;
        } else {
            query = "INSERT INTO `pomiar` (`typ_pomiaru`, `wartosc`, `data_dodania`) "
                    + "VALUES (" + typPomiaru + ", " + sWeight.getValue() + ", "
                    + date + ")";
            System.out.println(query);
            insert = true;
        }
        if (insert) {
            dataBase.update(query);
        }
    }


    private void bSubmitDailyMeasurementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitDailyMeasurementActionPerformed

        String query = new String();
        String date = changeDateFormat(jCalendar.getDate().toString());

        updateMeasurement(date, "'Waga'", sWeight);
        updateMeasurement(date, "'Pas'", sWaist);
        updateMeasurement(date, "'Biceps'", sBiceps);
        updateMeasurement(date, "'Klatka'", sChest);
        updateMeasurement(date, "'Udo'", sThigh);
        updateMeasurement(date, "'Łydka'", sCalf);
        updateMeasurement(date, "'Przedramię'", sForearm);
        //jak sie udalo dodac to:
        bSubmitDailyMeasurement.setText("Zmiany wprowadzone!");


    }//GEN-LAST:event_bSubmitDailyMeasurementActionPerformed

    private void bSubmitTargetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitTargetActionPerformed
        // TODO add your handling code here:
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

    private void iPudzianMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iPudzianMouseReleased
        boolean flag = true;
        rbPudzian.setSelected(flag);
    }//GEN-LAST:event_iPudzianMouseReleased

    private void iArnoldMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iArnoldMouseReleased
        boolean flag = true;
        rbArnold.setSelected(flag);
    }//GEN-LAST:event_iArnoldMouseReleased

    private void iOwcaWKMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iOwcaWKMouseReleased
        boolean flag = true;
        rbOwcaWK.setSelected(flag);
    }//GEN-LAST:event_iOwcaWKMouseReleased

    private void iSportowiecMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iSportowiecMouseReleased
        boolean flag = true;
        rbSportowiec.setSelected(flag);
    }//GEN-LAST:event_iSportowiecMouseReleased

    private void iChudzianMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iChudzianMouseReleased
        boolean flag = true;
        rbChudzian.setSelected(flag);
    }//GEN-LAST:event_iChudzianMouseReleased

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

    private void rbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMaleActionPerformed

    private void bBodyFatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBodyFatActionPerformed
        boolean flag = true;
        if (bBodyFat.isSelected()) {
            flag = true;
        } else {
            flag = false;
        }

        iBodyFat.setVisible(flag);
    }//GEN-LAST:event_bBodyFatActionPerformed

    private void bSubmitPrivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitPrivateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bSubmitPrivateActionPerformed

    private void printArray(ArrayList<String> list) {
        //System.out.println("list.size()");
        //System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println("CLICK");
        String wynik = new String();
        wynik = dataBase.getAnswer("select * from cwiczenie");
        @SuppressWarnings("Convert2Diamond")
        ArrayList<String> list = dataBase.getAnswerList("select nazwa from cwiczenie");
        //ArrayList<String> list = new ArrayList<String>();
        //list = dataBase.getAnswerList("select nazwa from cwiczenie");

        System.out.println("WINDOWMAKER:");
        printArray(list);
        //System.out.println(wynik);
        jTextArea1.setText(wynik);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbChooseBodyPartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChooseBodyPartActionPerformed
        String part = cbChooseBodyPart.getSelectedItem().toString();
        // initCbChooseExercise(part)
        cbChooseExercise.setEnabled(true);
        lChooseExercise.setForeground(Color.black);
        cbChooseExercise.setModel(new javax.swing.DefaultComboBoxModel(initCbChooseExercise(part)));
    }//GEN-LAST:event_cbChooseBodyPartActionPerformed

    private void cbChooseExerciseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChooseExerciseActionPerformed
        lSetWeight.setForeground(Color.black);
        lReps.setForeground(Color.black);
        sSetWeight.setEnabled(true);
        sReps.setEnabled(true);
    }//GEN-LAST:event_cbChooseExerciseActionPerformed

    private void bSubmitSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitSetActionPerformed
        //insert wszystko
        if (isReadyToSubmit()) {
            jTextArea1.setText("SUBMIT!");
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
                System.out.println("wchodze w ifa");
                nextNr = (String) table.getValueAt(table.getRowCount() - 1, 0);
                tmp = Integer.parseInt(nextNr);
                tmp++;
                nextNr = tmp.toString();
            }

            System.out.println("Nr = " + nextNr);
            System.out.println("nazwa cwiczenia = " + cbChooseExercise.getSelectedItem().toString());
            System.out.println("obciazenie = " + sSetWeight.getValue());
            System.out.println("liczba powtorzen  = " + sReps.getValue());
            vector.add(nextNr);
            vector.add(cbChooseExercise.getSelectedItem().toString());
            vector.add(sSetWeight.getValue());
            vector.add(sReps.getValue());
            table.addRow(vector);

        } else {
            jTextArea1.setText("NOPE!");

            // TUTAJ TRZEBA DODAC INFO ZE NIEPOPRAWNE DANE
        }

        /*
         na klik dodajemy do bazy danych i odświeżamy listę na tabelce, czyli usuwamy wszystkie wiersze i dodajemy je na nowo
         */
    }//GEN-LAST:event_bSubmitSetActionPerformed

    private void pDailyUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pDailyUpdateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pDailyUpdateMouseClicked

    private void fillMeasurements(String date) {
        System.out.println(date);
        String query1 = "SELECT wartosc FROM `pomiar` where data_dodania <= ";
        String query2 = " and typ_pomiaru like ";
        String query = query1 + date + query2;
        query2 = "ORDER BY data_dodania DESC limit 1";

        String Waga = dataBase.getAnswer(query + " 'Waga' " + query2);
        System.out.println(Waga);
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

    private void fillTable(String date) {
        String dateString = date;
        System.out.println(dateString);
        String query = new String();
        //query = "SELECT `NR`, `CWICZENIE`, `OBCIAZENIE`, `LICZBA_POWT` FROM `seria` WHERE data_treningu = " + dateString;
        query = "SELECT `NR`, `CWICZENIE`, `OBCIAZENIE`, `LICZBA_POWT` FROM `seria` where data_treningu like " + dateString + " ORDER BY `NR` ASC";
        @SuppressWarnings({"UseOfObsoleteCollectionType", "Convert2Diamond"})
        ArrayList<Vector<String>> arrayList = new ArrayList<Vector<String>>();
        arrayList = dataBase.getAnswerListofVector(query);

        DefaultTableModel table = (DefaultTableModel) tblExercises.getModel();
        table.setRowCount(0);

        for (int i = 0; i < arrayList.size(); i++) {
            @SuppressWarnings({"UseOfObsoleteCollectionType", "MismatchedQueryAndUpdateOfCollection"})
            Vector subVector = new Vector();
            for (int j = 0; j < arrayList.get(i).size(); j++) {
                subVector.add(arrayList.get(i).get(j));
            }
            table.addRow(subVector);

        }
    }

    private String generateSubmitQuery() {
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
            rowQuery += changeDateFormat(jCalendar.getDate().toString());

            if (row != tblExercises.getRowCount() - 1) {
                rowQuery += "),\n";
            } else {
                rowQuery += ");";
            }

            finalQuery += rowQuery;
        }
        return finalQuery;
    }

    public enum Month {

        Jan("Jan"),
        Feb("Feb"),
        Mar("Mar"),
        Apr("Apr"),
        May("May"),
        Jun("Jun"),
        Jul("Jul"),
        Aug("Aug"),
        Sep("Sep"),
        Oct("Oct"),
        Nov("Nov"),
        Dec("Dec");

        private String text;

        Month(String text) {
            this.text = text;
        }

        public String getText() {
            return this.text;
        }

        public static Month fromString(String text) {
            if (text != null) {
                for (Month mon : Month.values()) {
                    if (text.equalsIgnoreCase(mon.text)) {
                        return mon;
                    }
                }
            }
            return null;
        }
    }

    private String castMonth(String month) {
        Month enumMonth = Month.fromString(month);
        //System.out.println("wypluwam enummonth");
        //System.out.println(enumMonth);
        //enumMonth
        String resultMonth = new String();
        switch (enumMonth) {
            case Jan:
                resultMonth = "01";
                break;
            case Feb:
                resultMonth = "02";
                break;
            case Mar:
                resultMonth = "03";
                break;
            case Apr:
                resultMonth = "04";
                break;
            case May:
                resultMonth = "05";
                break;
            case Jun:
                resultMonth = "06";
                break;
            case Jul:
                resultMonth = "07";
                break;
            case Aug:
                resultMonth = "08";
                break;
            case Sep:
                resultMonth = "09";
                break;
            case Oct:
                resultMonth = "10";
                break;
            case Nov:
                resultMonth = "11";
                break;
            case Dec:
                resultMonth = "12";
                break;
            default:
                System.out.println("Something went wrong");
                break;
        }
        return resultMonth;
    }

    private String changeDateFormat(String date) {
        String resultDate = new String();

        String tmpDate = jCalendar.getDate().toString();
        //System.out.println(tmpDate);
        String tmpYear = tmpDate.substring(tmpDate.length() - 4, tmpDate.length());
        String tmpMonth = castMonth(tmpDate.substring(4, 7));
        String tmpDay = tmpDate.substring(8, 10);
        resultDate = "'" + tmpYear + "-" + tmpMonth + "-" + tmpDay + "'";
        //System.out.println(tmpYear);

        //System.out.println(tmpDay);
        return resultDate; //resultDate
    }

    private void jCalendarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendarPropertyChange
        /*
         -opcjonalnie - jak nic nie ma to wyświetlamy komunikat, że nic nie ma
         kolorujemy te miejsca w kalendarzu, które mają jakiś trening lub dietę (obwódka i kolor)
         */
        System.out.println("ZACZYNAM PROPERTYCHANGE");
        String tmpDate = changeDateFormat(jCalendar.getDate().toString());

        String query = "select nazwa from trening where data_treningu like " + tmpDate;
        //System.out.println(query);
        String trainingName = dataBase.getAnswer(query);
        //System.out.println(trainingName);
        eTrainingName.setText(trainingName);

        System.out.println("KOŃCZĘ PROPERTYCHANGE");

        fillTable(tmpDate);
        fillMeasurements(tmpDate);
        bSubmitDailyMeasurement.setText("Zatwierdź");
        jSubmitTraining.setText("Zapisz zmiany");
    }//GEN-LAST:event_jCalendarPropertyChange

    private int[] getColumnsWidths(javax.swing.JTable tblExercises) {
        int[] sizes = new int[tblExercises.getColumnCount()];
        for (int i = 0; i < sizes.length; i++) {
            System.out.print(i + ": ");
            System.out.print(tblExercises.getColumnModel().getColumn(i).getWidth());
            System.out.print("\t");
        }
        System.out.println("");
        return sizes;
    }

    private String getBodyPart(String exercise) {
        /*
         mając ćwiczenie trzeba wskazac jaka to partia miesni
         */
        String bodyPart = new String();
        String query = "select partia from cwiczenie where nazwa like '" + exercise + "'";
        bodyPart = dataBase.getAnswer(query);
        System.out.println("bodypart = " + bodyPart);
        return bodyPart;
    }

    private void jSubmitTrainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubmitTrainingActionPerformed
        /*
         - usuwamy poprzednia tabelke z bazy danych 
         - dodajemy wszystko z bieżącej tabeli z bieżącą datą 
         - aktualizaujemy nazwe treningu
         */
        if (tblExercises.getRowCount() > 0) {

            String deleteQuery = "DELETE FROM seria WHERE data_treningu like " + changeDateFormat(jCalendar.getDate().toString());
            System.out.println(deleteQuery);
            dataBase.update(deleteQuery);
            String insertQuery = generateSubmitQuery();
            System.out.println(insertQuery);
            dataBase.update(insertQuery);

            updateTrainingName();
        } else {
            System.out.println("nie mam nic do dodania!");
        }
    }//GEN-LAST:event_jSubmitTrainingActionPerformed

    private void tblExercisesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblExercisesMouseReleased
        int row = tblExercises.getSelectedRow();
        jSubmitTraining.setText("Zapisz zmiany");
        if (row >= 0) {
            jSubmitSetEdit.setEnabled(true);
        }
        cbChooseBodyPart.setSelectedItem(getBodyPart((String) tblExercises.getValueAt(row, 1)));
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

    }//GEN-LAST:event_tblExercisesMouseReleased

    private void jSubmitSetEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubmitSetEditActionPerformed

        int row = tblExercises.getSelectedRow();

        if (row != -1) {
            if (isReadyToSubmit()) {
                jSubmitTraining.setText("Zapisz zmiany");
                jTextArea1.setText("SUBMIT!");

                DefaultTableModel table = (DefaultTableModel) tblExercises.getModel();

                String nr = (String) tblExercises.getValueAt(row, 0);

                @SuppressWarnings({"UseOfObsoleteCollectionType", "MismatchedQueryAndUpdateOfCollection"})
                Vector vector = new Vector();

                System.out.println("Nr = " + nr);
                System.out.println("nazwa cwiczenia = " + cbChooseExercise.getSelectedItem().toString());
                System.out.println("obciazenie = " + sSetWeight.getValue());
                System.out.println("liczba powtorzen  = " + sReps.getValue());
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
                jTextArea1.setText("NOPE!");

                cbChooseBodyPart.setSelectedItem(getBodyPart((String) tblExercises.getValueAt(row, 1)));
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

        //czycimy edity i blokujemy guzik - done
    }//GEN-LAST:event_jSubmitSetEditActionPerformed

    private void jDeleteSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteSetActionPerformed
        int row = tblExercises.getSelectedRow();

        System.out.println("usuwam wiersz nr: " + row);
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
            deletedRow = row;
            bUndoDeleteSet.setEnabled(true);
        }
    }//GEN-LAST:event_jDeleteSetActionPerformed

    private void bUndoDeleteSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUndoDeleteSetActionPerformed

        //jak uda sie cofnac to:
        jSubmitTraining.setText("Zapisz zmiany");

        /*
         dodanie:  >= row - nic nie rób, < row - trzeba inkrementowac
         usuniecie: >= row - nic nie rób, < row - trzeba dekrementować
         */

        /*
         System.out.println("chce przywrócić dane:");
         DefaultTableModel table = (DefaultTableModel) tblExercises.getModel();
         //table.addRow(lastDeletedSet);
         table.insertRow(deletedRow, lastDeletedSet);
         System.out.println(lastDeletedSet);
         for (int i = 0; i < 4; i++) {
         lastDeletedSet.removeElementAt(0);
         }
        
         bUndoDeleteSet.setEnabled(false);
         System.out.println("kończę przywracać dane");*/
        System.out.println("narazie nie zrobione");
    }//GEN-LAST:event_bUndoDeleteSetActionPerformed

    private void updateTrainingName() {
        String query = "SELECT nazwa FROM `trening` where data_treningu like " + changeDateFormat(jCalendar.getDate().toString());
        //System.out.println(query);
        @SuppressWarnings("LocalVariableHidesMemberVariable")
        String result = dataBase.getAnswer(query);
        boolean insert = false;
        if (result.length() > 0) { //istnieje
            query = "UPDATE trening SET nazwa='" + eTrainingName.getText() + "' WHERE data_treningu like " + changeDateFormat(jCalendar.getDate().toString());
            System.out.println("zmiany zostaly wprowadzone");
            jSubmitTraining.setText("Zmiany wprowadzone!");
            insert = true;
        } else if (eTrainingName.getText().length() > 0) {
            query = "INSERT INTO `trening` (`nazwa`, `data_treningu`) VALUES ('" + eTrainingName.getText() + "', " + changeDateFormat(jCalendar.getDate().toString()) + ")";
            System.out.println("dodalem nowy wiersz");
            insert = true;
        }

        if (insert) {
            dataBase.update(query);
        }
    }

    private void bChangeTrainingNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bChangeTrainingNameActionPerformed
        /*
         jak nie istnieje taki wiersz to tworzymy nowy
         jak istnieje to zmieniamy nazwe
         */
        updateTrainingName();
    }//GEN-LAST:event_bChangeTrainingNameActionPerformed

    private void bSubmitDietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitDietActionPerformed
        System.out.println("trzeba zrobić zapis do bazy");
    }//GEN-LAST:event_bSubmitDietActionPerformed

    private void tblProductsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblProductsPropertyChange
        bSubmitDiet.setText("Zapisz zmiany");

    }//GEN-LAST:event_tblProductsPropertyChange

    private boolean isReadyToAddProduct() {
        if ((Integer) sGrams.getValue() >= 0
                && !cbChooseProduct.getSelectedItem().toString().equals("--wybierz produkt--")
                && !cbChooseCategory.getSelectedItem().toString().equals("--wybierz katerogię--")) {
            return true;
        } else {
            return false;
        }
    }

    private void bAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddProductActionPerformed
        //insert wszystko
        if (isReadyToAddProduct()) {
            jTextArea1.setText("SUBMIT!");
            //jSubmitTraining.setText("Zapisz zmiany");

            DefaultTableModel table = (DefaultTableModel) tblProducts.getModel();

            //czyszcze tabele
            //table.setRowCount(0);
            @SuppressWarnings({"UseOfObsoleteCollectionType", "MismatchedQueryAndUpdateOfCollection"})
            Vector vector = new Vector();

            String nextNr = "1";
            Integer tmp = 0;
            if (table.getRowCount() > 0) {
                System.out.println("wchodze w ifa");
                nextNr = String.valueOf(table.getValueAt(table.getRowCount() - 1, 0));
                tmp = Integer.parseInt(nextNr);
                tmp++;
                nextNr = tmp.toString();
            }

            String query = "";
            System.out.println("Nr = " + nextNr);
            System.out.println("nazwa produktu = " + cbChooseProduct.getSelectedItem().toString());
            int w = (int) sGrams.getValue();
            float weight = (float) w;
            System.out.println("waga = " + sGrams.getValue());
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

            System.out.println(nextNr);
            System.out.println(product2);
            System.out.println(sGrams.getValue());
            System.out.println(kcal);
            System.out.println(carbs);
            System.out.println(proteins);
            System.out.println(fats);

            vector.add(nextNr);
            vector.add(product2);
            vector.add(sGrams.getValue());
            vector.add(kcal);
            vector.add(carbs);
            vector.add(proteins);
            vector.add(fats);
            vector.add(new String("Usuń"));
            table.addRow(vector);

            needsTblCalculate();

        } else {
            jTextArea1.setText("NOPE!");

            // TUTAJ TRZEBA DODAC INFO ZE NIEPOPRAWNE DANE
        }

    }//GEN-LAST:event_bAddProductActionPerformed

    private void cbChooseCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChooseCategoryActionPerformed
        String category = cbChooseCategory.getSelectedItem().toString();
        cbChooseProduct.setEnabled(true);
        //lChooseExercise.setForeground(Color.black);
        cbChooseProduct.setModel(new javax.swing.DefaultComboBoxModel(initCbChooseProduct(category)));
    }//GEN-LAST:event_cbChooseCategoryActionPerformed

    private void cbChooseProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChooseProductActionPerformed
        // lSetWeight.setForeground(Color.black);
        //lReps.setForeground(Color.black);
        sGrams.setEnabled(true);
    }//GEN-LAST:event_cbChooseProductActionPerformed

    private void sGramsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_sGramsPropertyChange
        bAddProduct.setEnabled(true);
    }//GEN-LAST:event_sGramsPropertyChange

    private void tblProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductsMouseClicked
        int row = tblProducts.getSelectedRow();

        System.out.println("wyswietlam wiersz nr: " + row);
        if (row >= 0) {
            System.out.println(tblProducts.getValueAt(row, 0).toString());
            System.out.println(tblProducts.getValueAt(row, 1).toString());
            System.out.println(tblProducts.getValueAt(row, 2).toString());
            System.out.println(tblProducts.getValueAt(row, 3).toString());

            needsTblCalculate();
        }
    }//GEN-LAST:event_tblProductsMouseClicked

    private void bDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteProductActionPerformed
        int row = tblProducts.getSelectedRow();

        System.out.println("usuwam wiersz nr: " + row);
        if (row >= 0) {
            //String strNr = Integer.toString(row);
            System.out.println(tblProducts.getValueAt(row, 0).toString());
            System.out.println(tblProducts.getValueAt(row, 1).toString());
            System.out.println(tblProducts.getValueAt(row, 2).toString());
            System.out.println(tblProducts.getValueAt(row, 3).toString());
            /*    
             lastDeletedSet.add(nr);
             lastDeletedSet.add(exercise);
             lastDeletedSet.add(strWeight);
             lastDeletedSet.add(strReps);
             */
            ((DefaultTableModel) tblProducts.getModel()).removeRow(row);
        }
    }//GEN-LAST:event_bDeleteProductActionPerformed

    private void listenButton() {
        @SuppressWarnings("Convert2Diamond")
        List<JComponent> compList = new ArrayList<JComponent>();

        compList.add(sWeight.getEditor());
        compList.add(sWaist.getEditor());
        compList.add(sBiceps.getEditor());
        compList.add(sChest.getEditor());
        compList.add(sThigh.getEditor());
        compList.add(sCalf.getEditor());
        compList.add(sForearm.getEditor());

        @SuppressWarnings("Convert2Diamond")
        List<JFormattedTextField> fieldList = new ArrayList<JFormattedTextField>();
        List<DefaultFormatter> formatters = new ArrayList<DefaultFormatter>();
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

    private boolean isReadyToSubmit() {
        if ((Integer) sSetWeight.getValue() >= 0
                && (Integer) sReps.getValue() > 0
                && !cbChooseBodyPart.getSelectedItem().toString().equals("--wybierz partię--")
                && !cbChooseExercise.getSelectedItem().toString().equals("--wybierz ćwiczenie--")) {
            return true;
        } else {
            return false;
        }
    }

    private String[] initCbChooseCategory() {
        @SuppressWarnings("Convert2Diamond")
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist = dataBase.getAnswerList("SELECT distinct kategoria FROM produkty order by kategoria asc");

        @SuppressWarnings({"Convert2Diamond", "MismatchedQueryAndUpdateOfCollection"})
        ArrayList<String> tmp = new ArrayList<String>();
        tmp.add("--wybierz kategorię--");
        tmp.addAll(arraylist);

        String[] list = new String[tmp.size()];
        list = tmp.toArray(list);
        return list;
    }

    private String[] initCbChooseProduct(String category) {

        String query = "'" + category + "'";
        @SuppressWarnings("Convert2Diamond")
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist = dataBase.getAnswerList("select nazwa from produkty where kategoria like" + query + " order by nazwa");

        @SuppressWarnings("Convert2Diamond")
        ArrayList<String> tmp = new ArrayList<String>();
        tmp.add("--wybierz produkt--");

        tmp.addAll(arraylist);

        String[] list = new String[tmp.size()];
        list = tmp.toArray(list);
        return list;
    }

    private String[] initCbChooseBodyPart() {

        @SuppressWarnings("Convert2Diamond")
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist = dataBase.getAnswerList("select distinct partia from cwiczenie order by partia");

        @SuppressWarnings({"Convert2Diamond", "MismatchedQueryAndUpdateOfCollection"})
        ArrayList<String> tmp = new ArrayList<String>();
        tmp.add("--wybierz partię--");

        tmp.addAll(arraylist);

        String[] list = new String[tmp.size()];
        list = tmp.toArray(list);
        return list;
    }

    private String[] initCbChooseExercise(String bodyPart) {
        String query = "'" + bodyPart + "'";
        @SuppressWarnings("Convert2Diamond")
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist = dataBase.getAnswerList("select nazwa from cwiczenie where partia like" + query);

        @SuppressWarnings("Convert2Diamond")
        ArrayList<String> tmp = new ArrayList<String>();
        tmp.add("--wybierz ćwiczenie--");

        tmp.addAll(arraylist);

        String[] list = new String[tmp.size()];
        list = tmp.toArray(list);
        return list;
    }

    private void initTbl(int[] columnSizes, javax.swing.JTable tblExercises) {
        System.out.println("ustalam rozmiar tablicy");
        int columnCount = tblExercises.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            System.out.println(i + " = " + columnSizes[i]);
            tblExercises.getColumnModel().getColumn(i).setPreferredWidth(columnSizes[i]);
        }
    }

    private void updateMacros() {
        int rowlen = tblProducts.getRowCount();
        if (rowlen > 0) {
            int selectedRow = tblProducts.getSelectedRow();
            if (selectedRow > -1) {
                System.out.println("wybrany wiersz: " + selectedRow);
                String nazwa = tblProducts.getValueAt(selectedRow, 1).toString();
                String query = "SELECT * FROM `produkty` WHERE nazwa like '" + nazwa + "'";
                ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
                list = dataBase.getAnswerListofList(query);
                System.out.println("wyswietlam wynik wyszukiwania po nazwie: ");
                for (int i = 0; i < list.get(0).size(); i++) {
                    System.out.println(list.get(0).get(i));
                }

                int gramatura = Integer.parseInt(tblProducts.getValueAt(selectedRow, 2).toString());
                System.out.println("wyrzucam wartosc z tabeli (G): " + gramatura);
                /*
                 2 - kcal
                 3 - wegle
                 4 - bialko
                 5 - tluszcze
            
                 */
            }
        }
        /*for (int row = 0; row < rowlen; row++) {
         System.out.println("Nazwa: " + tblProducts.getValueAt(row, 1));
         System.out.println("Waga: "+ tblProducts.getValueAt(row, 2));
            
         }
         System.out.println("LISTA o dlugosci:"+list.size());
         System.out.println(list.get(0));
         */

        /*
         pobieramy wartosc 'nazwa' z tabelki
         wczytujemy sobie po tej wartosci z tabeli 'produkty'
         aktualizujemy tabele (gramy*wartosc_z_tabeli)/100
        
         */
    }

    private void needsTblCalculate() {
        int rowlen = tblProducts.getRowCount();

        updateMacros();

        int kcal = 0;
        int w = 0;
        int b = 0;
        int t = 0;

        for (int row = 0; row < rowlen; row++) {
            kcal += Integer.parseInt(tblProducts.getValueAt(row, 3).toString());
            w += Integer.parseInt(tblProducts.getValueAt(row, 4).toString());
            b += Integer.parseInt(tblProducts.getValueAt(row, 5).toString());
            t += Integer.parseInt(tblProducts.getValueAt(row, 6).toString());
        }
        System.out.println("Kcal = " + kcal);
        System.out.println("W = " + w);
        System.out.println("B = " + b);
        System.out.println("T = " + t);
    }

    private void myInitComponents() {
        // boolean fAdvanced = false;
        ImageIcon tab1 = new ImageIcon("img/b1.jpg");
        ImageIcon tab2 = new ImageIcon("img/b2.jpg");
        ImageIcon tab3 = new ImageIcon("img/b3.jpg");
        //jTabbedPane1.addTab("", jPanel2);
        //cbChooseExercise.setModel(new javax.swing.DefaultComboBoxModel(initCbChooseExercise()));
        pMainPanel.addTab("", tab1, pCalendar,
                "Does nothing");
        pMainPanel.addTab("", tab2, pAsk,
                "Does nothing");
        pMainPanel.addTab("", tab3, pAccount,
                "Does nothing");
        pAdvanced.setVisible(false);
        iBodyFat.setVisible(false);

        int exerciseSizes[] = {40, 150, 60, 70};
        initTbl(exerciseSizes, tblExercises);
        int productSizes[] = {10, 100, 20, 20, 20, 20, 20, 20};
        initTbl(productSizes, tblProducts);
        ((DefaultTableModel) tblProducts.getModel()).setRowCount(0);
        int needsSizes[] = {100, 30, 30, 30, 30};
        initTbl(needsSizes, tblNeeds);
        tblExercises.getColumnModel().getColumn(0).setPreferredWidth(10);
        fillMeasurements(changeDateFormat(jCalendar.getDate().toString()));
        listenButton();
    }

    @SuppressWarnings({"Convert2Lambda", "static-access"})
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WindowMaker.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowMaker.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowMaker.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowMaker.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        String tmp;

        /*try {
         tmp = dataBase.printResultSet(dataBase.rs);
         //jTextArea1.add(result, null);
         } catch (SQLException ex) {
         Logger.getLogger(WindowMaker.class.getName()).log(Level.SEVERE, null, ex);
         }*/
        //this.result = tmp;
        java.awt.EventQueue.invokeLater(new Runnable() {
            @SuppressWarnings("override")
            public void run() {
                new WindowMaker().setVisible(true);
            }
        });
        //
        //dataBase.closeEverything();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAddProduct;
    private javax.swing.JToggleButton bAdvanced;
    private javax.swing.JToggleButton bBodyFat;
    private javax.swing.JButton bChangeTrainingName;
    private javax.swing.JButton bDeleteProduct;
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
    private javax.swing.JTextField eTrainingName;
    private javax.swing.JLabel iArnold;
    private javax.swing.JLabel iBodyFat;
    private javax.swing.JLabel iChudzian;
    private javax.swing.JLabel iOwcaWK;
    private javax.swing.JLabel iPudzian;
    private javax.swing.JLabel iSportowiec;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jSubmitSetEdit;
    private javax.swing.JButton jSubmitTraining;
    private javax.swing.JTextArea jTextArea1;
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
    private javax.swing.JLabel lTrening;
    private javax.swing.JLabel lWaist;
    private javax.swing.JLabel lWeight;
    private javax.swing.JLabel lWhichBodyPart;
    private javax.swing.JTabbedPane pAccount;
    private javax.swing.JPanel pAdvanced;
    private javax.swing.JPanel pAsk;
    private javax.swing.JPanel pCalendar;
    private javax.swing.JPanel pDailyDiet;
    private javax.swing.JPanel pDailyMeasurement;
    private javax.swing.JPanel pDailyTraining;
    private javax.swing.JTabbedPane pDailyUpdate;
    private javax.swing.JTabbedPane pMainPanel;
    private javax.swing.JPanel pPrivate;
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
    private javax.swing.JSpinner sChest;
    private javax.swing.JSpinner sForearm;
    private javax.swing.JSpinner sGrams;
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
    private javax.swing.JTable tblExercises;
    private javax.swing.JTable tblNeeds;
    private javax.swing.JTable tblProducts;
    // End of variables declaration//GEN-END:variables
}
