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
        sTargetWeight = new javax.swing.JSpinner();
        sTargetBiceps = new javax.swing.JSpinner();
        sTargetWaist = new javax.swing.JSpinner();
        sTargetChest = new javax.swing.JSpinner();
        sTargetThigh = new javax.swing.JSpinner();
        sTargetCalf = new javax.swing.JSpinner();
        sTargetForearm = new javax.swing.JSpinner();
        sTargetShoulders = new javax.swing.JSpinner();
        bSubmitTarget = new javax.swing.JButton();
        iPudzian = new javax.swing.JLabel();
        iArnold = new javax.swing.JLabel();
        lChudzian = new javax.swing.JLabel();
        lSportowiec = new javax.swing.JLabel();
        lOwcaWK = new javax.swing.JLabel();
        lPudzian = new javax.swing.JLabel();
        lArnold = new javax.swing.JLabel();
        rbChudzian = new javax.swing.JRadioButton();
        rbOwcaWK = new javax.swing.JRadioButton();
        rbSportowiec = new javax.swing.JRadioButton();
        rbPudzian = new javax.swing.JRadioButton();
        rbArnold = new javax.swing.JRadioButton();
        iOwcaWK = new javax.swing.JLabel();
        iSportowiec = new javax.swing.JLabel();
        iChudzian = new javax.swing.JLabel();
        pCalendar = new javax.swing.JPanel();
        lChooseDay = new javax.swing.JLabel();
        jCalendar = new com.toedter.calendar.JCalendar();
        pDailyUpdate = new javax.swing.JTabbedPane();
        pDailyDiet = new javax.swing.JPanel();
        pDailyTraining = new javax.swing.JPanel();
        pDailyMeasurement = new javax.swing.JPanel();
        lWeight = new javax.swing.JLabel();
        lWaist = new javax.swing.JLabel();
        lBiceps = new javax.swing.JLabel();
        lChest = new javax.swing.JLabel();
        lThigh = new javax.swing.JLabel();
        lCalf = new javax.swing.JLabel();
        lForearm = new javax.swing.JLabel();
        lShoulders = new javax.swing.JLabel();
        sWeight = new javax.swing.JSpinner();
        sBiceps = new javax.swing.JSpinner();
        sWaist = new javax.swing.JSpinner();
        sChest = new javax.swing.JSpinner();
        sThigh = new javax.swing.JSpinner();
        sCalf = new javax.swing.JSpinner();
        sForearm = new javax.swing.JSpinner();
        sShoulders = new javax.swing.JSpinner();
        bSubmitDailyMeasurement = new javax.swing.JButton();

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

        sTargetWeight.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sTargetBiceps.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sTargetWaist.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sTargetChest.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sTargetThigh.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sTargetCalf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sTargetForearm.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sTargetShoulders.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

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
                    .addComponent(sTargetThigh, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(sTargetCalf, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pAdvancedLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(sTargetForearm, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAdvancedLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addGap(43, 43, 43)))
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sTargetShoulders, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pAdvancedLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel19)))
                .addGap(43, 43, 43)
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sTargetChest, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAdvancedLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(8, 8, 8)))
                .addGap(50, 50, 50)
                .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sTargetBiceps)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addGap(52, 52, 52)
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
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sTargetChest, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pAdvancedLayout.createSequentialGroup()
                        .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sTargetThigh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sTargetCalf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sTargetForearm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sTargetShoulders, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        bSubmitTarget.setText("Zatwierdź");
        bSubmitTarget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubmitTargetActionPerformed(evt);
            }
        });

        iPudzian.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mazi\\Documents\\NetBeansProjects\\lab_JDBC\\img\\pudzian.jpg")); // NOI18N
        iPudzian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iPudzianMouseClicked(evt);
            }
        });

        iArnold.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mazi\\Documents\\NetBeansProjects\\lab_JDBC\\img\\arnold.jpg")); // NOI18N
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

        rbWhichBody.add(rbOwcaWK);
        rbOwcaWK.setText("jRadioButton3");

        rbWhichBody.add(rbSportowiec);
        rbSportowiec.setText("jRadioButton2");

        rbWhichBody.add(rbPudzian);
        rbPudzian.setText("jRadioButton4");

        rbWhichBody.add(rbArnold);
        rbArnold.setText("jRadioButton5");

        iOwcaWK.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mazi\\Documents\\NetBeansProjects\\lab_JDBC\\img\\owcawk.jpg")); // NOI18N
        iOwcaWK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iOwcaWKMouseClicked(evt);
            }
        });

        iSportowiec.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mazi\\Documents\\NetBeansProjects\\lab_JDBC\\img\\sportowiec.jpg")); // NOI18N
        iSportowiec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iSportowiecMouseClicked(evt);
            }
        });

        iChudzian.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mazi\\Documents\\NetBeansProjects\\lab_JDBC\\img\\chudzian.jpg")); // NOI18N
        iChudzian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iChudzianMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pTargetLayout = new javax.swing.GroupLayout(pTarget);
        pTarget.setLayout(pTargetLayout);
        pTargetLayout.setHorizontalGroup(
            pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTargetLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTargetLayout.createSequentialGroup()
                        .addComponent(iChudzian, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(iSportowiec, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(548, Short.MAX_VALUE))
                    .addComponent(pAdvanced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(pTargetLayout.createSequentialGroup()
                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTargetLayout.createSequentialGroup()
                        .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pTargetLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bAdvanced))
                            .addGroup(pTargetLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(rbChudzian)))
                        .addGap(32, 32, 32)
                        .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pTargetLayout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(bSubmitTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pTargetLayout.createSequentialGroup()
                                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTargetLayout.createSequentialGroup()
                                        .addComponent(iPudzian)
                                        .addGap(18, 18, 18))
                                    .addGroup(pTargetLayout.createSequentialGroup()
                                        .addGap(207, 207, 207)
                                        .addComponent(rbOwcaWK)
                                        .addGap(77, 77, 77)
                                        .addComponent(rbPudzian)
                                        .addGap(37, 37, 37)))
                                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(iArnold)
                                    .addComponent(rbArnold)
                                    .addGroup(pTargetLayout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(lArnold))))))
                    .addGroup(pTargetLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lChudzian)
                        .addGap(90, 90, 90)
                        .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbSportowiec)
                            .addGroup(pTargetLayout.createSequentialGroup()
                                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(iOwcaWK, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pTargetLayout.createSequentialGroup()
                                        .addComponent(lSportowiec)
                                        .addGap(75, 75, 75)
                                        .addComponent(lOwcaWK)))
                                .addGap(80, 80, 80)
                                .addComponent(lPudzian, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                        .addComponent(bSubmitTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbChudzian)
                    .addComponent(rbOwcaWK)
                    .addComponent(rbSportowiec)
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
                .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(iSportowiec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iOwcaWK, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pTargetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(iArnold)
                        .addComponent(iPudzian))
                    .addComponent(iChudzian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
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

        lChooseDay.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lChooseDay.setText("Wybierz dzień w kalendarzu");

        jCalendar.setBackground(new java.awt.Color(255, 255, 255));
        jCalendar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jCalendar.setDecorationBackgroundColor(new java.awt.Color(255, 255, 255));
        jCalendar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jCalendar.setWeekOfYearVisible(false);

        pDailyUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pDailyUpdate.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        javax.swing.GroupLayout pDailyDietLayout = new javax.swing.GroupLayout(pDailyDiet);
        pDailyDiet.setLayout(pDailyDietLayout);
        pDailyDietLayout.setHorizontalGroup(
            pDailyDietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pDailyDietLayout.setVerticalGroup(
            pDailyDietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pDailyUpdate.addTab("Dieta", pDailyDiet);

        javax.swing.GroupLayout pDailyTrainingLayout = new javax.swing.GroupLayout(pDailyTraining);
        pDailyTraining.setLayout(pDailyTrainingLayout);
        pDailyTrainingLayout.setHorizontalGroup(
            pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pDailyTrainingLayout.setVerticalGroup(
            pDailyTrainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pDailyUpdate.addTab("Trening", pDailyTraining);

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

        lShoulders.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lShoulders.setText("Barki");

        sWeight.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sBiceps.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sWaist.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sChest.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sThigh.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sCalf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sForearm.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        sShoulders.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        bSubmitDailyMeasurement.setText("Zatwierdź");
        bSubmitDailyMeasurement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubmitDailyMeasurementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pDailyMeasurementLayout = new javax.swing.GroupLayout(pDailyMeasurement);
        pDailyMeasurement.setLayout(pDailyMeasurementLayout);
        pDailyMeasurementLayout.setHorizontalGroup(
            pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDailyMeasurementLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDailyMeasurementLayout.createSequentialGroup()
                            .addComponent(lThigh)
                            .addGap(96, 96, 96))
                        .addGroup(pDailyMeasurementLayout.createSequentialGroup()
                            .addComponent(lWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(46, 46, 46)))
                    .addGroup(pDailyMeasurementLayout.createSequentialGroup()
                        .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sThigh, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)))
                .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDailyMeasurementLayout.createSequentialGroup()
                        .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lWaist)
                            .addComponent(sWaist, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lCalf)
                            .addComponent(sCalf, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
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
                                .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lForearm)
                                    .addComponent(sForearm, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sShoulders, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lShoulders)))))
                    .addComponent(bSubmitDailyMeasurement, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        pDailyMeasurementLayout.setVerticalGroup(
            pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDailyMeasurementLayout.createSequentialGroup()
                .addContainerGap()
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
                    .addComponent(lForearm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lShoulders, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDailyMeasurementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sThigh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sCalf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sForearm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sShoulders, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(bSubmitDailyMeasurement, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        pDailyUpdate.addTab("Pomiary", pDailyMeasurement);

        javax.swing.GroupLayout pCalendarLayout = new javax.swing.GroupLayout(pCalendar);
        pCalendar.setLayout(pCalendarLayout);
        pCalendarLayout.setHorizontalGroup(
            pCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCalendarLayout.createSequentialGroup()
                .addGroup(pCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pCalendarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pCalendarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lChooseDay, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pDailyUpdate)
                .addContainerGap())
        );
        pCalendarLayout.setVerticalGroup(
            pCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCalendarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCalendarLayout.createSequentialGroup()
                        .addComponent(lChooseDay, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pCalendarLayout.createSequentialGroup()
                        .addComponent(pDailyUpdate)
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

    private void bSubmitDailyMeasurementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitDailyMeasurementActionPerformed
        // TODO add your handling code here:
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

    private void iArnoldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iArnoldMouseClicked
        boolean flag = true;
        rbArnold.setSelected(flag);
    }//GEN-LAST:event_iArnoldMouseClicked

    private void iPudzianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iPudzianMouseClicked
        boolean flag = true;
        rbPudzian.setSelected(flag);
    }//GEN-LAST:event_iPudzianMouseClicked

    private void iOwcaWKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iOwcaWKMouseClicked
        boolean flag = true;
        rbOwcaWK.setSelected(flag);
    }//GEN-LAST:event_iOwcaWKMouseClicked

    private void iSportowiecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iSportowiecMouseClicked
        boolean flag = true;
        rbSportowiec.setSelected(flag);
    }//GEN-LAST:event_iSportowiecMouseClicked

    private void iChudzianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iChudzianMouseClicked
        boolean flag = true;
        rbChudzian.setSelected(flag);
    }//GEN-LAST:event_iChudzianMouseClicked

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

    @SuppressWarnings("Convert2Lambda")
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
            @SuppressWarnings("override")
            public void run() {
                new WindowMaker().setVisible(true);
            }
        });
        //
        //dataBase.closeEverything();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bAdvanced;
    private javax.swing.JButton bSubmitDailyMeasurement;
    private javax.swing.JButton bSubmitTarget;
    private javax.swing.JLabel iArnold;
    private javax.swing.JLabel iChudzian;
    private javax.swing.JLabel iOwcaWK;
    private javax.swing.JLabel iPudzian;
    private javax.swing.JLabel iSportowiec;
    private com.toedter.calendar.JCalendar jCalendar;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lArnold;
    private javax.swing.JLabel lBiceps;
    private javax.swing.JLabel lCalf;
    private javax.swing.JLabel lChest;
    private javax.swing.JLabel lChooseDay;
    private javax.swing.JLabel lChudzian;
    private javax.swing.JLabel lForearm;
    private javax.swing.JLabel lOwcaWK;
    private javax.swing.JLabel lPudzian;
    private javax.swing.JLabel lShoulders;
    private javax.swing.JLabel lSportowiec;
    private javax.swing.JLabel lThigh;
    private javax.swing.JLabel lWaist;
    private javax.swing.JLabel lWeight;
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
    private javax.swing.JRadioButton rbOwcaWK;
    private javax.swing.JRadioButton rbPudzian;
    private javax.swing.JRadioButton rbSportowiec;
    private javax.swing.ButtonGroup rbWhichBody;
    private javax.swing.JSpinner sBiceps;
    private javax.swing.JSpinner sCalf;
    private javax.swing.JSpinner sChest;
    private javax.swing.JSpinner sForearm;
    private javax.swing.JSpinner sShoulders;
    private javax.swing.JSpinner sTargetBiceps;
    private javax.swing.JSpinner sTargetCalf;
    private javax.swing.JSpinner sTargetChest;
    private javax.swing.JSpinner sTargetForearm;
    private javax.swing.JSpinner sTargetShoulders;
    private javax.swing.JSpinner sTargetThigh;
    private javax.swing.JSpinner sTargetWaist;
    private javax.swing.JSpinner sTargetWeight;
    private javax.swing.JSpinner sThigh;
    private javax.swing.JSpinner sWaist;
    private javax.swing.JSpinner sWeight;
    // End of variables declaration//GEN-END:variables
}
