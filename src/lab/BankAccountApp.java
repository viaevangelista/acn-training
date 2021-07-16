package lab;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("");
		
	}

	 class BankAccount{
		 // properties of bank account
		 private int ID;
		 private String accountNumber;
		 private String routingNumber;
		 private String name;
		 private String SNN;
		 private double balance;
		 
		 //constructor
		 public BankAccount(String SNN) {
			 System.out.println("New Account Created");
		 }
	 }
}
