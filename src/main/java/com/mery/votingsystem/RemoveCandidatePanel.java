/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mery.votingsystem;

import com.mery.votingsystem.jpa.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author merye
 */
public class RemoveCandidatePanel extends javax.swing.JPanel {

    /**
     * Creates new form RemoveCandidatePanel
     */
    DefaultListModel<Object> CandidateListModel = new DefaultListModel<>();

    public RemoveCandidatePanel() {
        initComponents();
        refreshCandidate();

    }

    public void refreshCandidate() {
        candidateJComboBox.removeAllItems();
        for (Candidate candidate : MSK.getCandidates()) {
            candidateJComboBox.addItem(candidate);
        }
    }

    public void getCandidateInfo(Candidate candidate) {

        Neighbourhood neighbourhood = MSK.getNeighbyId(candidate.getRegion());
        String string = "Name Surname: " + candidate.getFirstName() + " " + candidate.getSurname() + "\n Age: " + candidate.getAge() + " " + "\n City: " + neighbourhood.getCity()
                + "\n Neighbourhood: " + neighbourhood.getNeigh();

//        infojLabel.setText("Name Surname: " + candidate.getFirstName() + " " + candidate.getSurname());
//        infojLabel.setText(infojLabel.getText() + "\n Age: " + candidate.getAge() + " ");
//        infojLabel.setText(infojLabel.getText() + "\n City: " + neighbourhood.getCity());
//        infojLabel.setText(infojLabel.getText() + "\n Neighbourhood: " + neighbourhood.getNeigh());
        for (int i = 0; i < 3; i++) {
            for (ElectionCandidates electionCandidates : MSK.getElections().get(i).getElectionCandidatesList()) {
                if (electionCandidates.getCandidateId().equals(candidate)) {
                    infojLabel.setText(string + "\n Election: " + electionCandidates.getElectionId() + "\n Votes Count: " + MSK.getVotesCount(electionCandidates));

                    //infojLabel.setText(+"\n Votes Count: " + MSK.getVotesCount(electionCandidates));
                }
            }
        }
    }

    public ArrayList<Candidate> listCandidates(String electionName) {
        ArrayList<Candidate> result = new ArrayList<>();

        if (electionName.equals("All")) {
            for (Candidate candidate : MSK.getCandidates()) {
                result.add(candidate);
            }
            return result;
        }
        Elections election = MSK.getElections(electionName);
        if (election != null) {
            for (ElectionCandidates electionCandidates : election.getElectionCandidatesList()) {
                result.add(electionCandidates.getCandidateId());
            }
        } else {
            JOptionPane.showMessageDialog(this, "This election does not have any candidates!", "Attention", JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradientPanel1 = new com.mery.votingsystem.GradientPanel();
        backjButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        gradientPanel2 = new com.mery.votingsystem.GradientPanel();
        searchjButton = new javax.swing.JButton();
        candidateJComboBox = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        electionJComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        candidatesjList = new javax.swing.JList<>();
        infojLabel = new javax.swing.JLabel();
        infojButton = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        removejButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gradientPanel1.setGradientEndd(new java.awt.Color(214, 230, 242));
        gradientPanel1.setGradientStart(new java.awt.Color(118, 159, 205));
        gradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backjButton.setBackground(new java.awt.Color(17, 45, 78));
        backjButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        backjButton.setText("Back");
        backjButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });
        gradientPanel1.add(backjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 80, 30));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(17, 45, 78));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Remove Candidate");
        gradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, 60));

        gradientPanel2.setGradientEndd(new java.awt.Color(17, 45, 78));
        gradientPanel2.setGradientStart(new java.awt.Color(17, 45, 78));

        javax.swing.GroupLayout gradientPanel2Layout = new javax.swing.GroupLayout(gradientPanel2);
        gradientPanel2.setLayout(gradientPanel2Layout);
        gradientPanel2Layout.setHorizontalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 765, Short.MAX_VALUE)
        );
        gradientPanel2Layout.setVerticalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        gradientPanel1.add(gradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 765, 5));

        searchjButton.setBackground(new java.awt.Color(17, 45, 78));
        searchjButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        searchjButton.setText("Search");
        searchjButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchjButtonActionPerformed(evt);
            }
        });
        gradientPanel1.add(searchjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 130, 40));

        candidateJComboBox.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        candidateJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                candidateJComboBoxActionPerformed(evt);
            }
        });
        gradientPanel1.add(candidateJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 260, 30));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(17, 45, 78));
        jLabel13.setText("Election:");
        gradientPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 130, -1));

        electionJComboBox.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        electionJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Municipial", "Mukhtar", "Presidential", "All" }));
        electionJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                electionJComboBoxActionPerformed(evt);
            }
        });
        gradientPanel1.add(electionJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 260, 30));

        candidatesjList.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(candidatesjList);

        gradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 300, 190));

        infojLabel.setFont(new java.awt.Font("SansSerif", 2, 15)); // NOI18N
        infojLabel.setForeground(new java.awt.Color(17, 45, 78));
        infojLabel.setText("...");
        infojLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        infojLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gradientPanel1.add(infojLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 320, 110));

        infojButton.setBackground(new java.awt.Color(17, 45, 78));
        infojButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        infojButton.setText("CV");
        infojButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        infojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infojButtonActionPerformed(evt);
            }
        });
        gradientPanel1.add(infojButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 130, 40));

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(17, 45, 78));
        jLabel16.setText("Candidate:");
        gradientPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 110, 30));

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(17, 45, 78));
        jLabel18.setText("Candidate Information:");
        gradientPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 220, 30));

        removejButton2.setBackground(new java.awt.Color(17, 45, 78));
        removejButton2.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        removejButton2.setText("Remove ");
        removejButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        removejButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removejButton2ActionPerformed(evt);
            }
        });
        gradientPanel1.add(removejButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 130, 40));

        add(gradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 450));
    }// </editor-fold>//GEN-END:initComponents

    private void searchjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchjButtonActionPerformed
        String electionName = (String) electionJComboBox.getSelectedItem();
        CandidateListModel.removeAllElements();
        for (Candidate listCandidate : listCandidates(electionName)) {
            CandidateListModel.addElement(listCandidate);
        }
        candidatesjList.setModel(CandidateListModel);

    }//GEN-LAST:event_searchjButtonActionPerformed

    private void candidateJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_candidateJComboBoxActionPerformed

    }//GEN-LAST:event_candidateJComboBoxActionPerformed

    private void electionJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_electionJComboBoxActionPerformed

    }//GEN-LAST:event_electionJComboBoxActionPerformed

    private void infojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infojButtonActionPerformed
        Candidate candidate = (Candidate) candidateJComboBox.getSelectedItem();
        getCandidateInfo(candidate);
    }//GEN-LAST:event_infojButtonActionPerformed

    private void removejButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removejButton2ActionPerformed
        Candidate candidate = (Candidate) candidateJComboBox.getSelectedItem();
        MSK.removeCandidates(candidate);
        refreshCandidate();

    }//GEN-LAST:event_removejButton2ActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        MainFrame.setPage("adminPanel");
    }//GEN-LAST:event_backjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JComboBox<Object> candidateJComboBox;
    private javax.swing.JList<Object> candidatesjList;
    private javax.swing.JComboBox<String> electionJComboBox;
    private com.mery.votingsystem.GradientPanel gradientPanel1;
    private com.mery.votingsystem.GradientPanel gradientPanel2;
    private javax.swing.JButton infojButton;
    private javax.swing.JLabel infojLabel;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removejButton2;
    private javax.swing.JButton searchjButton;
    // End of variables declaration//GEN-END:variables
}