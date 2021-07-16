package basics;

public class Salarycalculator {
	public static void main(String[] args) {
		// let's create a variable to define our career
		
		//declare a variable
		String career;
		
		//defined a variable
		career = "Software Developer";
		System.out.println("Program is Starting");
		System.out.println("My career is: " + career);
		
		//Declare and define
		
		int hoursPerweek = 48;
		int weeksPeryear = 50;
		double rate = 700;
		career = "Web Developer";
		
		double salary = hoursPerweek*weeksPeryear*rate;
		System.out.println("My salary as a " + career + " at the rate of " + rate + " per hour " + "is " + "$"+ salary + " per year");
		
		//computer annual salary
		//rate * hours per week * weeks per year
		
	}
}
