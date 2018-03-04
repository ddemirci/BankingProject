
public abstract class BankAccount extends Bank {

	long accountID;
	double balance;
	int ownerID;
	
	
		
	/*public static double getCurrentBalance(int accountID)
	{
		BankAccount b1 = getBankAccount(accountID);
		return b1.currentBalance;
	}*/
	
	/*public static void depositMoney(int accountID, double amount)
	{
		getBankAccount(accountID).currentBalance += amount;
		System.out.println(accountID + "no'lu hesaba "+ amount + "'luk para girişi gerçekleşti.");
	}*/
	
	
	public static void withdrawMoney(int accountID, double amount)
	{
		
	}
	
	public static void transaction(int receiverID , int senderID, double amount)
	{
		
	}
	
	
}
