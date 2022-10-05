/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qui;

import database.IInfoController;
import database.transactions.AccountInformation;
import database.transactions.UserApplication;
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
public class RegisterScreen extends javax.swing.JFrame implements IRegulator, IInfoController {

    private UserApplication userAppObject = null;

    public RegisterScreen() {
        initComponents();
        getEdits();

    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setFocusable(true);
        TextSetting.setOnlyAlphabetic(nameSurnameText);
        TextSetting.setOnlyNumber(idNoText);
        TextSetting.setOnlyNumber(phoneNumberText);
        TextSetting.setMaxLimit(idNoText, 11);
        TextSetting.setMaxLimit(phoneNumberText, 11);

    }

    public UserApplication getUserAppObject() {
        if (this.userAppObject == null) {
            userAppObject = new UserApplication();
        }
        return userAppObject;
    }

    @Override
    public boolean validInformation() {
        return TextSetting.fiilingTextFields(registerPanel);
    }

    @Override
    public AccountInformation getAccountInformation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerPanel = new javax.swing.JPanel();
        personalInfoLabel = new javax.swing.JLabel();
        nameSurnameLabel = new javax.swing.JLabel();
        nameSurnameText = new javax.swing.JTextField();
        idNoLabel = new javax.swing.JLabel();
        idNoText = new javax.swing.JTextField();
        phoneNumberLabel = new javax.swing.JLabel();
        securityInfoLabel = new javax.swing.JLabel();
        securityQuestion = new javax.swing.JLabel();
        securityQustionCheckBox = new javax.swing.JComboBox<>();
        phoneNumberText = new javax.swing.JTextField();
        answerText = new javax.swing.JTextField();
        answerLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JAVA BANK REGISTER SCREEN");

        registerPanel.setBackground(new java.awt.Color(153, 255, 102));

        personalInfoLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        personalInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        personalInfoLabel.setText("Personal Information");

        nameSurnameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameSurnameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nameSurnameLabel.setText("Name Surname : ");

        nameSurnameText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        idNoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        idNoLabel.setText("Id No :");

        idNoText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        phoneNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phoneNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        phoneNumberLabel.setText("Phone Number :");

        securityInfoLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        securityInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        securityInfoLabel.setText("Security Information");

        securityQuestion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        securityQuestion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        securityQuestion.setText("Security Question :");

        securityQustionCheckBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        securityQustionCheckBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your pet's name?", "What is your favorite object?", "What is the surname of your primary school teacher?", "Where would you like to live?", "Enter random sentence?(Recomended)" }));

        phoneNumberText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        answerText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        answerLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        answerLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        answerLabel.setText("Answer :");

        registerButton.setText("REGISTER");
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(412, 412, 412)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registerPanelLayout.createSequentialGroup()
                                .addComponent(phoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(phoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(registerPanelLayout.createSequentialGroup()
                                .addComponent(idNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(idNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(registerPanelLayout.createSequentialGroup()
                                .addComponent(nameSurnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nameSurnameText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(personalInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(securityInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(registerPanelLayout.createSequentialGroup()
                                .addComponent(securityQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(securityQustionCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(registerPanelLayout.createSequentialGroup()
                                .addComponent(answerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(answerText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        registerPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {answerText, securityQustionCheckBox});

        registerPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {backButton, registerButton});

        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(personalInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameSurnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameSurnameText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(securityInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(securityQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(securityQustionCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(answerText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(registerButton)
                .addGap(47, 47, 47))
        );

        registerPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {answerText, backButton, registerButton, securityQustionCheckBox});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseEntered
        ButtonSetting.setBgFg(registerButton, Color.cyan, Color.red);
    }//GEN-LAST:event_registerButtonMouseEntered

    private void registerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseExited
        ButtonSetting.setOriginalBgFg(registerButton);
    }//GEN-LAST:event_registerButtonMouseExited

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        if (this.validInformation()) {
            this.makeApplication();
        } else {
            Dialogs.notEmptyMessageShow(this);
        }

    }//GEN-LAST:event_registerButtonActionPerformed
    private void makeApplication() {
        //Personal Info
        this.getUserAppObject().setNameSurname(this.nameSurnameText.getText().trim());
        this.getUserAppObject().setIdNo(this.idNoText.getText().trim());
        this.getUserAppObject().setPhoneNo(this.phoneNumberText.getText().trim());
        //Sequrity Info
        this.getUserAppObject().setSequrityQuestion(String.valueOf(this.securityQustionCheckBox.getSelectedItem()));
        this.getUserAppObject().setSeqrityAnswer(this.answerText.getText().trim());
        //information to be given by the system
        this.getUserAppObject().setAccountNo(this.randomAccountNo());
        this.getUserAppObject().setPassword(this.randomPassword());
        
        if(this.getUserAppObject().isApplicationApproved()){
             Dialogs.privateMessageShow(this, "Application Successful\n"
                     + "Account Number : " + this.getUserAppObject().getAccountNo()
                     +"\nPassword : " + this.getUserAppObject().getPassword());
        ActionSetting.setVisible(this, new LoginScreen());
        } else {
            Dialogs.privateMessageShow(this, "Application is Failed\n"
                    + "Please check your information !");
        }
        
    }
    private String randomAccountNo(){
        String accountNoo;
        do{
        accountNoo = String.valueOf(100000+(int)(Math.random()*9000000));
        }while(this.getUserAppObject().isThereAccountNumberOnTheTable());
        return accountNoo;
    }
        
    private String randomPassword(){
        String password;
        password = String.valueOf((1000+(int)(Math.random()*9000)));
        return password;
    }


    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        ActionSetting.setVisible(this, new LoginScreen());
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel answerLabel;
    private javax.swing.JTextField answerText;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel idNoLabel;
    private javax.swing.JTextField idNoText;
    private javax.swing.JLabel nameSurnameLabel;
    private javax.swing.JTextField nameSurnameText;
    private javax.swing.JLabel personalInfoLabel;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneNumberText;
    private javax.swing.JButton registerButton;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JLabel securityInfoLabel;
    private javax.swing.JLabel securityQuestion;
    private javax.swing.JComboBox<String> securityQustionCheckBox;
    // End of variables declaration//GEN-END:variables
}
