
package database.transactions;

import database.DbConnection;
import database.IInfoController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import qui.setting.IRegulator;

/**
 *
 * @author hamza
 */
public class DrawCash extends DbConnection implements IInfoController{
    private int drawCashAmount = 0;
    
    public boolean isDrawCash() {
        if(validInformation()) {
            String query = "UPDATE kullanici_bakiye "
                    + "SET bakiye = bakiye - '" + this.drawCashAmount + "'"
                    + " WHERE kullanici_id = '" + getAccountInformation().getUserId() + "'";
            try {
                super.statement = super.connection.createStatement();
                statement.executeUpdate(query);
                getAccountInformation().setBalance(getAccountInformation().getBalance() - this.drawCashAmount);
            } catch (SQLException ex) {
                Logger.getLogger(DrawCash.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        } else {
            return false;
        }
    }
    
    
    
    
    
    @Override
    public boolean validInformation() {
        return !(this.drawCashAmount == 0
                 || getAccountInformation().getBalance() < this.drawCashAmount);
    }

    @Override
    public AccountInformation getAccountInformation() {
        return AccountInformation.getInstance();
    }

    public int getDrawCashAmount() {
        return drawCashAmount;
    }

    public void setDrawCashAmount(int drawCashAmount) {
        this.drawCashAmount = drawCashAmount;
    }
    
    
    
    
    
    
    
    
}
