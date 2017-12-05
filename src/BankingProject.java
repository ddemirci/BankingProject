
public class BankingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			Bank.setInterestRate(3.7);
			Bank.openAccount(0);
			System.out.println("Yaptık bisey");
			Bank.openAccount(2);
			Bank.openAccount(0);
			Bank.getInterestRate();
			System.out.println(Bank.getNumberOfInterestAccounts());
			System.out.println(Bank.getNumberOfNonInterestAccounts());
		
	}

}
