
public class InterestAccount extends BankAccount {

	
	
	public InterestAccount() {
		// TODO Auto-generated constructor stub
		this.interestRate = interestRate;
		this.accountID = counter;
		currentBalance = 0.0;
		System.out.println("Interest account has been generated.");
		System.out.println("Interest rate is: "+ interestRate);
		counter++;
		
	}	
		
	public static void setInterestRate(double rate)
	{
		interestRate = rate ;	
	}
}
