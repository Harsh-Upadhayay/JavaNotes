package ploymorphismDemo;

public class InheritanceDemo {
	public static void main(String[] args) {
		Bicycle bicycle = new Bicycle(10, 1);
		System.out.println("Bicycle Gear : " + bicycle.gear);
		System.out.println("Bicycle Speed : " + bicycle.speed);
		bicycle.applyBrake(1);
		System.out.println("Bicycle SpeedAfterBreak : " + bicycle.speed);
		
		MountainBike mountainBike = new MountainBike(50, 50, 3);
		System.out.println("Gear : " + mountainBike.gear);
		System.out.println("Seat height : " + mountainBike.seatHeight);
		System.out.println("MountainBike Speed : " + mountainBike.speed);
		mountainBike.applyBrake(1);
		System.out.println("MountainBike SpeedAfterBreak : " + mountainBike.speed);
	}
}
