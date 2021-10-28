package Inheritance;

public class InheritanceDemo {
	public static void main(String[] args) {
		MountainBike mountainBike = new MountainBike(20, 10, 1);
		System.out.println("Gear : " + mountainBike.gear);
		System.out.println("Seat height : " + mountainBike.seatHeight);
	}
}
