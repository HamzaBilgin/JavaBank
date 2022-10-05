
package database;

import database.transactions.AccountInformation;


public interface IInfoController {
    public boolean validInformation();
    
    public AccountInformation getAccountInformation();
    
}
