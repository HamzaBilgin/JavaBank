
package database;

import java.text.DecimalFormat;


public class DbDataCenter extends DbConnection{
    protected int userId = 0;
    protected String nameSurname,phoneNo,idNo,accountNo;
    protected double balance;
    protected double electricityBill,waterBill,gasBill,internetBill;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        double b = Double.valueOf(new DecimalFormat("##.##").format(balance).replaceAll(",", "."));
        this.balance = b;
    }

    public double getElectricityBill() {
        return electricityBill;
    }

    public void setElectricityBill(double electricityBill) {
        this.electricityBill = electricityBill;
    }

    public double getWaterBill() {
        return waterBill;
    }

    public void setWaterBill(double waterBill) {
        this.waterBill = waterBill;
    }

    public double getGasBill() {
        return gasBill;
    }

    public void setGasBill(double gasBill) {
        this.gasBill = gasBill;
    }

    public double getInternetBill() {
        return internetBill;
    }

    public void setInternetBill(double internetBill) {
        this.internetBill = internetBill;
    }
    
    
    
    
    
}
