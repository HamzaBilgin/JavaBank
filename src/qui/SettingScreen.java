/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qui;

import database.IInfoController;
import database.transactions.AccountInformation;
import database.transactions.ResetPhoneNumber;
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
public class SettingScreen extends javax.swing.JFrame implements IRegulator,IInfoController{
    
    private ResetPhoneNumber resetPhoneNumberObject = null;

    private String oldPhoneNumber = null;
    
    public SettingScreen() {
        initComponents();
        getEdits();
                
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setFocusable(true);
        TextSetting.setOnlyNumber(phoneNumberText);
        TextSetting.setMaxLimit(phoneNumberText, 11);
        this.phoneNumberText.setText(getAccountInformation().getPhoneNo());
        this.oldPhoneNumber = phoneNumberText.getText();
        this.userNameSurname.setText("Sayın " + getAccountInformation().getUserId());
    }

    @Override
    public boolean validInformation() {
        return !(this.phoneNumberText.getText().equals(""));
    }

    @Override
    public AccountInformation getAccountInformation() {
        return AccountInformation.getInstance();
    }

    public ResetPhoneNumber getResetPhoneNumberObject() {
        if (this.resetPhoneNumberObject == null) {
            resetPhoneNumberObject = new ResetPhoneNumber();
        }
       
        return resetPhoneNumberObject;
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        settingPanel = new javax.swing.JPanel();
        userNameSurname = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        messagePhoneNumberLabel = new javax.swing.JLabel();
        phoneNumberText = new javax.swing.JTextField();
        messagePassqordLabel = new javax.swing.JLabel();
        passwordText = new javax.swing.JTextField();
        phoneNumberChangebutton = new javax.swing.JButton();
        passwordChangeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JAVA BANK SETTİNG SCREEN");

        settingPanel.setBackground(new java.awt.Color(255, 255, 102));

        userNameSurname.setBackground(new java.awt.Color(204, 204, 255));
        userNameSurname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        userNameSurname.setForeground(new java.awt.Color(255, 0, 0));
        userNameSurname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userNameSurname.setText("[USER NAME AND SURNAME]");

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

        messagePhoneNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        messagePhoneNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        messagePhoneNumberLabel.setText("Phone Number :");

        phoneNumberText.setEnabled(false);

        messagePassqordLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        messagePassqordLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        messagePassqordLabel.setText("Password");

        passwordText.setText("**************");
        passwordText.setEnabled(false);

        phoneNumberChangebutton.setText("Change");
        phoneNumberChangebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        phoneNumberChangebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberChangebuttonActionPerformed(evt);
            }
        });

        passwordChangeButton.setText("Change");
        passwordChangeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        passwordChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordChangeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout settingPanelLayout = new javax.swing.GroupLayout(settingPanel);
        settingPanel.setLayout(settingPanelLayout);
        settingPanelLayout.setHorizontalGroup(
            settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingPanelLayout.createSequentialGroup()
                .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(settingPanelLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(userNameSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(settingPanelLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(settingPanelLayout.createSequentialGroup()
                                .addComponent(messagePassqordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passwordChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, settingPanelLayout.createSequentialGroup()
                                .addComponent(messagePhoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(phoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(phoneNumberChangebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        settingPanelLayout.setVerticalGroup(
            settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(userNameSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(messagePhoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(phoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(phoneNumberChangebutton))
                .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(messagePassqordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(settingPanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(passwordChangeButton)))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        settingPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {messagePhoneNumberLabel, phoneNumberText});

        settingPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {messagePassqordLabel, passwordChangeButton, passwordText, phoneNumberChangebutton});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private int clickCounter = 0;
    private void phoneNumberChangebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberChangebuttonActionPerformed
        if(this.clickCounter ==0){
        phoneNumberText.setEnabled(true);
        clickCounter ++;
        }else{
            this.reNewPhoneNumber();
            phoneNumberText.setEnabled(false);
            clickCounter = 0;
        }    
    }//GEN-LAST:event_phoneNumberChangebuttonActionPerformed

    private void passwordChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordChangeButtonActionPerformed
        ActionSetting.setVisible(this, new PasswordResetScreen());
    }//GEN-LAST:event_passwordChangeButtonActionPerformed

    private void backButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseEntered
        ButtonSetting.setBgFg(backButton, Color.CYAN, Color.blue);
    }//GEN-LAST:event_backButtonMouseEntered

    private void backButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseExited
        ButtonSetting.setOriginalBgFg(backButton);
    }//GEN-LAST:event_backButtonMouseExited

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
         ActionSetting.setVisible(this, new AccountScreen());
    }//GEN-LAST:event_backButtonActionPerformed
    private void reNewPhoneNumber() {
        if (this.validInformation()) {
            String newPhoneNumber = this.phoneNumberText.getText().trim();
            getResetPhoneNumberObject().setPhoneNo(newPhoneNumber);
            if (getResetPhoneNumberObject().telNoRenewed()) {
                Dialogs.privateMessageShow(this, "Phone number " + newPhoneNumber + " as updated.");
            } else {
                Dialogs.privateMessageShow(this, "Failed. Check information!");
                this.phoneNumberText.setText(this.oldPhoneNumber);
            }
        } else {
            Dialogs.notEmptyMessageShow(this);
            this.phoneNumberText.setText(this.oldPhoneNumber);
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
            java.util.logging.Logger.getLogger(SettingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel messagePassqordLabel;
    private javax.swing.JLabel messagePhoneNumberLabel;
    private javax.swing.JButton passwordChangeButton;
    private javax.swing.JTextField passwordText;
    private javax.swing.JButton phoneNumberChangebutton;
    private javax.swing.JTextField phoneNumberText;
    private javax.swing.JPanel settingPanel;
    private javax.swing.JLabel userNameSurname;
    // End of variables declaration//GEN-END:variables
}
