package basics;

public class loop {
	public static void main(String[] args) {
	
		//declare and define an array
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
	

	
		//declare array
		String[] countries = new String[7];
		
		//define array
		countries[0] = "Philippines";
		countries[1] = "USA";
		countries[2] = "Japan";
		System.out.println(countries[0]);
		
		System.out.println("*******");
		
		// declare and define array (only size)
				String[] states = new String[5];
				states[0] = "California";
				states[1] = "New Jersey";
				states[2] = "Texas";
				states[3] = "Ohio";
				states[4] = "Utah";
				System.out.println(states[3]);
			int i = 0;
			
			//Do loop enters the loop then test the condition 
			do {
				System.out.println("STATE: " + states[i]);
				i = i + 1;
			} while (i<5);
			
			
			
			// While loop test condition first then enters loop
			int v = 0;
			boolean stateFound = false;
			while(!stateFound) {
				String state = states[v];
				System.out.println(state);
				if (state == "California") {
				System.out.println("STATE FOUND!");
				stateFound = true;
				}
				v++;
			}
			System.out.println("\nPRINTING WITH LOOP");
			//For loop: best structure for iterating through array
			for (int x = 0; x < 5; x++) {
				System.out.println(states[x]);

			}
	}

}
