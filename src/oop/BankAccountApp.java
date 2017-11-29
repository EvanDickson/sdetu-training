package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount();

		acc1.setName("Rodger Dodger");
		System.out.println(acc1.getName());
		
		acc1.setSsn("0123456");
		System.out.println(acc1.getSsn());
		
		acc1.accountNumber = "012345";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		
		
		System.out.println(acc1.toString());
		
//		BankAccount acc2 = new BankAccount("Chequing");
//		
//		BankAccount acc3 = new BankAccount("Savings", 1500);
		
		//Demo for inheritance
		
//		CDAccount cd1 = new CDAccount();
//		cd1.balance = 3000;
//		cd1.interestRate = "4.5";
//		cd1.name = "Juan Valdes";
//		cd1.accountType = "CD Account";
//		System.out.println(cd1.toString());
//		cd1.compund();
	}

}
