/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mery.votingsystem;

/**
 *
 * @author merye
 */
public class VotingMukhtarFrame extends javax.swing.JFrame {

    /**
     * Creates new form VotingMukhtarFrame
     */
    public VotingMukhtarFrame() {
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

        jLabel7 = new javax.swing.JLabel();
        gradientPanel1 = new com.mery.votingsystem.GradientPanel();
        candidateJComboBox1 = new javax.swing.JComboBox<>();
        candidateJComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        gradientPanel2 = new com.mery.votingsystem.GradientPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("*Please select the election you want to vote for.");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(249, 247, 247));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gradientPanel1.setGradientEndd(new java.awt.Color(249, 247, 247));
        gradientPanel1.setGradientStart(new java.awt.Color(249, 247, 247));
        gradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        candidateJComboBox1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        gradientPanel1.add(candidateJComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 240, -1));

        candidateJComboBox2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        gradientPanel1.add(candidateJComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 240, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 45, 78));
        jLabel1.setText("Neighbourhood:");
        gradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 160, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 32)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(17, 45, 78));
        jLabel10.setText("Mukhtar Vote");
        gradientPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 250, -1));

        jButton4.setBackground(new java.awt.Color(17, 45, 78));
        jButton4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton4.setText("List Candidates");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gradientPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 160, 40));

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

        jButton3.setBackground(new java.awt.Color(17, 45, 78));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton3.setText("Vote");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gradientPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 100, 40));

        jList2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(jList2);

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

        jButton5.setBackground(new java.awt.Color(17, 45, 78));
        jButton5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton5.setText("CV");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gradientPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 100, 40));

        gradientPanel1.add(gradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 770, 370));

        getContentPane().add(gradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -8, 770, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VotingMukhtarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VotingMukhtarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VotingMukhtarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VotingMukhtarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VotingMukhtarFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> candidateJComboBox1;
    private javax.swing.JComboBox<String> candidateJComboBox2;
    private com.mery.votingsystem.GradientPanel gradientPanel1;
    private com.mery.votingsystem.GradientPanel gradientPanel2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
