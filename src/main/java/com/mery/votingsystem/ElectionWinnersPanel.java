/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mery.votingsystem;

import com.mery.votingsystem.coreclasses.PresidentialElection;
import com.mery.votingsystem.coreclasses.Election;
import com.mery.votingsystem.coreclasses.MunicipalElection;
import com.mery.votingsystem.coreclasses.Candidate;
import com.mery.votingsystem.coreclasses.MukhtarElection;
import com.mery.votingsystem.coreclasses.MSK;
import com.mery.votingsystem.coreclasses.City;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author merye
 */
public class ElectionWinnersPanel extends javax.swing.JPanel implements IPanel {

    /**
     * Creates new form ElectionWinnersPanel
     */
    DefaultTableModel tableModel = new DefaultTableModel();
    String[] tableColumnNames = {"Type", "City", "Neighbourhood", "Candidate", "Status", "Vote Count"};

    public ElectionWinnersPanel() {
        initComponents();
        refreshCity();
        refreshNeigh();
        refreshTable();
        tableModel.setColumnIdentifiers(tableColumnNames);
        jTable.setModel(tableModel);
        ImageIcon icon2 = new ImageIcon("C:\\Users\\merye\\Downloads\\REPUBLIC OF TÜRKİYE.png");
        Image img2 = icon2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        icon2.setImage(img2);
        jLabel1.setIcon(icon2);
    }

    public void refreshCity() {
        jComboBoxCity.removeAllItems();
        jComboBoxCity.addItem("All");
        for (City city : MSK.cities) {
            jComboBoxCity.addItem(city);
        }
        jComboBoxCity.setSelectedIndex(0);
    }

    public void refreshNeigh() {
        jComboBoxNeigh.removeAllItems();
        if (jComboBoxCity.getSelectedItem().equals("All")) {
            jComboBoxNeigh.addItem("All");
            return;
        }
        City selectedCity = (City) jComboBoxCity.getSelectedItem();
        jComboBoxNeigh.addItem("All");
        for (String neigh : selectedCity.neighbourhoods) {
            jComboBoxNeigh.addItem(neigh);
        }
        jComboBoxNeigh.setSelectedIndex(0);
    }

    public void refreshTable() {
        tableModel.setRowCount(0);
        for (Election election : MSK.elections) {
            for (Candidate candidate : election.candidates) {
                Vector vector = new Vector();

                if (election instanceof MukhtarElection) {
                    vector.add("Mukhtar");
                } else if (election instanceof MunicipalElection) {
                    vector.add("Municipal");
                } else if (election instanceof PresidentialElection) {
                    vector.add("Presidential");
                }
                vector.add(candidate.city);
                vector.add(candidate.neighbourhood);
                vector.add(candidate.getFirstName() + " " + candidate.getSurname());

                if (candidate.status()) {
                    vector.add("Winner");
                } else {
                    vector.add("Loser");
                }
                vector.add(election.voteCalculator(candidate));
                tableModel.addRow(vector);
            }
        }
    }

    public void enRefreshTable() {
        tableModel.setRowCount(0);
        for (Candidate candidate : whichCandidate()) {
            Election election = null;
            for (Election elections : MSK.elections) {
                if (elections.candidates.contains(candidate)) {
                    election = elections;
                }
            }
            Vector vector = new Vector();
            if (election instanceof MukhtarElection) {
                vector.add("Mukhtar");
            } else if (election instanceof MunicipalElection) {
                vector.add("Municipal");
            } else if (election instanceof PresidentialElection) {
                vector.add("Presidential");
            }
            vector.add(candidate.city);
            vector.add(candidate.neighbourhood);
            vector.add(candidate.getFirstName() + " " + candidate.getSurname());

            if (candidate.status()) {
                vector.add("Winner");
            } else {
                vector.add("Loser");
            }
            vector.add(election.voteCalculator(candidate));
            tableModel.addRow(vector);
        }
    }

