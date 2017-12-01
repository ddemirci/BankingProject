
public class InterestAccount extends BankAccount {

		private static double interestRate;	
	public InterestAccount() {
		// TODO Auto-generated constructor stub
		
		this.interestRate = interestRate;
		this.accountID = accountID;		
	}	
		
	public static void setInterestRate(double rate)
	{
		interestRate = rate ;	
	}
}
