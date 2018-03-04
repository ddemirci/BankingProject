
public class NonInterestAccount extends BankAccount {
	
	public NonInterestAccount(int ownerID,long accountID, double balance) {
		// TODO Auto-generated constructor stub
		this.ownerID = ownerID;
		this.accountID = accountID;
		this.balance = balance;
		System.out.println("Non interest account has been generated");
		
	}
}
