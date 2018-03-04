import java.util.ArrayList;


public class Bank {
	
	 
	 
	 public static void closeAccount()
	 {
		 
	 }
	 
	 public static void setInterestRate(double rate)
	 {
		 BankAdmin.interestRate= rate;
		 System.out.println("Interest rate has been set to " + rate);
	 }
	 
	 public static double getInterestRate()
	 {
		 return BankAdmin.interestRate;
	 }
	 
	 
	 // retrieve BankAccount
	
	 /*
	 public static BankAccount getBankAccount(int accountID)
	 {
		for(int i=0; i< interestAccounts.size() ; i++ )
		{
			if(getAccountID(interestAccounts.get(i)) == accountID) return interestAccounts.get(i);
		}
		
		for (BankAccount bankAccount : nonInterestAccounts) 
		{
			if(getAccountID(bankAccount) == accountID) return bankAccount;
		}
		
		return interestAccounts.get(0);
	}
	 
	 
	 */

}
