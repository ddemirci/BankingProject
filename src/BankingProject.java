
public class BankingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			Bank.setInterestRate(3.7);
			Bank.openAccount(0);
			System.out.println("Yaptık bisey");
			Bank.openAccount(2);
			Bank.openAccount(0);
			Bank.getInterestRate();
			System.out.println("Geliyo");
			System.out.println(Bank.nonInterestAccounts.size());
			System.out.println(Bank.getAccountID(Bank.interestAccounts.get(1)));
			
			System.out.println(Bank.nonInterestAccounts.get(0).currentBalance);
			BankAccount.depositMoney(2, 1000);
			System.out.println(Bank.nonInterestAccounts.get(0).currentBalance);
			
	}

}
