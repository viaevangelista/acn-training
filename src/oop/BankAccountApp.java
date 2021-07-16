package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		//creating a new bank account
		
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber= "12345";
		
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber= "12345";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber= "12345";
		acc3.checkBalance();
		
		/*
		System.out.println(acc1.routingNumber);
		System.out.println(acc2.routingNumber);
		System.out.println(acc3.routingNumber);
		*/
		

	}

}
