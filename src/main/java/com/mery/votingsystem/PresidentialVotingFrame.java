/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mery.votingsystem;

import com.mery.votingsystem.jpa.*;
import java.awt.Image;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author merye
 */
public class PresidentialVotingFrame extends javax.swing.JFrame {

    /**
     * Creates new form PresidentialVotingFrame
     */
    DefaultListModel<Object> candidateListModel = new DefaultListModel<>();

    public PresidentialVotingFrame() {
        initComponents();
        candidatesjList.setModel(candidateListModel);
        listCandidates();
        ImageIcon icon2 = new ImageIcon("C:\\Users\\merye\\Downloads\\REPUBLIC OF TÜRKİYE.png");
        Image img2 = icon2.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        icon2.setImage(img2);
        jLabel1.setIcon(icon2);
    }

    public void listCandidates() {
        candidateListModel.removeAllElements();

        Elections election = MSK.getElections("Presidential");
        ArrayList<Candidate> candidates = new ArrayList<>();
        election.getElectionCandidatesList().forEach((electionCandidates) -> {
            candidates.add(electionCandidates.getCandidateId());
        });

        for (Candidate candidate : candidates) {
            candidateListModel.addElement(candidate);
        }
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
        jLabel10 = new javax.swing.JLabel();
        gradientPanel2 = new com.mery.votingsystem.GradientPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        candidatesjList = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        votejButton = new javax.swing.JButton();
        backjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gradientPanel1.setGradientEndd(new java.awt.Color(249, 247, 247));
        gradientPanel1.setGradientStart(new java.awt.Color(249, 247, 247));
        gradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 32)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(17, 45, 78));
        jLabel10.setText("Presidential Vote");
        gradientPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 300, -1));

        gradientPanel2.setGradientEndd(new java.awt.Color(214, 230, 242));
        gradientPanel2.setGradientStart(new java.awt.Color(118, 159, 205));
        gradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(17, 45, 78));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton3.setText("CV");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gradientPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 100, 40));

        candidatesjList.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(candidatesjList);

        gradientPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 310, 250));

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("*Please select the candidate you want to vote for.");
        gradientPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 270, 20));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(17, 45, 78));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Candidates");
        gradientPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 310, -1));

        jLabel1.setText("jLabel1");
        gradientPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 200, 200));

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

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_backjButtonActionPerformed

    private void votejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_votejButtonActionPerformed
//    oy verirken candidates seçmediyse (null) hata ver!

        User user = (User) MainFrame.person;
        if (candidatesjList.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Please select the candidate you will vote for!", "Missing Information", JOptionPane.ERROR_MESSAGE);
            return;
        }

//    birden fazla oy vermeyi kapat!
        if (!MSK.isVotedPresidential(user)) {
            JOptionPane.showMessageDialog(this, "You cannot vote a second time!", "Attention", JOptionPane.ERROR_MESSAGE);
            return;
        }
//    yaş sınırını kontrol et (18den küçükse velet kaybol de)!
        if (user.getAge() < 18) {
            JOptionPane.showMessageDialog(this, "You cannot vote!", "Attention", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Vote vote = new Vote();
        vote.setCandidateId((Candidate) candidatesjList.getSelectedValue());
        vote.setUserId(user);
        MSK.addVote(vote, "Presidential");
        JOptionPane.showMessageDialog(this, "Your voting process was successful. You can not vote again!", "Successful", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_votejButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CVFrame cvFrame = new CVFrame(((Candidate) candidatesjList.getSelectedValue()), "Presidential Election");
        cvFrame.dispatchEvent(new WindowEvent(cvFrame, WindowEvent.WINDOW_ACTIVATED));
        cvFrame.show();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PresidentialVotingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PresidentialVotingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PresidentialVotingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PresidentialVotingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PresidentialVotingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JList<Object> candidatesjList;
    private com.mery.votingsystem.GradientPanel gradientPanel1;
    private com.mery.votingsystem.GradientPanel gradientPanel2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton votejButton;
    // End of variables declaration//GEN-END:variables
}
