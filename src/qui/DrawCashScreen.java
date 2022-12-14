/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qui;

import database.IInfoController;
import database.transactions.AccountInformation;
import database.transactions.DrawCash;
import java.awt.Color;
import javax.swing.JOptionPane;
import qui.setting.ActionSetting;
import qui.setting.ButtonSetting;
import qui.setting.Dialogs;
import qui.setting.IRegulator;
import qui.setting.TextSetting;

/**
 *
 * @author hamza
 */
public class DrawCashScreen extends javax.swing.JFrame implements IRegulator, IInfoController {

    /**
     * Creates new form DrawCashScreen
     */
    private DrawCash drawCashObject = null;
    private int drawCashAmount = 0;

    public DrawCashScreen() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setFocusable(true);
        TextSetting.setOnlyNumber(drawCashAmountText);
        TextSetting.setMaxLimit(drawCashAmountText, 4);
        this.userNameSurname.setText("Sayın " + this.getAccountInformation().getNameSurname());
        this.balanceLabel2.setText(String.valueOf(this.getAccountInformation().getBalance()));

    }

    @Override
    public boolean validInformation() {
        return !(this.drawCashAmountText.getText().equals(""));
    }

    @Override
    public AccountInformation getAccountInformation() {
        return AccountInformation.getInstance();
    }

    public DrawCash getDrawCashObject() {
        if (this.drawCashObject == null) {
            drawCashObject = new DrawCash();
        }
        return drawCashObject;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        drawCashPanel = new javax.swing.JPanel();
        userNameSurname = new javax.swing.JLabel();
        limitLabel = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        balanceLabel2 = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        drawCashAmountText = new javax.swing.JTextField();
        drawCashButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JAVA BANK DRAW CASH SCREEN");

        drawCashPanel.setBackground(new java.awt.Color(153, 255, 102));

        userNameSurname.setBackground(new java.awt.Color(204, 204, 255));
        userNameSurname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        userNameSurname.setForeground(new java.awt.Color(255, 0, 0));
        userNameSurname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userNameSurname.setText("[USER NAME AND SURNAME]");

        limitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        limitLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        limitLabel.setText(" You can withdraw maksimum 5000 TL at once");

        balanceLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        balanceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        balanceLabel.setText("Balance :");

        balanceLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        balanceLabel2.setText("[Balance]");

        amountLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        amountLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        amountLabel.setText("Amount :");

        drawCashAmountText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                drawCashAmountTextKeyReleased(evt);
            }
        });

        drawCashButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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

        backButton.setText("BACK");
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backButtonMouseExited(evt);
            }
        });
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout drawCashPanelLayout = new javax.swing.GroupLayout(drawCashPanel);
        drawCashPanel.setLayout(drawCashPanelLayout);
        drawCashPanelLayout.setHorizontalGroup(
            drawCashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, drawCashPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(drawCashButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(drawCashPanelLayout.createSequentialGroup()
                .addGroup(drawCashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(drawCashPanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(userNameSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(drawCashPanelLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(limitLabel))
                    .addGroup(drawCashPanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(balanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(balanceLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(drawCashPanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(drawCashAmountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(drawCashPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        drawCashPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {balanceLabel2, drawCashAmountText, limitLabel});

        drawCashPanelLayout.setVerticalGroup(
            drawCashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drawCashPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(userNameSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(limitLabel)
                .addGap(28, 28, 28)
                .addGroup(drawCashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balanceLabel)
                    .addComponent(balanceLabel2))
                .addGap(28, 28, 28)
                .addGroup(drawCashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drawCashAmountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(drawCashButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        drawCashPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {amountLabel, balanceLabel, balanceLabel2, drawCashAmountText, limitLabel});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(drawCashPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(drawCashPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseEntered
        ButtonSetting.setBgFg(backButton, Color.CYAN, Color.blue);
    }//GEN-LAST:event_backButtonMouseEntered

    private void backButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseExited
        ButtonSetting.setOriginalBgFg(backButton);
    }//GEN-LAST:event_backButtonMouseExited

    private void drawCashButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawCashButtonMouseEntered
        ButtonSetting.setBgFg(drawCashButton, Color.CYAN, Color.blue);
    }//GEN-LAST:event_drawCashButtonMouseEntered

    private void drawCashButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawCashButtonMouseExited
        ButtonSetting.setOriginalBgFg(drawCashButton);
    }//GEN-LAST:event_drawCashButtonMouseExited

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        ActionSetting.setVisible(this, new AccountScreen());
    }//GEN-LAST:event_backButtonActionPerformed

    private void drawCashAmountTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_drawCashAmountTextKeyReleased
        this.drawCashAmount = TextSetting.checkTheTextKeyReleased(drawCashAmountText, 5000);

    }//GEN-LAST:event_drawCashAmountTextKeyReleased

    private void drawCashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawCashButtonActionPerformed
        if (this.validInformation()) {
            this.drawCash();
        } else {
            Dialogs.notEmptyMessageShow(this);
        }

    }//GEN-LAST:event_drawCashButtonActionPerformed
    private void drawCash() {
        this.getDrawCashObject().setDrawCashAmount(drawCashAmount);

        if (getDrawCashObject().isDrawCash()) {
            Dialogs.privateMessageShow(this, "Withdrawal completed.\n"
                    + "Amount withdrawn:" + this.drawCashAmount + " TL");
            ActionSetting.setVisible(this, new AccountScreen());
        } else {
            Dialogs.privateMessageShow(this, "Your balance is not enough!");
        }
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
            java.util.logging.Logger.getLogger(DrawCashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DrawCashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DrawCashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DrawCashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DrawCashScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JLabel balanceLabel2;
    private javax.swing.JTextField drawCashAmountText;
    private javax.swing.JButton drawCashButton;
    private javax.swing.JPanel drawCashPanel;
    private javax.swing.JLabel limitLabel;
    private javax.swing.JLabel userNameSurname;
    // End of variables declaration//GEN-END:variables
}
