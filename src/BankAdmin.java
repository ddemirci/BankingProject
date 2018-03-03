import java.util.ArrayList;

public class BankAdmin {
	
	protected static double interestRate=2.3;	
	protected static long interestID = 100000;
	protected static long nonInterestID = 200000;
	static ArrayList<InterestAccount> interestAccounts = new ArrayList<InterestAccount>();
	static ArrayList<NonInterestAccount> nonInterestAccounts = new ArrayList<NonInterestAccount>();
	
	 // type = 0 for interest
	 // else for nonInterest
	 public static void openAccount(int customerID,int type, double balance)
	 {
		 if(type == 0)
		 {
			 // interest account
			 InterestAccount ia = new InterestAccount(customerID,interestID, balance, interestRate); 
			 interestAccounts.add(ia);
			 System.out.println("Your interest account's id: "+ia.accountID);
			 System.out.println();
			 interestID++;
		 }
		 else
		 {
			 // nonInterestAccount
			 NonInterestAccount nia = new NonInterestAccount(customerID,nonInterestID,balance);
			 nonInterestAccounts.add(nia);
			 System.out.println("Your non interest account's id: "+nia.accountID);
			 System.out.println();
			 nonInterestID++;
		 }
	 }	
	 
	 public static void getAllBankAccountsInfo()
	 {
		 System.out.println("Interest Account IDs \n There are "+interestAccounts.size() +  " account(s) " );
		 for (InterestAccount intAccount: interestAccounts) 
		 {
			System.out.println(intAccount.accountID + "   " + intAccount.balance);
		 }
		 System.out.println("\n Non-Interest Account IDs \n There are " + nonInterestAccounts.size() +  " account(s)" );
		 for (NonInterestAccount nonIntAccount : nonInterestAccounts) 
		 {
			System.out.println(nonIntAccount.accountID + "   " + nonIntAccount.balance);
		 }
	 }
	 
	 //How to retrieve a bank account
	
	
	
	
	public static void addCustomer(String name,String surname,int ID,String pass)
		{
			Customer c = new Customer(name, surname, ID, pass);
		}

}
