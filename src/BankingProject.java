import java.util.Scanner;

public class BankingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			/*
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
			BankAccount.depositMoney(1, 2000.0);
			System.out.println(Bank.nonInterestAccounts.get(0).currentBalance);
			Bank.getAllBankAccountsInfo();
			*/
		
		
		
		
		// There will be a menu
		int decision;
		while(true)
		{
			Scanner scan = new Scanner(System.in);
			showCustomerMenu();
			decision = scan.nextInt();
			
			
		}
			 
			  
	}
	public static void logIn(int customerID, String password)
	{
		// check the info from Excel
	}
	
	public static void logOut()
	{
		
	}
	public static void showCustomerMenu()
	{
		System.out.println("Which operation do you want to proceed ? \n Please specify the number");
		System.out.println("1. Open an account. \n2. Close an account.");
		
		System.out.println("");
	}
	
	public static void showAdminMenu()
	{
		System.out.println("Which operation do you want to proceed ? \n Please specify the number");
		System.out.println("1. Create a user. \n2.Delete a user.");
		System.out.println("3. Set interest rate. \n4. Get interest rate.");
		System.out.println("5. Retrieve an account in the bank. \n6. Retrieve all accounts in the bank.");
		
	}

}
