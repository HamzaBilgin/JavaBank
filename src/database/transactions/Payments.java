
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
public class Payments extends DbConnection implements IInfoController{
    
    private String billName = null;
    private double billAmount = 0;
    
    public boolean isTheBillPaid() {
        if (validInformation()) {
            String query = "UPDATE kullanici_faturalar "
                    + "SET " + this.billName + " = 0 "
                    + "WHERE kullanici_id = '" + getAccountInformation().getUserId() + "'";
            try {
                super.statement = super.connection.createStatement();
                statement.executeUpdate(query);
                this.balanceReduce();
                this.resetBill();
            } catch (SQLException ex) {
                Logger.getLogger(Payments.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean validInformation() {
       return !(this.billName == null
                || this.billAmount == 0
                || getAccountInformation().getBalance() < this.billAmount);
    }

    @Override
    public AccountInformation getAccountInformation() {
        return AccountInformation.getInstance();
    }
    
    private void balanceReduce() {
        String query = "UPDATE kullanici_bakiye "
                + "SET bakiye = bakiye - '" + this.billAmount + "'"
                + " WHERE kullanici_id = '" + getAccountInformation().getNameSurname() + "'";
        try {
            super.statement = super.connection.createStatement();
            statement.executeUpdate(query);
            getAccountInformation().setBalance(getAccountInformation().getBalance() - this.billAmount);
        } catch (SQLException ex) {
            Logger.getLogger(Payments.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private void resetBill() {
        if(validInformation()) {
            switch(this.billName) {
                case "elektrik":
                    getAccountInformation().setElectricityBill(0);
                    break;
                case "su":
                    getAccountInformation().setWaterBill(0);
                    break;
                case "dogalgaz":
                    getAccountInformation().setGasBill(0);
                    break;
                case "internet":
                    getAccountInformation().setInternetBill(0);
                    break;
            } 
        }
    }
    
    
    
    

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }
    
    
    
    
}
