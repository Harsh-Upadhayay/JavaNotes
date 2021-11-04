package Question_1;

public class Main {
	public static void main(String args[]) {
		Tvs EconomyBike = new Tvs(40.6f, 150000, 4, 6, "Oil", "Spokes", 10f, "Economy");
		Audi LuxuryCar = new Audi(15.3f, 340000.00f, 70000.00f, 10, 2, "CNG", "Premium");
		
		EconomyBike.display();
		LuxuryCar.display();
	}
}