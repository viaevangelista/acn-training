package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Rings";
		bookTitle = "The Lord of the Rings";
		
		
		if (bookTitle.contains(wordChoice)) {
		System.out.println("The Lord of the " + wordChoice);
		}
		
		// String browser == "chrome"
		String browser = "chrome";
		if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println("The browser is Chrome");
		}
		
		String firstName = "Via";
		String lastName = "Evangelista";
		String SNN = "12345675234";
		System.out.println("There are " + firstName.length() + " letters in your First Name, " + lastName.length() 
		+ " letters in your last name and " + SNN.length() + " digits in your SNN." );
		
		System.out.print(firstName.substring(0,3));
		System.out.print(lastName.substring(0,11));
		System.out.print(SNN.substring(5));
		
		

	}

}
