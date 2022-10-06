
package database.transactions;

import database.DbConnection;
import database.IInfoController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import qui.setting.IRegulator;


public class UserLogin extends DbConnection implements IInfoController{
    private String userId = null;
    private String pass = null;
    
    public boolean isLoginInformationCorrect() {
        if (validInformation()) {
            if (isLoginSuccessful()) {
                this.getAccountInformation().login(userId);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean validInformation() {
        return !(this.userId == null
                || this.pass == null);
             
    }
    private boolean isLoginSuccessful() {
        String query = "SELECT tc_no,musteri_no,sifre FROM kullanicilar"
                + " WHERE "
                + "(tc_no = '" + this.userId + "'"
                + " OR "
                + "musteri_no = '" + this.userId + "')"
                + " AND "
                + "sifre = '" + this.pass + "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public AccountInformation getAccountInformation() {
       return AccountInformation.getInstance();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }


    
    
}
