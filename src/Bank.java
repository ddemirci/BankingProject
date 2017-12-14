import java.util.ArrayList;

import org.omg.CosNaming.NamingContextPackage.NotFound;

public class Bank {
	
	 protected static double interestRate;	
	 protected static int counter = 1;
	 static ArrayList<BankAccount> interestAccounts = new ArrayList<BankAccount>();
	 static ArrayList<BankAccount> nonInterestAccounts = new ArrayList<BankAccount>();
	
	 // type = 0 for interest
	 // else for nonInterest
	 public static void openAccount(int type)
	 {
		 if(type == 0)
		 {
			 // interest account
			 InterestAccount ia = new InterestAccount(); 
			 interestAccounts.add(ia);
			 System.out.println("Your interest account's id: "+ia.accountID);
			 System.out.println();
		 }
		 else
		 {
			 // nonInterestAccount
			 NonInterestAccount nia = new NonInterestAccount();
			 nonInterestAccounts.add(nia);
			 System.out.println("Your non interest account's id: "+nia.accountID);
			 System.out.println();
		 }
	 }
	 
	 public static void closeAccount()
	 {
		 
	 }
	 
	 public static void setInterestRate(double rate)
	 {
		 interestRate = rate;
	 }
	 
	 public static double getInterestRate()
	 {
		 return interestRate;
	 }
	 
	 public static int getAccountID(BankAccount account)
	 {
		return account.accountID;
	 }
	 // retrieve BankAccount
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
	 
	 public static void getAllBankAccountsInfo()
	 {
		 System.out.println("Interest Account IDs \n There are"+interestAccounts.size() +  " account(s) " );
		 for (BankAccount bankAccount : interestAccounts) 
		 {
			System.out.println(bankAccount.accountID + "   " + bankAccount.currentBalance);
		 }
		 System.out.println("\n Non-Interest Account IDs \n There are" + nonInterestAccounts.size() +  " account(s)" );
		 for (BankAccount bankAccount : nonInterestAccounts) 
		 {
			System.out.println(bankAccount.accountID + "   " + bankAccount.currentBalance);
		 }
	 }

}
