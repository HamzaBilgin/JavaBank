/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qui;

import database.DbConnection;
import database.IInfoController;
import database.transactions.AccountInformation;
import database.transactions.UserApplication;
import database.transactions.UserLogin;
import java.awt.Color;
import qui.setting.ActionSetting;
import qui.setting.ButtonSetting;
import qui.setting.Dialogs;
import qui.setting.IRegulator;
import qui.setting.TextSetting;

/**
 *
 * @author hamza
 */
public final class LoginScreen extends javax.swing.JFrame implements IRegulator,IInfoController {
    private UserLogin userLoginObject = null;
    private final String User_Test_Original = "ID NO/ACCOUNT NO";
    private final String Password_Test_Original = "********************";

    public LoginScreen() {
        initComponents();
        getEdits();
        new DbConnection();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null); // Ekranı ortada başlatır
        LoginScreenPanel.setFocusable(true);// Ekranda sadece panele fokuslanır.
        userText.setText(User_Test_Original);
        passwordText.setText(Password_Test_Original);
        TextSetting.setOnlyNumber(userText);
    }

    @Override
    public boolean validInformation() {
        return !(this.userText.getText().equals(this.User_Test_Original)
                || String.valueOf(this.passwordText.getPassword()).equals(this.Password_Test_Original));
    }

    @Override
    public AccountInformation getAccountInformation() {
         return AccountInformation.getInstance();
    }
    public UserLogin getUserLoginObject(){
        if(this.userLoginObject == null) {
            userLoginObject = new UserLogin();
        }
        return userLoginObject;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginScreenPanel = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        userText = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        messageForgetPasswordLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JAVA BANK LOGIN SCREEN");

        LoginScreenPanel.setBackground(new java.awt.Color(51, 153, 255));

        welcomeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("WELCOME TO JAVA BANK");

        userText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userText.setForeground(new java.awt.Color(153, 153, 153));
        userText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userTextFocusLost(evt);
            }
        });

        passwordText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordText.setForeground(new java.awt.Color(153, 153, 153));
        passwordText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordTextFocusLost(evt);
            }
        });
        passwordText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passwordTextMouseEntered(evt);
            }
        });

        loginButton.setText("LOGIN");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonMouseExited(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        registerButton.setText("REGISTER");
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerButtonMouseExited(evt);
            }
        });
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        messageForgetPasswordLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        messageForgetPasswordLabel.setForeground(new java.awt.Color(255, 0, 51));
        messageForgetPasswordLabel.setText("Did you forget your password ?");
        messageForgetPasswordLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                messageForgetPasswordLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LoginScreenPanelLayout = new javax.swing.GroupLayout(LoginScreenPanel);
        LoginScreenPanel.setLayout(LoginScreenPanelLayout);
        LoginScreenPanelLayout.setHorizontalGroup(
            LoginScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginScreenPanelLayout.createSequentialGroup()
                .addGroup(LoginScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginScreenPanelLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginScreenPanelLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(LoginScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(136, Short.MAX_VALUE))
            .addGroup(LoginScreenPanelLayout.createSequentialGroup()
                .addGroup(LoginScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginScreenPanelLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(registerButton)
                        .addGap(130, 130, 130)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginScreenPanelLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(messageForgetPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        LoginScreenPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {passwordText, userText});

        LoginScreenPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {loginButton, registerButton});

        LoginScreenPanelLayout.setVerticalGroup(
            LoginScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginScreenPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(LoginScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerButton))
                .addGap(31, 31, 31)
                .addComponent(messageForgetPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        LoginScreenPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {loginButton, passwordText, registerButton, userText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginScreenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LoginScreenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*
    button coloring
     */
    private void loginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseEntered
        ButtonSetting.setBgFg(loginButton, Color.cyan, Color.red);
    }//GEN-LAST:event_loginButtonMouseEntered

    private void loginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseExited
        ButtonSetting.setOriginalBgFg(loginButton);
    }//GEN-LAST:event_loginButtonMouseExited

    private void registerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseEntered
        ButtonSetting.setBgFg(registerButton, Color.cyan, Color.red);

    }//GEN-LAST:event_registerButtonMouseEntered

    private void registerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseExited
        ButtonSetting.setOriginalBgFg(registerButton);
    }//GEN-LAST:event_registerButtonMouseExited

    private void passwordTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTextMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextMouseEntered

    /*
    Text Focus
     */
    private void userTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userTextFocusGained
       
        TextSetting.checkTheTextFocusGained(userText, User_Test_Original);
        TextSetting.lengthIsItLessThan(11, User_Test_Original);
    }//GEN-LAST:event_userTextFocusGained

    private void passwordTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextFocusGained
        TextSetting.checkTheTextFocusGained(passwordText, Password_Test_Original);
    }//GEN-LAST:event_passwordTextFocusGained

    private void userTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userTextFocusLost
        TextSetting.checkTheTextFocusLost(userText);
    }//GEN-LAST:event_userTextFocusLost

    private void passwordTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextFocusLost
        TextSetting.checkTheTextFocusLost(passwordText);
    }//GEN-LAST:event_passwordTextFocusLost

    /*
    Button Action
     */
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
       if(this.validInformation()) {
           String userid = this.userText.getText().trim();
           String pass = String.valueOf(this.passwordText.getPassword());
           this.login(userid, pass);
       } else {
           Dialogs.notEmptyMessageShow(this);
       }
    }//GEN-LAST:event_loginButtonActionPerformed
    private void login(String userid,String pass) {
        
        this.getUserLoginObject().setUserId(userid);
        this.getUserLoginObject().setPass(pass);
        
        if(getUserLoginObject().isLoginInformationCorrect()) {
            ActionSetting.setVisible(this, new AccountScreen());
        } else {
            Dialogs.privateMessageShow(this, "Login information is not correct!\n"
                    + "Please check your information!");
        }
    }
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        ActionSetting.setVisible(this, new RegisterScreen());
    }//GEN-LAST:event_registerButtonActionPerformed

    private void messageForgetPasswordLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_messageForgetPasswordLabelMouseClicked
       PasswordResetScreen p_r_s = new PasswordResetScreen();
       ActionSetting.setVisible(this,p_r_s);
       p_r_s.getOldPasswordText().setEnabled(false);
    }//GEN-LAST:event_messageForgetPasswordLabelMouseClicked

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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginScreenPanel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel messageForgetPasswordLabel;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField userText;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
