/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qui;

import java.awt.Color;
import java.awt.Component;
import javax.swing.Action;
import javax.swing.JButton;
import qui.setting.ActionSetting;
import qui.setting.ButtonSetting;
import qui.setting.IRegulator;

/**
 *
 * @author hamza
 */
public class AccountScreen extends javax.swing.JFrame implements IRegulator{

    /**
     * Creates new form AccountScreen
     */
    public AccountScreen() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
       this.setLocationRelativeTo(null);
       this.setFocusable(true);
    }
    /*
    button color
    */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accountScreenPanel = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        userNameSurnameLabel = new javax.swing.JLabel();
        drawCashButton = new javax.swing.JButton();
        balanceLabel = new javax.swing.JLabel();
        userBalanceLabel = new javax.swing.JLabel();
        cashDepositButton = new javax.swing.JButton();
        moneyOrderButton = new javax.swing.JButton();
        paymentsButton = new javax.swing.JButton();
        settingButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JAVA BANK ACCOUNT SCREEN");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accountScreenPanel.setBackground(new java.awt.Color(153, 255, 102));
        accountScreenPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomeLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(51, 0, 153));
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("WELCOME");
        accountScreenPanel.add(welcomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 66, 200, 50));

        userNameSurnameLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        userNameSurnameLabel.setForeground(new java.awt.Color(51, 0, 153));
        userNameSurnameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userNameSurnameLabel.setText("[USER NAME SURNAME]");
        accountScreenPanel.add(userNameSurnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 134, 440, 50));

        drawCashButton.setText("Draw Cash");
        drawCashButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        drawCashButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                drawCashButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                drawCashButtonMouseExited(evt);
            }
        });
        drawCashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawCashButtonActionPerformed(evt);
            }
        });
        accountScreenPanel.add(drawCashButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 360, 150, 50));

        balanceLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        balanceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        balanceLabel.setText("BALANCE :");
        accountScreenPanel.add(balanceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 197, 137, 56));
        accountScreenPanel.add(userBalanceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 197, 249, 56));

        cashDepositButton.setText("Cash Deposit");
        cashDepositButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cashDepositButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cashDepositButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cashDepositButtonMouseExited(evt);
            }
        });
        accountScreenPanel.add(cashDepositButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 451, 150, 50));

        moneyOrderButton.setText("Money Order");
        moneyOrderButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        moneyOrderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                moneyOrderButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                moneyOrderButtonMouseExited(evt);
            }
        });
        accountScreenPanel.add(moneyOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 360, 150, 50));

        paymentsButton.setText("Payments");
        paymentsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paymentsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paymentsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paymentsButtonMouseExited(evt);
            }
        });
        accountScreenPanel.add(paymentsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 451, 150, 50));

        settingButton.setText("Setting");
        settingButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingButtonMouseExited(evt);
            }
        });
        accountScreenPanel.add(settingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, 40));

        logOutButton.setText("Log Out");
        logOutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutButtonMouseExited(evt);
            }
        });
        accountScreenPanel.add(logOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 100, 40));

        getContentPane().add(accountScreenPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseEntered
       ButtonSetting.setBgFg(logOutButton, Color.red, Color.black);
    }//GEN-LAST:event_logOutButtonMouseEntered

    private void logOutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseExited
       ButtonSetting.setOriginalBgFg(logOutButton);
    }//GEN-LAST:event_logOutButtonMouseExited

    private void settingButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingButtonMouseEntered
      this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_settingButtonMouseEntered

    private void settingButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingButtonMouseExited
        ButtonSetting.setOriginalBgFg(settingButton);
    }//GEN-LAST:event_settingButtonMouseExited

    private void drawCashButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawCashButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_drawCashButtonMouseEntered

    private void drawCashButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawCashButtonMouseExited
        ButtonSetting.setOriginalBgFg(drawCashButton);
    }//GEN-LAST:event_drawCashButtonMouseExited

    private void moneyOrderButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moneyOrderButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_moneyOrderButtonMouseEntered

    private void moneyOrderButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moneyOrderButtonMouseExited
        ButtonSetting.setOriginalBgFg(moneyOrderButton);
    }//GEN-LAST:event_moneyOrderButtonMouseExited

    private void cashDepositButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cashDepositButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_cashDepositButtonMouseEntered

    private void cashDepositButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cashDepositButtonMouseExited
      ButtonSetting.setOriginalBgFg(cashDepositButton);
    }//GEN-LAST:event_cashDepositButtonMouseExited

    private void paymentsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentsButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_paymentsButtonMouseEntered

    private void paymentsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentsButtonMouseExited
       ButtonSetting.setOriginalBgFg(paymentsButton);
    }//GEN-LAST:event_paymentsButtonMouseExited

    private void drawCashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawCashButtonActionPerformed
        ActionSetting.setVisible(this, new DrawCashScreen());
    }//GEN-LAST:event_drawCashButtonActionPerformed
    private void setBgFg(Component c){
        ButtonSetting.setBgFg((JButton)c, Color.CYAN, Color.blue);
    }
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
            java.util.logging.Logger.getLogger(AccountScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accountScreenPanel;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JButton cashDepositButton;
    private javax.swing.JButton drawCashButton;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton moneyOrderButton;
    private javax.swing.JButton paymentsButton;
    private javax.swing.JButton settingButton;
    private javax.swing.JLabel userBalanceLabel;
    private javax.swing.JLabel userNameSurnameLabel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
