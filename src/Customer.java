
public class Customer {

	String name;
	String surname;
	int customerID ;
	String password;
	double balance;
	public static int IDcounter = 1; 
	public Customer(String name,String surname,String pass) {
		
		
		this.name = name;
		this.surname = surname;
		this.customerID = IDcounter;
		this.password = pass;
		this.balance = 0;
		
		StringBuilder sb = new StringBuilder();
		sb.append("Customer ");
		sb.append(name);
		sb.append(" ");
		sb.append(surname);
		sb.append(" has been generated with Customer ID: ");
		sb.append(IDcounter);
		
		IDcounter ++;
		
		System.out.println(sb.toString());
	}
}

