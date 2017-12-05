import java.util.ArrayList;

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
			 
		 }
		 else
		 {
			 // nonInterestAccount
			 NonInterestAccount nia = new NonInterestAccount();
			 nonInterestAccounts.add(nia);
			 System.out.println("Your non interest account's id: "+nia.accountID);
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
	 // retrieve BankAccount
	/* public static BankAccount getBankAccount(int accountID)
	 {
		 
		
		 
	 }*/

}
