import java.util.ArrayList;

public class Bank {
	
	 ArrayList<BankAccount> interestAccounts = new ArrayList<BankAccount>();
	 ArrayList<BankAccount> nonInterestAccounts = new ArrayList<BankAccount>();
	 
	 // type = 0 for interest
	 // else for nonInterest
	 public static void openAccount(int type)
	 {
		 if(type == 0)
		 {
			 // interest account
		 }
		 else
		 {
			 // nonInterestAccount
		 }
	 }
	 
	 public static void closeAccount()
	 {
		 
	 }
	 
	 // retrieve BankAccount
	/* public static BankAccount getBankAccount(int accountID)
	 {
		 
		
		 
	 }*/

}
