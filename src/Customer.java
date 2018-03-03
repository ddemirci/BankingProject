
public class Customer {

	String name;
	String surname;
	int customerID;
	String password;
	double balance;
	
	public Customer(String name,String surname,int ID,String pass) {
		
		
		this.name = name;
		this.surname = surname;
		this.customerID = ID;
		this.password = pass;
		
		StringBuilder sb = new StringBuilder();
		sb.append("Customer ");
		sb.append(name);
		sb.append(" ");
		sb.append(surname);
		sb.append(" has been generated with Customer ID: ");
		sb.append(ID);
		
		System.out.println(sb.toString());
	}
}

