package oop;

public class BankAccount {
	//define varibles
	
	String accountNumber;
	static final String routingNumber= "124124";
	String name;
	String snn;
	String accountType;
	double balance = 0;
	
	
	// constructor definitions; unique methods
	// 1. they are used to define or set up initialize property of an object 
	// 2. constructors are implicitly called uppon installation
	// 3. the same name as the class itself
	// 4. constructors has no return type 
	
	
	BankAccount(){
		System.out.println("New Account created");
		//Overloading: call same method name with diff method arguments
	}
	BankAccount(String accountType){
		System.out.println("New Account: " + accountType);
	}
	BankAccount(String accountType, double initDeposit){
		System.out.println("New Account: " + accountType);
		System.out.println("Initial deposit of $" + initDeposit);
		
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "ERROR: Minimum deposit must atleast $1000";
			
		}
		else {
			Msg = "Thanks for your initial deposit of " + "$" + initDeposit;
			
		}
		System.out.println(Msg);
		balance = initDeposit;
		
		
	}
	
	//define methods
	
	void withdraw() {
		
	}
	void deposit() {
		
	}
	void checkBalance() {
		System.out.println("YOUR NEW BALANCE IS: " + balance);
		
	}
}
