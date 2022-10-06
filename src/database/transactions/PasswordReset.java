
package database.transactions;

import database.DbConnection;
import database.IInfoController;
import database.transactions.AccountInformation;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PasswordReset extends DbConnection implements IInfoController {
    
    private String idNo = null;
    private String phoneNo = null;
    private String sequrityAnswer = null;
    private String oldPassword = null;
    private String newPassword = null;
    
    
    public boolean passwordRenewed() {
        if (validInformation()) {
            String query = "UPDATE kullanicilar "
                    + "SET sifre = '" + this.newPassword + "'"
                    + " WHERE "
                    + "tc_no = '" + this.idNo + "'"
                    + " AND "
                    + "tel_no = '" + this.phoneNo + "'"
                    + " AND "
                    + "guvenlik_cevap = '" + this.sequrityAnswer + "'";

            if (this.oldPassword != null) {
                query += " AND sifre = '" + this.oldPassword + "'";
            }

            try {
                super.statement = super.connection.createStatement();
                return statement.executeUpdate(query) == 1;
            } catch (SQLException ex) {
                Logger.getLogger(PasswordReset.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        } else {
            return false;
        }
    }
    
    
    
    @Override
    public boolean validInformation() {
        return !(this.idNo == null
                || this.phoneNo == null
                || this.sequrityAnswer == null
                || this.newPassword == null);
    }

    @Override
    public AccountInformation getAccountInformation() {
        return AccountInformation.getInstance();
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getSequrityAnswer() {
        return sequrityAnswer;
    }

    public void setSequrityAnswer(String sequrityAnswer) {
        this.sequrityAnswer = sequrityAnswer;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
    
    
    
}
