package basics;

public class Weather {
	public static void main(String[] args) {
		
		int temperature = 65;
		String sunCondition = "Sunny";
		
		if (temperature > 80) {
			System.out.println("Lekker weer");
		}
		
		else if ((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("Prima weer");
		}
		else {
			System.out.println("Rukweer");
		}
	}
}
