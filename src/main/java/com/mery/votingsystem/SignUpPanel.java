/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mery.votingsystem;

import com.mery.votingsystem.jpa.*;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author merye
 */
public class SignUpPanel extends javax.swing.JPanel {

    /**
     * Creates new form SignUpPanel
     */
    public SignUpPanel() {
        initComponents();
        refreshCity();
        refreshNeigh();
        randomNumber();

    }

    public void refreshCity() {
        jComboBoxCity.removeAllItems();
        for (String city : MSK.getCities()) {
            jComboBoxCity.addItem(city);
        }
        jComboBoxCity.setSelectedIndex(0);
    }

    public void refreshNeigh() {
        jComboBoxNeigh.removeAllItems();
        String selectedCity = (String) jComboBoxCity.getSelectedItem();
        for (Neighbourhood neigh : MSK.getNeighbyCity(selectedCity)) {
            jComboBoxNeigh.addItem(neigh);
        }
        jComboBoxNeigh.setSelectedIndex(0);
    }

    public void randomNumber() {
        Random random = new Random();
        String text = "";
        for (int i = 0; i < 5; i++) {
            int rn = random.nextInt(50, 100);
            char letter = (char) rn;
            text += letter;
        }
        randomNumberjLabel.setText(text);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        gradientPanel1 = new com.mery.votingsystem.GradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldTC = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldSurname = new javax.swing.JTextField();
        jTextFieldAge = new javax.swing.JTextField();
        jComboBoxCity = new javax.swing.JComboBox<>();
        jComboBoxNeigh = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jTextFieldPassword = new javax.swing.JTextField();
        randomNumberjLabel = new javax.swing.JLabel();
        jTextFieldVerify = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        SignupjButton = new javax.swing.JButton();
        SignupjButton2 = new javax.swing.JButton();
        backjButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        gradientPanel2 = new com.mery.votingsystem.GradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        gradientPanel3 = new com.mery.votingsystem.GradientPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldTC1 = new javax.swing.JTextField();
        jTextFieldName1 = new javax.swing.JTextField();
        jTextFieldSurname1 = new javax.swing.JTextField();
        jTextFieldAge1 = new javax.swing.JTextField();
        jComboBoxCity1 = new javax.swing.JComboBox<>();
        jComboBoxNeigh1 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldUsername1 = new javax.swing.JTextField();
        jTextFieldPassword1 = new javax.swing.JTextField();
        randomNumberjLabel1 = new javax.swing.JLabel();
        jTextFieldVerify1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        SignupjButton1 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        gradientPanel4 = new com.mery.votingsystem.GradientPanel();

        setBackground(new java.awt.Color(249, 247, 247));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 45, 78));
        jLabel1.setText("Sign Up Form");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 38, -1, 41));

        gradientPanel1.setGradientEndd(new java.awt.Color(219, 226, 239));
        gradientPanel1.setGradientStart(new java.awt.Color(63, 114, 175));
        gradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(17, 45, 78));
        jLabel2.setText("TC No: ");
        gradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 38, 81, 24));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(17, 45, 78));
        jLabel3.setText("Name: ");
        gradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 76, 81, 24));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(17, 45, 78));
        jLabel4.setText("Surname: ");
        gradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 120, 81, 24));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(17, 45, 78));
        jLabel5.setText("Age: ");
        gradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 164, 81, 24));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(17, 45, 78));
        jLabel6.setText("City: ");
        gradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 81, 24));

        jTextFieldTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTCActionPerformed(evt);
            }
        });
        gradientPanel1.add(jTextFieldTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 38, 168, -1));
        gradientPanel1.add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 76, 168, -1));
        gradientPanel1.add(jTextFieldSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 120, 168, -1));
        gradientPanel1.add(jTextFieldAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 164, 168, -1));

        jComboBoxCity.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jComboBoxCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCityActionPerformed(evt);
            }
        });
        gradientPanel1.add(jComboBoxCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 200, -1));

        jComboBoxNeigh.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jComboBoxNeigh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNeighActionPerformed(evt);
            }
        });
        gradientPanel1.add(jComboBoxNeigh, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 200, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(17, 45, 78));
        jLabel8.setText("Neighbourhood: ");
        gradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 123, 24));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(17, 45, 78));
        jLabel9.setText("Username:");
        gradientPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 38, 94, 24));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(17, 45, 78));
        jLabel10.setText("Password: ");
        gradientPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 76, 84, 24));
        gradientPanel1.add(jTextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 38, 167, -1));
        gradientPanel1.add(jTextFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 76, 167, -1));

        randomNumberjLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        randomNumberjLabel.setForeground(new java.awt.Color(17, 45, 78));
        randomNumberjLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gradientPanel1.add(randomNumberjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 100, 30));

        jTextFieldVerify.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextFieldVerify.setText("Enter the text you see.");
        jTextFieldVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVerifyActionPerformed(evt);
            }
        });
        gradientPanel1.add(jTextFieldVerify, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 170, -1));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(17, 45, 78));
        jLabel12.setText("Please verify.");
        gradientPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 100, 20));

        SignupjButton.setBackground(new java.awt.Color(17, 45, 78));
        SignupjButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        SignupjButton.setText("Sign Up");
        SignupjButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SignupjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupjButtonActionPerformed(evt);
            }
        });
        gradientPanel1.add(SignupjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 130, 40));

        SignupjButton2.setBackground(new java.awt.Color(17, 45, 78));
        SignupjButton2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        SignupjButton2.setText("Sign Up");
        SignupjButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SignupjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupjButton2ActionPerformed(evt);
            }
        });
        gradientPanel1.add(SignupjButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 130, 40));

        backjButton.setBackground(new java.awt.Color(17, 45, 78));
        backjButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        backjButton.setText("Back");
        backjButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });
        gradientPanel1.add(backjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 130, 40));

        add(gradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 770, 350));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Please fill in the information completely.");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 65, 223, 14));

        gradientPanel2.setGradientEndd(new java.awt.Color(17, 45, 78));
        gradientPanel2.setGradientStart(new java.awt.Color(17, 45, 78));

        javax.swing.GroupLayout gradientPanel2Layout = new javax.swing.GroupLayout(gradientPanel2);
        gradientPanel2.setLayout(gradientPanel2Layout);
        gradientPanel2Layout.setHorizontalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        gradientPanel2Layout.setVerticalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(gradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 770, 10));

        jPanel1.setBackground(new java.awt.Color(249, 247, 247));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(17, 45, 78));
        jLabel11.setText("Sign Up Form");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 38, -1, 41));

        gradientPanel3.setGradientEndd(new java.awt.Color(219, 226, 239));
        gradientPanel3.setGradientStart(new java.awt.Color(63, 114, 175));
        gradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(17, 45, 78));
        jLabel13.setText("TC No: ");
        gradientPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 38, 81, 24));

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(17, 45, 78));
        jLabel14.setText("Name: ");
        gradientPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 76, 81, 24));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(17, 45, 78));
        jLabel15.setText("Surname: ");
        gradientPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 120, 81, 24));

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(17, 45, 78));
        jLabel16.setText("Age: ");
        gradientPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 164, 81, 24));

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(17, 45, 78));
        jLabel17.setText("City: ");
        gradientPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 81, 24));

        jTextFieldTC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTC1ActionPerformed(evt);
            }
        });
        gradientPanel3.add(jTextFieldTC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 38, 168, -1));
        gradientPanel3.add(jTextFieldName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 76, 168, -1));
        gradientPanel3.add(jTextFieldSurname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 120, 168, -1));
        gradientPanel3.add(jTextFieldAge1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 164, 168, -1));

        jComboBoxCity1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jComboBoxCity1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCity1ActionPerformed(evt);
            }
        });
        gradientPanel3.add(jComboBoxCity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 200, -1));

        jComboBoxNeigh1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        gradientPanel3.add(jComboBoxNeigh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 200, -1));

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(17, 45, 78));
        jLabel18.setText("Neighbourhood: ");
        gradientPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 123, 24));

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(17, 45, 78));
        jLabel19.setText("Username:");
        gradientPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 38, 94, 24));

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(17, 45, 78));
        jLabel20.setText("Password: ");
        gradientPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 76, 84, 24));
        gradientPanel3.add(jTextFieldUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 38, 167, -1));
        gradientPanel3.add(jTextFieldPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 76, 167, -1));

        randomNumberjLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        randomNumberjLabel1.setForeground(new java.awt.Color(17, 45, 78));
        randomNumberjLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gradientPanel3.add(randomNumberjLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 100, 30));

        jTextFieldVerify1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextFieldVerify1.setText("Enter the text you see.");
        jTextFieldVerify1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVerify1ActionPerformed(evt);
            }
        });
        gradientPanel3.add(jTextFieldVerify1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 170, -1));

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(17, 45, 78));
        jLabel21.setText("Please verify.");
        gradientPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 100, 20));

        SignupjButton1.setBackground(new java.awt.Color(17, 45, 78));
        SignupjButton1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        SignupjButton1.setText("Sign Up");
        SignupjButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SignupjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupjButton1ActionPerformed(evt);
            }
        });
        gradientPanel3.add(SignupjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 130, 40));

        jPanel1.add(gradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 770, 350));

        jLabel22.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Please fill in the information completely.");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 65, 223, 14));

        gradientPanel4.setGradientEndd(new java.awt.Color(17, 45, 78));
        gradientPanel4.setGradientStart(new java.awt.Color(17, 45, 78));

        javax.swing.GroupLayout gradientPanel4Layout = new javax.swing.GroupLayout(gradientPanel4);
        gradientPanel4.setLayout(gradientPanel4Layout);
        gradientPanel4Layout.setHorizontalGroup(
            gradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        gradientPanel4Layout.setVerticalGroup(
            gradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(gradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 770, 10));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTCActionPerformed

    private void SignupjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupjButtonActionPerformed

        if (jTextFieldName.getText().isEmpty() || jTextFieldSurname.getText().isEmpty() || jTextFieldPassword.getText().isEmpty() || jTextFieldUsername.getText().isEmpty() || jTextFieldAge.getText().isEmpty() || jTextFieldTC.getText().isEmpty() || jTextFieldVerify.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill the empty areas!", "Warning", JOptionPane.ERROR_MESSAGE);

        }

        if (!randomNumberjLabel.getText().equals(jTextFieldVerify.getText())) {
            JOptionPane.showMessageDialog(this, "Verification Code Not Matches!", "Verification Code Not Matches", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String tc = jTextFieldTC.getText();
        int age;
        try {
            Long.parseLong(tc);
            age = Integer.parseInt(jTextFieldAge.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Wrong Information!", "Warning", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (MSK.checkUsername(jTextFieldUsername.getText())) {
            JOptionPane.showMessageDialog(this, "Username already exist!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String firstname = jTextFieldName.getText();
        String surname = jTextFieldSurname.getText();
        String username = jTextFieldUsername.getText();
        String password = jTextFieldPassword.getText();
        Neighbourhood neigh = (Neighbourhood) jComboBoxNeigh.getSelectedItem();
        int region = neigh.getNeighId();
        User user = new User(username, password, firstname, surname, age, region);

        MSK.addPeople(user);
        JOptionPane.showMessageDialog(this, "The record has been created!", "Successful", JOptionPane.INFORMATION_MESSAGE);
        MainFrame.setPage("loginPanel");

        jTextFieldTC.setText("");
        jTextFieldName.setText("");
        jTextFieldSurname.setText("");
        jTextFieldAge.setText("");
        jTextFieldVerify.setText("");
        jTextFieldUsername.setText("");
        jTextFieldPassword.setText("");
    }//GEN-LAST:event_SignupjButtonActionPerformed

    private void jComboBoxCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCityActionPerformed

        refreshNeigh();
    }//GEN-LAST:event_jComboBoxCityActionPerformed

    private void jTextFieldVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVerifyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVerifyActionPerformed

    private void jTextFieldTC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTC1ActionPerformed

    private void jComboBoxCity1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCity1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCity1ActionPerformed

    private void jTextFieldVerify1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVerify1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVerify1ActionPerformed

    private void SignupjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupjButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignupjButton1ActionPerformed

    private void jComboBoxNeighActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNeighActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxNeighActionPerformed

    private void SignupjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupjButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignupjButton2ActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        jTextFieldTC.setText("");
        jTextFieldName.setText("");
        jTextFieldSurname.setText("");
        jTextFieldAge.setText("");
        jTextFieldVerify.setText("");
        jTextFieldPassword.setText("");

        MainFrame.setPage("loginPanel");
        randomNumber();
    }//GEN-LAST:event_backjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignupjButton;
    private javax.swing.JButton SignupjButton1;
    private javax.swing.JButton SignupjButton2;
    private javax.swing.JButton backjButton;
    private com.mery.votingsystem.GradientPanel gradientPanel1;
    private com.mery.votingsystem.GradientPanel gradientPanel2;
    private com.mery.votingsystem.GradientPanel gradientPanel3;
    private com.mery.votingsystem.GradientPanel gradientPanel4;
    private javax.swing.JComboBox<Object> jComboBoxCity;
    private javax.swing.JComboBox<Object> jComboBoxCity1;
    private javax.swing.JComboBox<Object> jComboBoxNeigh;
    private javax.swing.JComboBox<Object> jComboBoxNeigh1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldAge1;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldName1;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldPassword1;
    private javax.swing.JTextField jTextFieldSurname;
    private javax.swing.JTextField jTextFieldSurname1;
    private javax.swing.JTextField jTextFieldTC;
    private javax.swing.JTextField jTextFieldTC1;
    private javax.swing.JTextField jTextFieldUsername;
    private javax.swing.JTextField jTextFieldUsername1;
    private javax.swing.JTextField jTextFieldVerify;
    private javax.swing.JTextField jTextFieldVerify1;
    private javax.swing.JLabel randomNumberjLabel;
    private javax.swing.JLabel randomNumberjLabel1;
    // End of variables declaration//GEN-END:variables
}
