/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mery.votingsystem;
import com.mery.votingsystem.jpa.*;
import java.awt.event.WindowEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author merye
 */
public class MukhtarVotingFrame extends javax.swing.JFrame {

    DefaultListModel<Object> candidateListModel = new DefaultListModel<>();

    public MukhtarVotingFrame() {
        initComponents();
        refreshCity();
        refreshNeigh();
        candidatesjList.setModel(candidateListModel);
    }

    public void refreshCity() {
         for (String city : com.mery.votingsystem.jpa.MSK.getCities()) {
            jComboBoxCity.addItem(city);
        }
        jComboBoxCity.setSelectedIndex(0);
    }

    public void refreshNeigh() {
        jComboBoxNeigh.removeAllItems();
        String selectedCity = (String) jComboBoxCity.getSelectedItem();
        for (Neighbourhood neigh : com.mery.votingsystem.jpa.MSK.getNeigh(selectedCity)) {
            jComboBoxNeigh.addItem(neigh);
        }
        jComboBoxNeigh.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradientPanel1 = new com.mery.votingsystem.GradientPanel();
        jComboBoxCity = new javax.swing.JComboBox<>();
        jComboBoxNeigh = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        listCandidatesjButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        gradientPanel2 = new com.mery.votingsystem.GradientPanel();
        votejButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CVjButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        candidatesjList = new javax.swing.JList<>();
        backjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(249, 247, 247));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gradientPanel1.setGradientEndd(new java.awt.Color(249, 247, 247));
        gradientPanel1.setGradientStart(new java.awt.Color(249, 247, 247));
        gradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxCity.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jComboBoxCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCityActionPerformed(evt);
            }
        });
        gradientPanel1.add(jComboBoxCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 240, -1));

        jComboBoxNeigh.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        gradientPanel1.add(jComboBoxNeigh, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 240, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 45, 78));
        jLabel1.setText("Neighbourhood:");
        gradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 160, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 32)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(17, 45, 78));
        jLabel10.setText("Mukhtar Vote");
        gradientPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 250, -1));

        listCandidatesjButton.setBackground(new java.awt.Color(17, 45, 78));
        listCandidatesjButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        listCandidatesjButton.setText("List Candidates");
        listCandidatesjButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        listCandidatesjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listCandidatesjButtonActionPerformed(evt);
            }
        });
        gradientPanel1.add(listCandidatesjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 160, 40));

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(17, 45, 78));
        jLabel12.setText("*Please fill in the information completely.");
        gradientPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 220, -1));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(17, 45, 78));
        jLabel13.setText("City:");
        gradientPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 130, -1));

        gradientPanel2.setGradientEndd(new java.awt.Color(214, 230, 242));
        gradientPanel2.setGradientStart(new java.awt.Color(118, 159, 205));
        gradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        votejButton.setBackground(new java.awt.Color(17, 45, 78));
        votejButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        votejButton.setText("Vote");
        votejButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        votejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                votejButtonActionPerformed(evt);
            }
        });
        gradientPanel2.add(votejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 100, 40));

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("*Please select the candidate you want to vote for.");
        gradientPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 270, 20));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(17, 45, 78));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Candidates");
        gradientPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 310, -1));

        CVjButton.setBackground(new java.awt.Color(17, 45, 78));
        CVjButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        CVjButton.setText("CV");
        CVjButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CVjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CVjButtonActionPerformed(evt);
            }
        });
        gradientPanel2.add(CVjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 100, 40));

        candidatesjList.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(candidatesjList);

        gradientPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 310, 210));

        gradientPanel1.add(gradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 770, 370));

        backjButton.setBackground(new java.awt.Color(17, 45, 78));
        backjButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        backjButton.setText("Back");
        backjButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });
        gradientPanel1.add(backjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 80, 30));

        getContentPane().add(gradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -8, 770, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCityActionPerformed
        refreshNeigh();
    }//GEN-LAST:event_jComboBoxCityActionPerformed

    private void listCandidatesjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listCandidatesjButtonActionPerformed
        candidateListModel.removeAllElements();
    
    }//GEN-LAST:event_listCandidatesjButtonActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_backjButtonActionPerformed

    private void votejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_votejButtonActionPerformed

//    oy verirken candidates seçmediyse (null) hata ver!
        if (candidatesjList.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Please select the candidate you will vote for!", "Missing Information", JOptionPane.ERROR_MESSAGE);
            return;
        }
//    oy verirken candidatesinin içindeki şehir ve mahalle userın bilgileriyle eşleşmiyorsa hata ver!
        if (!((User) MainFrame.person).city.equals(jComboBoxCity.getSelectedItem()) || !((User) MainFrame.person).neighbourhood.equals(jComboBoxNeigh.getSelectedItem())) {
            JOptionPane.showMessageDialog(this, "You can only participate in the elections of the neighborhood you have registered in the system.!", "Attention", JOptionPane.ERROR_MESSAGE);
            return;
        }
//    birden fazla oy vermeyi kapat!
        for (Election election : MSK.elections) {
            if (election instanceof MukhtarElection) {
                for (Vote vote : ((MukhtarElection) election).votes) {
                    if (vote.user.equals(MainFrame.person)) {
                     JOptionPane.showMessageDialog(this, "You cannot vote a second time!", "Attention", JOptionPane.ERROR_MESSAGE);   
                    return;
                    }
                }
            }
        }
//    yaş sınırını kontrol et (18den küçükse velet kaybol de)!
    if(((User) MainFrame.person).age<18){
        JOptionPane.showMessageDialog(this, "You cannot vote!", "Attention", JOptionPane.WARNING_MESSAGE);
        return;
    }

//    oy oluştur!
//    oyun candidatesini ve userını ayarla.
//    oyu electiona ver!    
        Vote vote = new Vote();
        vote.candidate = (Candidate) candidatesjList.getSelectedValue();
        vote.user = (User) MainFrame.person;
        for (Election election : MSK.elections) {
            if (election instanceof MukhtarElection) {
                ((MukhtarElection) election).votes.add(vote);
            }
        }
JOptionPane.showMessageDialog(this, "Your voting process was successful. You can not vote again!", "Successful", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_votejButtonActionPerformed

    private void CVjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CVjButtonActionPerformed

        CVFrame cvFrame = new CVFrame(((Candidate)candidatesjList.getSelectedValue()), "Mukhtar Election");
        cvFrame.dispatchEvent(new WindowEvent(cvFrame,WindowEvent.WINDOW_ACTIVATED));
        cvFrame.show();
    }//GEN-LAST:event_CVjButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MukhtarVotingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CVjButton;
    private javax.swing.JButton backjButton;
    private javax.swing.JList<Object> candidatesjList;
    private com.mery.votingsystem.GradientPanel gradientPanel1;
    private com.mery.votingsystem.GradientPanel gradientPanel2;
    private javax.swing.JComboBox<Object> jComboBoxCity;
    private javax.swing.JComboBox<Object> jComboBoxNeigh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton listCandidatesjButton;
    private javax.swing.JButton votejButton;
    // End of variables declaration//GEN-END:variables
}
