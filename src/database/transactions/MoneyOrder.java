/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class MoneyOrder extends DbConnection implements IInfoController {
    
    private int sendAmount = 0;
    private String remittanceCreditPerson = null;
    
    
 public boolean isMoneyOrder() {
        if(validInformation()) {
            String query = "UPDATE kullanici_bakiye "
                    + "SET bakiye = bakiye - '" + this.sendAmount + "'"
                    + " WHERE kullanici_id = '" + getAccountInformation().getUserId() + "'";
            String query2 = "UPDATE kullanici_bakiye "
                    + "SET bakiye = bakiye + '" + this.sendAmount + "'"
                    + " WHERE musteri_no = '" + this.remittanceCreditPerson + "'";
            try {
                super.statement = super.connection.createStatement();
                if(statement.executeUpdate(query2) == 1) {
                    statement.executeUpdate(query);
                    getAccountInformation().setBalance(getAccountInformation().getBalance() - this.sendAmount);
                    return true;
                } else {
                    return false;
                }
            } catch (SQLException ex) {
                Logger.getLogger(MoneyOrder.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        } else {
            return false;
        }
    }
    
    
    
    
    
    
    
    
    
    
    @Override
    public boolean validInformation() {
        return !(this.sendAmount == 0
                || this.remittanceCreditPerson== null
                || this.sendAmount > getAccountInformation().getBalance()
                || this.remittanceCreditPerson.equals(getAccountInformation().getAccountNo()));
    }

    @Override
    public AccountInformation getAccountInformation() {
        return AccountInformation.getInstance();
    }

    public int getSendAmount() {
        return sendAmount;
    }

    public void setSendAmount(int sendAmount) {
        this.sendAmount = sendAmount;
    }

    public String getRemittanceCreditPerson() {
        return remittanceCreditPerson;
    }

    public void setRemittanceCreditPerson(String remittanceCreditPerson) {
        this.remittanceCreditPerson = remittanceCreditPerson;
    }
    
    
    
}
