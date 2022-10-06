
package database.transactions;

import database.DbConnection;
import database.IInfoController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import qui.setting.TextSetting;


public class ResetPhoneNumber extends DbConnection implements IInfoController{
    
     private String phoneNo = null;
     
     public boolean telNoRenewed() {
        if(validInformation()) {
            String query = "UPDATE kullanicilar "
                    + "SET tel_no = '" + this.phoneNo + "'"
                    + " WHERE kullanici_id = '" + getAccountInformation().getUserId() + "'";
            try {
                super.statement = super.connection.createStatement();
                statement.executeUpdate(query);
                getAccountInformation().setPhoneNo(this.phoneNo);
            } catch (SQLException ex) {
                Logger.getLogger(ResetPhoneNumber.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        } else {
            return false;
        }
    }
     
     
     

    @Override
    public boolean validInformation() {
        return !(this.phoneNo == null
                || TextSetting.lengthIsItLessThan(11, phoneNo));
    }

    @Override
    public AccountInformation getAccountInformation() {
        return AccountInformation.getInstance();
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
     
     
    
    
    
    
    
}
