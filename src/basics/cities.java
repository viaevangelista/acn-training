package basics;

public class cities {
	public static void main(String[] args) {
		//declare and define an array
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		// declare and define array (only size)
		String[] states = new String[9];
		states[0] = "California";
		states[1] = "New Jersey";
		states[2] = "Texas";
		states[3] = "Ohio";
		states[4] = "Utah";
		System.out.println(states[3]);
		System.out.println(states[1]);
	
		//declare array
		String[] countries = new String[7];
		
		//define array
		countries[0] = "Philippines";
		countries[1] = "USA";
		countries[2] = "Japan";
		System.out.println(countries[0]);

		
	}

}
