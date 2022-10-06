/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.transactions;

import database.DbDataCenter;
import database.IInfoController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hamza
 */
public class AccountInformation extends DbDataCenter implements IInfoController{
    
    private static AccountInformation accountInfo = null;
    
    public static AccountInformation getInstance() {
        if(accountInfo == null) {
            accountInfo = new AccountInformation();
        }
        return accountInfo;
    }

    @Override
    public boolean validInformation() {
        return !(super.userId == 0);
    }

    @Override
    public AccountInformation getAccountInformation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void login(String stringUserId) {
        this.takeUser(stringUserId);
        this.takeBalance();
        this.takeBill();
    }
    public void out() {
        super.userId = 0;
        super.nameSurname = null;
        super.phoneNo = null;
        super.accountNo = null;
        super.idNo = null;
        super.balance = 0;
        super.electricityBill = 0;
        super.waterBill = 0;
        super.gasBill = 0;
        super.internetBill = 0;
    }
    private void takeUser(String userIdd) {
        String query = "SELECT * FROM kullanicilar WHERE "
                + "tc_no = '" + userIdd + "'"
                + " OR "
                + "musteri_no = '" + userIdd + "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()) {
                super.userId = rs.getInt("kullanici_id");
                super.nameSurname = rs.getNString("ad_soyad");
                super.idNo = rs.getNString("tc_no");
                super.phoneNo = rs.getNString("tel_no");
                super.accountNo = rs.getNString("musteri_no");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void takeBalance() {
        if(this.validInformation()) {
            String query = "SELECT * FROM kullanici_bakiye"
                    + " WHERE "
                    + "kullanici_id = '" + super.getUserId() + "'";
            try {
                super.statement = super.connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while(rs.next()) {
                    super.balance = rs.getDouble("bakiye");
                }
            } catch (SQLException ex) {
                Logger.getLogger(AccountInformation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private void takeBill() {
        if(this.validInformation()) {
            String query = "SELECT * FROM kullanici_faturalar"
                    + " WHERE "
                    + "kullanici_id = '" + super.getUserId() + "'";
            try {
                super.statement = super.connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while(rs.next()) {
                    super.electricityBill = rs.getDouble("elektrik");
                    super.waterBill = rs.getDouble("su");
                    super.gasBill = rs.getDouble("dogalgaz");
                    super.internetBill = rs.getDouble("internet");
                }
            } catch (SQLException ex) {
                Logger.getLogger(AccountInformation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
