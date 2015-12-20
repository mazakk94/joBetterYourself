package lab_jdbc;

import javax.swing.ImageIcon;

public class WindowMaker extends javax.swing.JFrame {

    public WindowMaker() {
        initComponents();
        myInitComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbWhichBody = new javax.swing.ButtonGroup();
        pMainPanel = new javax.swing.JTabbedPane();
        pAsk = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pAccount = new javax.swing.JTabbedPane();
        pPrivate = new javax.swing.JPanel();
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
        jLabel19 = new javax.swing.JLabel();
        jSpinner9 = new javax.swing.JSpinner();
        jSpinner10 = new javax.swing.JSpinner();
        jSpinner11 = new javax.swing.JSpinner();
        jSpinner12 = new javax.swing.JSpinner();
        jSpinner13 = new javax.swing.JSpinner();
        jSpinner14 = new javax.swing.JSpinner();
        jSpinner15 = new javax.swing.JSpinner();
        jSpinner16 = new javax.swing.JSpinner();
        bTargetSubmit = new javax.swing.JButton();
        iChudzian = new javax.swing.JLabel();
        iSportowiec = new javax.swing.JLabel();
        iOwcaWK = new javax.swing.JLabel();
        iPudzian = new javax.swing.JLabel();
        iArnold = new javax.swing.JLabel();
        lChudzian = new javax.swing.JLabel();
        lSportowiec = new javax.swing.JLabel();
        lOwcaWK = new javax.swing.JLabel();
        lPudzian = new javax.swing.JLabel();
        lArnold = new javax.swing.JLabel();
        rbChudzian = new javax.swing.JRadioButton();
        rbSportowiec = new javax.swing.JRadioButton();
        rbOwcaWK = new javax.swing.JRadioButton();
        rbPudzian = new javax.swing.JRadioButton();
        rbArnold = new javax.swing.JRadioButton();
        pCalendar = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        jSpinner6 = new javax.swing.JSpinner();
        jSpinner7 = new javax.swing.JSpinner();
        jSpinner8 = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();

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
                .addContainerGap(320, Short.MAX_VALUE)
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
                .addContainerGap(187, Short.MAX_VALUE))
        );

        pMainPanel.addTab("", pAsk);

        pAccount.setName("pAccount"); // NOI18N

        javax.swing.GroupLayout pPrivateLayout = new javax.swing.GroupLayout(pPrivate);
        pPrivate.setLayout(pPrivateLayout);
        pPrivateLayout.setHorizontalGroup(
            pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 886, Short.MAX_VALUE)
        );
        pPrivateLayout.setVerticalGroup(
            pPrivateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );

        pAccount.addTab("Edytuj dane osobowe", pPrivate);

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

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel19.setText("Barki");

        jSpinner9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jSpinner10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jSpinner11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jSpinner12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jSpinner13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jSpinner14.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jSpinner15.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jSpinner16.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        javax.swing.GroupLayout pAdvancedLayout = new javax.swing.GroupLayout(pAdvanced);
        pAdvanced.setLayout(pAdvancedLayout);
        pAdvancedLayout.setHorizontalGroup(
            pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAdvancedLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pAdvancedLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel16))
                    .addComponent(jSpinner13, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jSpinner14, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pAdvancedLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jSpinner15, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAdvancedLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addGap(43, 43, 43)))
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner16, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pAdvancedLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel19)))
                .addGap(43, 43, 43)
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAdvancedLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(8, 8, 8)))
                .addGap(50, 50, 50)
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSpinner10)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pAdvancedLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pAdvancedLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pAdvancedLayout.createSequentialGroup()
                        .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        bTargetSubmit.setText("Zatwierdź");
        bTargetSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTargetSubmitActionPerformed(evt);
            }
        });

        iChudzian.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mazi\\Documents\\NetBeansProjects\\lab_JDBC\\img\\chudzian.jpg")); // NOI18N
        iChudzian.setPreferredSize(new java.awt.Dimension(150, 150));
        iChudzian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iOwcaWKMouseClicked(evt);
            }
        });

        iSportowiec.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mazi\\Documents\\NetBeansProjects\\lab_JDBC\\img\\sportowiec.jpg")); // NOI18N
        iSportowiec.setPreferredSize(new java.awt.Dimension(150, 150));
        iSportowiec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iOwcaWKMouseClicked(evt);
            }
        });

        iOwcaWK.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mazi\\Documents\\NetBeansProjects\\lab_JDBC\\img\\owcawk.jpg")); // NOI18N
        iOwcaWK.setPreferredSize(new java.awt.Dimension(150, 150));
        iOwcaWK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iOwcaWKMouseClicked(evt);
            }
        });

        iPudzian.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mazi\\Documents\\NetBeansProjects\\lab_JDBC\\img\\pudzian.jpg")); // NOI18N
        iPudzian.setPreferredSize(new java.awt.Dimension(150, 150));
        iPudzian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iOwcaWKMouseClicked(evt);
            }
        });

        iArnold.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mazi\\Documents\\NetBeansProjects\\lab_JDBC\\img\\arnold.jpg")); // NOI18N
        iArnold.setPreferredSize(new java.awt.Dimension(150, 150));
        iArnold.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iArnoldMouseClicked(evt);
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

        rbWhichBody.add(rbSportowiec);
        rbSportowiec.setText("jRadioButton3");

        rbWhichBody.add(rbOwcaWK);
        rbOwcaWK.setText("jRadioButton2");

        rbWhichBody.add(rbPudzian);
        rbPudzian.setText("jRadioButton4");

        rbWhichBody.add(rbArnold);
        rbArnold.setText("jRadioButton5");

        javax.swing.GroupLayout pTargetLayout = new javax.swing.GroupLayout(pTarget);
        pTarget.setLayout(pTargetLayout);
        pTargetLayout.setHorizontalGroup(
            pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTargetLayout.createSequentialGroup()
                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTargetLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bAdvanced)
                            .addGroup(pTargetLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(iChudzian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pTargetLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(rbChudzian)))
                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTargetLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(iSportowiec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(iOwcaWK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(iPudzian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(iArnold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177))
                    .addGroup(pTargetLayout.createSequentialGroup()
                        .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pTargetLayout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(bTargetSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pTargetLayout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(rbSportowiec)
                                .addGap(77, 77, 77)
                                .addComponent(rbPudzian)
                                .addGap(61, 61, 61)
                                .addComponent(rbArnold)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(pTargetLayout.createSequentialGroup()
                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTargetLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(pAdvanced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pTargetLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lChudzian)
                        .addGap(90, 90, 90)
                        .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbOwcaWK)
                            .addGroup(pTargetLayout.createSequentialGroup()
                                .addComponent(lSportowiec)
                                .addGap(75, 75, 75)
                                .addComponent(lOwcaWK)
                                .addGap(82, 82, 82)
                                .addComponent(lPudzian)
                                .addGap(97, 97, 97)
                                .addComponent(lArnold)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pTargetLayout.setVerticalGroup(
            pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTargetLayout.createSequentialGroup()
                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTargetLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bAdvanced))
                    .addGroup(pTargetLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(bTargetSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbChudzian)
                    .addComponent(rbSportowiec)
                    .addComponent(rbOwcaWK)
                    .addComponent(rbPudzian)
                    .addComponent(rbArnold))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lChudzian)
                    .addComponent(lSportowiec)
                    .addComponent(lOwcaWK)
                    .addComponent(lPudzian)
                    .addComponent(lArnold))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iChudzian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iSportowiec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iOwcaWK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iArnold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iPudzian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(pAdvanced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pAccount.addTab("Edytuj swój cel", pTarget);

        pMainPanel.addTab("", pAccount);

        pCalendar.setBackground(new java.awt.Color(153, 204, 255));
        pCalendar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pCalendar.setForeground(new java.awt.Color(153, 204, 255));
        pCalendar.setToolTipText("");
        pCalendar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setText("Test");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Wybierz dzień w kalendarzu");

        jCalendar1.setBackground(new java.awt.Color(255, 255, 255));
        jCalendar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jCalendar1.setDecorationBackgroundColor(new java.awt.Color(255, 255, 255));
        jCalendar1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jCalendar1.setWeekOfYearVisible(false);

        jTabbedPane3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Dieta", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Trening", jPanel7);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Waga");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Pas");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Biceps");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("Klatka");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setText("Udo");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setText("Łydka");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setText("Przedramię");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setText("Barki");

        jSpinner1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jSpinner2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jSpinner3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jSpinner4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jSpinner5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jSpinner6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jSpinner7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jSpinner8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jButton2.setText("Zatwierdź");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(96, 96, 96))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(46, 46, 46)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Pomiary", jPanel8);

        javax.swing.GroupLayout pCalendarLayout = new javax.swing.GroupLayout(pCalendar);
        pCalendar.setLayout(pCalendarLayout);
        pCalendarLayout.setHorizontalGroup(
            pCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCalendarLayout.createSequentialGroup()
                .addGroup(pCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pCalendarLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jButton1))
                    .addGroup(pCalendarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pCalendarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );
        pCalendarLayout.setVerticalGroup(
            pCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCalendarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCalendarLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(52, 52, 52))
                    .addGroup(pCalendarLayout.createSequentialGroup()
                        .addComponent(jTabbedPane3)
                        .addContainerGap())))
        );

        pMainPanel.addTab("", pCalendar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bTargetSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTargetSubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bTargetSubmitActionPerformed

    private void bAdvancedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdvancedActionPerformed
        boolean flag = true;
        if (bAdvanced.isSelected()) {
            flag = true;
        } else {
            flag = false;
        }
        pAdvanced.setVisible(flag);
    }//GEN-LAST:event_bAdvancedActionPerformed

    private void iArnoldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iArnoldMouseClicked
        boolean flag = true;
        rbArnold.setSelected(flag);
    }//GEN-LAST:event_iArnoldMouseClicked

    private void iOwcaWKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iOwcaWKMouseClicked
        boolean flag = true;
        rbOwcaWK.setSelected(flag);
    }//GEN-LAST:event_iOwcaWKMouseClicked

    private void myInitComponents() {
        boolean fAdvanced = false;
        ImageIcon tab1 = new ImageIcon("img/b1.jpg");
        ImageIcon tab2 = new ImageIcon("img/b2.jpg");
        ImageIcon tab3 = new ImageIcon("img/b3.jpg");
        //jTabbedPane1.addTab("", jPanel2);
        pMainPanel.addTab("", tab1, pCalendar,
                "Does nothing");
        pMainPanel.addTab("", tab2, pAsk,
                "Does nothing");
        pMainPanel.addTab("", tab3, pAccount,
                "Does nothing");
        pAdvanced.setVisible(fAdvanced);
    }

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
            java.util.logging.Logger.getLogger(WindowMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        //DataBaseHandler dataBase = new DataBaseHandler();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowMaker().setVisible(true);
            }
        });
        //
        //dataBase.closeEverything();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bAdvanced;
    private javax.swing.JButton bTargetSubmit;
    private javax.swing.JLabel iArnold;
    private javax.swing.JLabel iChudzian;
    private javax.swing.JLabel iOwcaWK;
    private javax.swing.JLabel iPudzian;
    private javax.swing.JLabel iSportowiec;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JCalendar jCalendar1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner13;
    private javax.swing.JSpinner jSpinner14;
    private javax.swing.JSpinner jSpinner15;
    private javax.swing.JSpinner jSpinner16;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel lArnold;
    private javax.swing.JLabel lChudzian;
    private javax.swing.JLabel lOwcaWK;
    private javax.swing.JLabel lPudzian;
    private javax.swing.JLabel lSportowiec;
    private javax.swing.JTabbedPane pAccount;
    private javax.swing.JPanel pAdvanced;
    private javax.swing.JPanel pAsk;
    private javax.swing.JPanel pCalendar;
    private javax.swing.JTabbedPane pMainPanel;
    private javax.swing.JPanel pPrivate;
    private javax.swing.JPanel pTarget;
    private javax.swing.JRadioButton rbArnold;
    private javax.swing.JRadioButton rbChudzian;
    private javax.swing.JRadioButton rbOwcaWK;
    private javax.swing.JRadioButton rbPudzian;
    private javax.swing.JRadioButton rbSportowiec;
    private javax.swing.ButtonGroup rbWhichBody;
    // End of variables declaration//GEN-END:variables
}
