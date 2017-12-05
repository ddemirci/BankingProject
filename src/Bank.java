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
	 
	 public static int getNumberOfInterestAccounts()
	 {
		 return interestAccounts.size() ;
	 }

	 public static int getNumberOfNonInterestAccounts()
	 {
		 return nonInterestAccounts.size();
	 }
	 // retrieve BankAccount
	public static BankAccount getBankAccount(int accountID)
	 {
		int sizeOfInterest = getNumberOfInterestAccounts();
		int sizeOfNonInterest = getNumberOfNonInterestAccounts();
		int interestFound = -1;
		int nonInterestFound = -1;
		int i = 0 ; 
		int j = 0 ;
		//Interest
		for(int k=0; k<sizeOfInterest; k++)
		{
			if(interestAccounts.get(k).accountID == accountID) 
			interestFound = 1;	
			i=k;	
				
		}
		//Interest
		for(int l =0; l<sizeOfNonInterest; l++)
		{
			if(nonInterestAccounts.get(l).accountID == accountID)  
			nonInterestFound = 1;	
			j=l;	
			
		}
		
		if(interestFound == 1) return interestAccounts.get(i);
		if (nonInterestFound == 1) return nonInterestAccounts.get(j);
		
		
	 }

}
