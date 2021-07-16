package oop;

class Person{
	String name;
	String email;
	String phone;
	
	
	void walk() {
		System.out.println(name + " is walking");
		
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
		
	}
	
	void eat() {
		System.out.println(name + " is eating");
		
	}
	
	
	
	
}

public class Demo {

	public static void main(String[] args) {
		
		//instantiating an object
		Person person1 = new Person();
		
		//define some properties
		person1.name = "via";
		person1.email = "via@email";
		person1.phone = "09612953099";
		
		//abstraction
		person1.walk();
		
		Person person2 = new Person();
		
		person2.name = "jennie";
		person2.sleep();
		
		
		/* 
		// Person
		
		//Attributes, variables, adjectives, descfriptors
		String name = "Via";
		String email = "via@email";
		String phone = "09612953099";

		//action, activty or behaviour  
		System.out.println(name + " is eating ice cream");
		walking(name);
		System.out.println(name + " is walking with her dog");
		
		
		
		//what if we want to do this to another person?
		String name2 = "jennie";
		String email2 = "jennie@email";
		String phone2= "09612953099";

		//action, activity or behavior  
		System.out.println(name2 + " is eating ice cream");
		walking(name2);
		System.out.println(name2 + " is walking with her dog");

	}
	//enhance by adding function to minimize code
			static void walking(String name) {
				System.out.println(name + " is walking ");
			*/	
	}
 
		
}