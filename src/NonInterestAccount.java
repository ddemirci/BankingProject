
public class NonInterestAccount extends BankAccount {

	public NonInterestAccount() {
		// TODO Auto-generated constructor stub
		this.accountID = counter;	
		System.out.println("Non interest account has been generated");
		counter++;
	}
}
