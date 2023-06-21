/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mery.votingsystem;

import com.mery.votingsystem.jpa.*;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MainFrame extends javax.swing.JFrame {

    static People person;
    LoginPanel loginPanel;
    AdminHomePanel adminPanel;
    UserHomePanel userPanel;
    SignUpPanel signUpPanel;
    CreateUserPanel createUserPanel;
    CreateCandidatePanel createCandidatePanel;
    CreateElectionPanel createElectionPanel;
    ElectionWinnersPanel electionWinnersPanel;
    RemoveCandidatePanel removeCandidatePanel;
    static CardLayout cardLayout;
    static JPanel panelCont;
    private static boolean mukhtarElectionStarted;
    private static boolean municipalElectionStarted;
    private static boolean presidentialElectionStarted;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();

        cardLayout = new CardLayout();
        panelCont = new JPanel(cardLayout);
        panelCont.setSize(765, 448);
        this.setSize(765, 448);
        getContentPane().add(panelCont);

        //this.setResizable(false);
        loginPanel = new LoginPanel();
        loginPanel.setName("loginPanel");
        adminPanel = new AdminHomePanel();
        adminPanel.setName("adminPanel");
        userPanel = new UserHomePanel();
        userPanel.setName("userPanel");
        signUpPanel = new SignUpPanel();
        signUpPanel.setName("signUpPanel");
        createUserPanel = new CreateUserPanel();
        createUserPanel.setName("createUserPanel");
        createCandidatePanel = new CreateCandidatePanel();
        createCandidatePanel.setName("createCandidatePanel");
        createElectionPanel = new CreateElectionPanel();
        createElectionPanel.setName("createElectionPanel");
        electionWinnersPanel = new ElectionWinnersPanel();
        electionWinnersPanel.setName("electionWinnersPanel");
        removeCandidatePanel= new RemoveCandidatePanel();
        removeCandidatePanel.setName("removeCandidatePanel");
        panelCont.add(loginPanel, "loginPanel");
        panelCont.add(adminPanel, "adminPanel");
        panelCont.add(userPanel, "userPanel");
        panelCont.add(signUpPanel, "signUpPanel");
        panelCont.add(createUserPanel, "createUserPanel");
        panelCont.add(createCandidatePanel, "createCandidatePanel");
        panelCont.add(createElectionPanel, "createElectionPanel");
        panelCont.add(electionWinnersPanel, "electionWinnersPanel");
        panelCont.add(removeCandidatePanel,"removeCandidatePanel");
        cardLayout.show(panelCont, "loginPanel");
        
        ImageIcon icon2 = new ImageIcon("C:\\Users\\merye\\Downloads\\REPUBLIC OF TÜRKİYE.png");
        this.setIconImage(icon2.getImage());
    }

    public static void setPage(String panelName) {

        cardLayout.show(panelCont, panelName);
        for (Component component : panelCont.getComponents()) {
            if (component.getName().equals(panelName) && component instanceof IPanel) {
                IPanel iPanel = (IPanel) component;
                iPanel.onPageSet();
            }
        }
    }

    public static boolean isMukhtarElectionStarted() {
        return mukhtarElectionStarted;
    }

    public static void setMukhtarElectionStarted(boolean mukhtarElectionStarted) {
        MainFrame.mukhtarElectionStarted = mukhtarElectionStarted;
    }

    public static boolean isMunicipalElectionStarted() {
        return municipalElectionStarted;
    }

    public static void setMunicipalElectionStarted(boolean municipalElectionStarted) {
        MainFrame.municipalElectionStarted = municipalElectionStarted;
    }

    public static boolean isPresidentialElectionStarted() {
        return presidentialElectionStarted;
    }

    public static void setPresidentialElectionStarted(boolean presidentialElectionStarted) {
        MainFrame.presidentialElectionStarted = presidentialElectionStarted;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MSK.InitEntitiyManagers();
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
