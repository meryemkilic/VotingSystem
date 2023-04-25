/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mery.votingsystem;

/**
 *
 * @author merye
 */
public class CreateElectionPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateElectionPanel
     */
    public CreateElectionPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        gradientPanel1 = new com.mery.votingsystem.GradientPanel();
        jLabel2 = new javax.swing.JLabel();
        candidateJComboBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setBackground(new java.awt.Color(249, 247, 247));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gradientPanel1.setBackground(new java.awt.Color(17, 45, 78));
        gradientPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gradientPanel1.setForeground(new java.awt.Color(17, 45, 78));
        gradientPanel1.setGradientEndd(new java.awt.Color(214, 230, 242));
        gradientPanel1.setGradientStart(new java.awt.Color(118, 159, 205));
        gradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(17, 45, 78));
        jLabel2.setText("*Identify the election for which he is nominated.");
        gradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 400, 20));

        candidateJComboBox.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        gradientPanel1.add(candidateJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 300, -1));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(17, 45, 78));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Presidential");
        gradientPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 230, -1));

        jList2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(jList2);

        gradientPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 230, 200));

        jList3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(jList3);

        gradientPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 230, 200));

        jList4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jScrollPane4.setViewportView(jList4);

        gradientPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 230, 200));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(17, 45, 78));
        jLabel13.setText("Candidate:");
        gradientPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 130, -1));

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(17, 45, 78));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Municipial");
        gradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 230, -1));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(17, 45, 78));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Mukhtar");
        gradientPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 230, -1));

        jButton1.setBackground(new java.awt.Color(17, 45, 78));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton1.setText("<");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gradientPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 50, 30));

        jButton3.setBackground(new java.awt.Color(17, 45, 78));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setText("Save");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gradientPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 80, 30));

        jButton4.setBackground(new java.awt.Color(17, 45, 78));
        jButton4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton4.setText(">");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gradientPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 50, 30));

        add(gradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 770, 400));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(17, 45, 78));
        jLabel3.setText("Create Election");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(17, 45, 78));
        jLabel7.setText("Please fill in the information completely.");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 220, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> candidateJComboBox;
    private com.mery.votingsystem.GradientPanel gradientPanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
