
package database.transactions;

import database.DbConnection;
import database.IInfoController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import qui.setting.TextSetting;


public class UserApplication extends DbConnection implements IInfoController{
    // Application Info
    private String nameSurname = null,idNo = null, phoneNo = null;
    private String sequrityQuestion = null, seqrityAnswer = null;
    
    //Information to be given by the system
    private String accountNo = null; 
    private String password = null;
    
    public boolean isApplicationApproved(){
        if(this.validInformation()){
            if(this.istheIDintheTable()){
                return false;
            } else {
                this.confirmApplication();
                return true;
            }
            
        } else {
            return false;
        }
    }
    
    private boolean istheIDintheTable(){
        String query = "SELECT tc_no FROM kullanicilar WHERE tc_no = '"+ this.idNo + "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs =statement.executeQuery(query);
            while(rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
    }
    private void confirmApplication(){
        String query = "INSERT INTO kullanicilar(musteri_no,sifre,"
                + "ad_soyad,tc_no,tel_no,güvenlik_sorusu,güvenlik_cevap)"
                + "VALUES ("
                + "'" +this.accountNo +"',"
                + "'" +this.password +"',"
                + "'" +this.nameSurname +"',"
                + "'" +this.idNo +"',"
                + "'" +this.phoneNo +"',"
                + "'" +this.sequrityQuestion +"',"
                + "'" +this.seqrityAnswer +"'"
                + ")";
        
        
        try {
            super.statement = super.connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(UserApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
    public boolean isThereAccountNumberOnTheTable(){
        String query = "SELECT musteri_no FROM kullanicilar WHERE musteri_no = '" + this.accountNo + "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    @Override
    public boolean validInformation() {
        return !(this.nameSurname ==null
                ||this.idNo == null
                ||this.phoneNo == null
                ||this.seqrityAnswer==null
                ||this.sequrityQuestion==null
                ||this.accountNo == null
                ||this.password == null)
                ||TextSetting.lengthIsItLessThan(11,this.idNo)
                ||TextSetting.lengthIsItLessThan(11,this.phoneNo);
                
    }

    @Override
    public AccountInformation getAccountInformation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
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

    public String getSequrityQuestion() {
        return sequrityQuestion;
    }

    public void setSequrityQuestion(String sequrityQuestion) {
        this.sequrityQuestion = sequrityQuestion;
    }

    public String getSeqrityAnswer() {
        return seqrityAnswer;
    }

    public void setSeqrityAnswer(String seqrityAnswer) {
        this.seqrityAnswer = seqrityAnswer;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
