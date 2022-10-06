
package database.transactions;

import database.DbConnection;
import database.IInfoController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hamza
 */
public class CashDeposit extends DbConnection implements IInfoController{
     private int cashDepositAmount = 0;
     
     public boolean isCashDeposit() {
        if(validInformation()) {
            String query = "UPDATE kullanici_bakiye "
                    + "SET bakiye = bakiye + '" + this.cashDepositAmount + "'"
                    + " WHERE kullanici_id = '" + getAccountInformation().getUserId() + "'";
            try {
                super.statement = super.connection.createStatement();
                statement.executeUpdate(query);
                getAccountInformation().setBalance(getAccountInformation().getBalance() + this.cashDepositAmount);
            } catch (SQLException ex) {
                Logger.getLogger(CashDeposit.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean validInformation() {
        return !(this.cashDepositAmount == 0);
    }

    @Override
    public AccountInformation getAccountInformation() {
         return AccountInformation.getInstance();
    }

    public int getCashDepositAmount() {
        return cashDepositAmount;
    }

    public void setCashDepositAmount(int cashDepositAmount) {
        this.cashDepositAmount = cashDepositAmount;
    }
    
    
    
}
