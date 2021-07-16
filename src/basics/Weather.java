package basics;

public class Weather {
	public static void main(String[] args) {
		
		int temperature = 6;
		String sunCondition = "sunny";
		
		
		if (temperature >= 35) {
		System.out.println("It's Pleasant! Wear shorts and t-shirt.");	
		}
		else if ((temperature >= 28) && (sunCondition == "sunny")){
			System.out.println("It's a litte cooler. Wear a long sleeves and pants");
		}
		else if ((temperature >= 5) || (sunCondition == "gulugulu")) {
			System.out.println("pakamatay ka na!");
			
		}
		
		
		}
		
	}

