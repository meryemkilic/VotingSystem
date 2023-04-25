/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mery.votingsystem;

/**
 *
 * @author merye
 */
public class CreateUserPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateUserPanel
     */
    public CreateUserPanel() {
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

        jLabel3 = new javax.swing.JLabel();
        gradientPanel1 = new com.mery.votingsystem.GradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        neighbourhoodJComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cityJComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ageJTextField = new javax.swing.JTextField();
        passwordJTextField = new javax.swing.JTextField();
        surnameJTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nameJTextField1 = new javax.swing.JTextField();
        usernameJTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(249, 247, 247));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(17, 45, 78));
        jLabel3.setText("Create User");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        gradientPanel1.setBackground(new java.awt.Color(17, 45, 78));
        gradientPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gradientPanel1.setForeground(new java.awt.Color(17, 45, 78));
        gradientPanel1.setGradientEndd(new java.awt.Color(214, 230, 242));
        gradientPanel1.setGradientStart(new java.awt.Color(118, 159, 205));
        gradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 45, 78));
        jLabel1.setText("Neighbourhood:");
        gradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 160, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(17, 45, 78));
        jLabel5.setText("Surname:");
        gradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 130, -1));

        neighbourhoodJComboBox.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        gradientPanel1.add(neighbourhoodJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 180, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(17, 45, 78));
        jLabel6.setText("Age:");
        gradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 130, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(17, 45, 78));
        jLabel2.setText("*Please select the neighbourhood you live in.");
        gradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 400, 20));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(17, 45, 78));
        jLabel8.setText("City:");
        gradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 130, -1));

        cityJComboBox.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        gradientPanel1.add(cityJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 180, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(17, 45, 78));
        jLabel9.setText("Password:");
        gradientPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 130, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(17, 45, 78));
        jLabel10.setText("Please select the city you live in.");
        gradientPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 320, 20));

        ageJTextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        gradientPanel1.add(ageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 180, -1));

        passwordJTextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        gradientPanel1.add(passwordJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 180, -1));

        surnameJTextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        gradientPanel1.add(surnameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 180, -1));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(17, 45, 78));
        jLabel11.setText("Name:");
        gradientPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 130, -1));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(17, 45, 78));
        jLabel12.setText("Username:");
        gradientPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 130, -1));

        nameJTextField1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        gradientPanel1.add(nameJTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 180, -1));

        usernameJTextField2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        gradientPanel1.add(usernameJTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 180, -1));

        jButton3.setBackground(new java.awt.Color(17, 45, 78));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setText("Save");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gradientPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 80, 30));

        add(gradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 770, 400));

        jLabel7.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(17, 45, 78));
        jLabel7.setText("Please fill in the information completely.");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 220, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageJTextField;
    private javax.swing.JComboBox<String> cityJComboBox;
    private com.mery.votingsystem.GradientPanel gradientPanel1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameJTextField1;
    private javax.swing.JComboBox<String> neighbourhoodJComboBox;
    private javax.swing.JTextField passwordJTextField;
    private javax.swing.JTextField surnameJTextField;
    private javax.swing.JTextField usernameJTextField2;
    // End of variables declaration//GEN-END:variables
}