    public ArrayList<Candidate> winnerOrLoser() {
        ArrayList<Candidate> result = new ArrayList<>();
        if (((winnerjRadioButton.isSelected() && losersjRadioButton.isSelected())) || (!winnerjRadioButton.isSelected() && !losersjRadioButton.isSelected())) {
            for (Election election : MSK.elections) {
                result.addAll(election.candidates);
            }
        } else if (winnerjRadioButton.isSelected() && !losersjRadioButton.isSelected()) {
            for (Election election : MSK.elections) {
                for (Candidate candidate : election.candidates) {
                    if (candidate.status()) {
                        result.add(candidate);
                    }
                }
            }
        } else if (!winnerjRadioButton.isSelected() && losersjRadioButton.isSelected()) {
            for (Election election : MSK.elections) {
                for (Candidate candidate : election.candidates) {
                    if (!candidate.status()) {
                        result.add(candidate);
                    }
                }
            }
        }
        return result;
    }

    public ArrayList<Candidate> whichCity() {
        ArrayList<Candidate> oldResult = winnerOrLoser();
        ArrayList<Candidate> result = new ArrayList<>();

        if (jComboBoxCity.getSelectedItem().equals("All")) {
            return oldResult;
        }
        for (Candidate candidate : oldResult) {
            if (!(candidate == null) && candidate.city.equals(jComboBoxCity.getSelectedItem())) {
                result.add(candidate);
            }
        }
        return result;
    }

    public ArrayList<Candidate> whichNeigh() {
        ArrayList<Candidate> oldResult = whichCity();
        ArrayList<Candidate> result = new ArrayList<>();

        if (jComboBoxNeigh.getSelectedItem().equals("All")) {
            return oldResult;
        }
        for (Candidate candidate : oldResult) {
            if (candidate.neighbourhood.equals(jComboBoxNeigh.getSelectedItem())) {
                result.add(candidate);
            }
        }
        return result;
    }

    public ArrayList<Candidate> whichElection() {
        ArrayList<Candidate> oldResult = whichNeigh();
        ArrayList<Candidate> result = new ArrayList<>();

        if (electionTypeJComboBox.getSelectedItem().equals("All")) {
            return oldResult;
        }
        for (Candidate candidate : oldResult) {
            for (Election election : MSK.elections) {
                if ((election instanceof MukhtarElection) && (electionTypeJComboBox.getSelectedItem().equals("Mukhtar Election")) && election.candidates.contains(candidate)) {
                    result.add(candidate);
                } else if ((election instanceof MunicipalElection) && (electionTypeJComboBox.getSelectedItem().equals("Municipal Election")) && election.candidates.contains(candidate)) {
                    result.add(candidate);
                } else if ((election instanceof PresidentialElection) && electionTypeJComboBox.getSelectedItem().equals("Presidential Election") && election.candidates.contains(candidate)) {
                    result.add(candidate);
                }
            }
        }
        return result;
    }

