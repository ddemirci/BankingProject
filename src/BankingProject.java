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
		
		/*
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Banking Simulator");
		System.out.println("Please enter your credentials");
		System.out.print("Customer number: "); // Customer Number
		int cNumber = scan.nextInt();
		System.out.print("Your password: ");// Password
		String cPass = scan.nextLine();
		
		logIn(cNumber, cPass); // LogIn function
		
		// Cont. from here
		
		
		int decision = scan.nextInt();
		if(decision==1) showAdminMenu();
		else showCustomerMenu();
		
		System.out.println("Press \"0\" to exit ");
		while(decision != 0)
		{
			
			decision= scan.nextInt();
		
			
			
			
			
		}
			 
		 */
		
		BankAdmin.addCustomer("Doruk", "Demirci","dorr");
		BankAdmin.openAccount(1, 0, 250);
		BankAdmin.openAccount(1, 1, 1000);
		Bank.setInterestRate(2.70);
		BankAdmin.openAccount(1, 0, 350);
		
		//BankAdmin.getAllBankAccountsInfo();
		//System.out.println(BankAdmin.getBankAccount(100000).balance);
		
		showAdminMenu();
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
		System.out.println("3. See your balance of your accounts. \n4. Deposit money.");
		System.out.println("5. Withdraw money. \n6. Transfer money.");
		System.out.println("");
	}
	
	public static void showAdminMenu()
	{
		System.out.println("Which operation do you want to proceed ? \n Please specify the number");
		System.out.println("1. Create a user. \n2. Delete a user.");
		System.out.println("3. Set interest rate. \n4. Get interest rate.");
		System.out.println("5. Retrieve an account in the bank. \n6. Retrieve all accounts in the bank.");
		System.out.println("7. Exit");
		System.out.println();
		Scanner admin = new Scanner(System.in);
		int adminChoice = admin.nextInt();
		if(adminChoice == 1)
		{
			System.out.println("Please enter name and surname of the new user");
			admin.nextLine();
			String fullName=admin.nextLine();
			System.out.println("Please enter password of the new user");
			String pass = admin.next();
			String[] parts = fullName.split(" ");
			String name = parts[0];
			String surname = parts[1];
				
			
			BankAdmin.addCustomer(name, surname,pass);
			showAdminMenu();
		}
		else if(adminChoice == 3)
		{
			System.out.println("Current interest rate is " + Bank.getInterestRate());
			System.out.println("Please enter new interest rate");
			double newRate = admin.nextDouble();
			Bank.setInterestRate(newRate);
		}
		else if(adminChoice == 4)
		{
			System.out.println("Current interest rate is " + Bank.getInterestRate());
		}
		else if(adminChoice == 5)
		{
			System.out.println("Please enter the accountID that you want to retrieve:");
			long id = admin.nextLong();
			BankAccount retrieved = BankAdmin.getBankAccount(id);
			System.out.println("Owner is "+ retrieved.ownerID);
			System.out.println("Balance is " + retrieved.balance);
			String accType = retrieved.getClass().toString();
			String[] type = accType.split(" ");
			System.out.println("Account Type is " + type[1]);
		}
		else if(adminChoice == 6)
		{
			BankAdmin.getAllBankAccountsInfo();
			showAdminMenu();
		}
		else if(adminChoice == 7) return;
		
	}

}
