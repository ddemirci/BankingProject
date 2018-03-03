
public class InterestAccount extends BankAccount {

	double interestRate;
	long accountID;
	double balance;
	int ownerID;
	
	public InterestAccount(int ownerID,long accountID, double balance, double interestRate) {
		// TODO Auto-generated constructor stub
		this.ownerID = ownerID;
		this.interestRate = interestRate;
		this.accountID = accountID;	
		this.balance = balance;
		
		System.out.println("Interest account has been generated.");
		System.out.println("Interest rate is: "+ interestRate);
		
	}	
		
}