    public ArrayList<Candidate> whichCandidate() {
        ArrayList<Candidate> oldResult = whichElection();
        ArrayList<Candidate> result = new ArrayList<>();

        if (candidatejTextField.getText().equals("")) {
            return oldResult;
        } else {
            Pattern pattern = Pattern.compile(candidatejTextField.getText());
            for (Candidate candidate : oldResult) {
                Matcher matcher = pattern.matcher(candidate.toString());
                if (matcher.find()) {
                    result.add(candidate);
                }
            }
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
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        searchjButton = new javax.swing.JButton();
        gradientPanel2 = new com.mery.votingsystem.GradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        electionTypeJComboBox = new javax.swing.JComboBox<>();
        jComboBoxCity = new javax.swing.JComboBox<>();
        candidatejTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        backjButton = new javax.swing.JButton();
        jComboBoxNeigh = new javax.swing.JComboBox<>();
        losersjRadioButton = new javax.swing.JRadioButton();
        winnerjRadioButton = new javax.swing.JRadioButton();

        gradientPanel1.setGradientEndd(new java.awt.Color(214, 230, 242));
        gradientPanel1.setGradientStart(new java.awt.Color(118, 159, 205));
        gradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(17, 45, 78));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Election Results");
        gradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 290, 40));

        jLabel1.setText("jLabel1");
        gradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 100));

        searchjButton.setBackground(new java.awt.Color(17, 45, 78));
        searchjButton.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        searchjButton.setText("Search");
        searchjButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchjButtonActionPerformed(evt);
            }
        });
        gradientPanel1.add(searchjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 80, 30));

        gradientPanel2.setGradientEndd(new java.awt.Color(17, 45, 78));
        gradientPanel2.setGradientStart(new java.awt.Color(17, 45, 78));

        javax.swing.GroupLayout gradientPanel2Layout = new javax.swing.GroupLayout(gradientPanel2);
        gradientPanel2.setLayout(gradientPanel2Layout);
        gradientPanel2Layout.setHorizontalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        gradientPanel2Layout.setVerticalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gradientPanel1.add(gradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 640, 5));

        jTable.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable);

        gradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 730, 240));

        electionTypeJComboBox.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        electionTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Mukhtar Election", "Municipal Election", "Presidential Election" }));
        gradientPanel1.add(electionTypeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 200, -1));

        jComboBoxCity.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jComboBoxCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCityActionPerformed(evt);
            }
        });
        gradientPanel1.add(jComboBoxCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 200, -1));
        gradientPanel1.add(candidatejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 190, 30));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(17, 45, 78));
        jLabel13.setText("Election Type:");
        gradientPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 130, -1));

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(17, 45, 78));
        jLabel14.setText("Candidate:");
        gradientPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 100, -1));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(17, 45, 78));
        jLabel15.setText("City:");
        gradientPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 130, -1));

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(17, 45, 78));
        jLabel16.setText("Neighbourhood:");
        gradientPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 130, -1));

        backjButton.setBackground(new java.awt.Color(17, 45, 78));
        backjButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        backjButton.setText("Back");
        backjButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });
        gradientPanel1.add(backjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 80, 30));

        jComboBoxNeigh.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jComboBoxNeigh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNeighActionPerformed(evt);
            }
        });
        gradientPanel1.add(jComboBoxNeigh, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 200, -1));

        losersjRadioButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        losersjRadioButton.setForeground(new java.awt.Color(17, 45, 78));
        losersjRadioButton.setText("Losers");
        gradientPanel1.add(losersjRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        winnerjRadioButton.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        winnerjRadioButton.setForeground(new java.awt.Color(17, 45, 78));
        winnerjRadioButton.setText("Winners");
        gradientPanel1.add(winnerjRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(gradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchjButtonActionPerformed
        enRefreshTable();

    }//GEN-LAST:event_searchjButtonActionPerformed


    private void jComboBoxNeighActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNeighActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxNeighActionPerformed

    private void jComboBoxCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCityActionPerformed
        refreshNeigh();
    }//GEN-LAST:event_jComboBoxCityActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        MainFrame.setPage("userPanel");
    }//GEN-LAST:event_backjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JTextField candidatejTextField;
    private javax.swing.JComboBox<String> electionTypeJComboBox;
    private com.mery.votingsystem.GradientPanel gradientPanel1;
    private com.mery.votingsystem.GradientPanel gradientPanel2;
    private javax.swing.JComboBox<Object> jComboBoxCity;
    private javax.swing.JComboBox<String> jComboBoxNeigh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JRadioButton losersjRadioButton;
    private javax.swing.JButton searchjButton;
    private javax.swing.JRadioButton winnerjRadioButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onPageSet() {
        for (Election election : MSK.elections) {
            election.findWinner();
        }
        refreshTable();
    }
}
