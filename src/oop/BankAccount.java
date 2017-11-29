package oop;

public class BankAccount implements IRate{

	// Define variables:
	String accountNumber;
	
	// STatic belongs to the class, not the object instance
	// final means the value remains constant (often static final)
	private static final String routingNumber = "R1234R" ;
	
	// instance variables
	private String name;
	private String ssn;
	String accountType;
	double balance  = 0;
	
	// Constructor definitions: unique methods
		// They are used to define / initialize properties of an object
		// Constructors are IMPLICITLY called upon instantiation
		// The same name as the class itself
		// They have no return type
	
	BankAccount() {
		System.out.println("New Account Created");
		
	}
	
	// Overloading:  When we call the same method name with different arguments.
	
	BankAccount(String accountType) {
		System.out.println(accountType + " account created with routing + " + routingNumber);
	}
	
	BankAccount(String accountType, double initDeposit) {
		System.out.println(accountType + " account was created with " + initDeposit + " balance");
		String Msg = null;
		if(initDeposit < 1000) {
			Msg = "Error: Min deposit must be at least $1k";
		} else {
			Msg = "Thanks for yer initial deposit of " + initDeposit;
		}
		System.out.println(Msg);
		balance = balance + initDeposit;
		checkBalance();
	}
	
	
	// Interface methods
	public void setRate() {
		
	}
	
	public void increaseRate() {
		
	}
	
	
	// Define methods:
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
		
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	
	// Private function can only be called from with class
	private void showActivity(String activity) {
		System.out.println("YER RECENT TRANSACTION: " +  activity);
		System.out.println("YOUR NEW BALANCE IS: $" + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance: $" + balance);
		
	}
	
	void getStatus () {
		
	}
	
	@Override
	public  String toString() {
		return "[ NAME: " + name + ". ACCT #:" + accountNumber + ". ROUTING: " + routingNumber + ". BALANCE: $" + balance + " ]";
	}

	// getters and setters
	
	// Allow the user to define the name
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	
	
	
	
	
}
