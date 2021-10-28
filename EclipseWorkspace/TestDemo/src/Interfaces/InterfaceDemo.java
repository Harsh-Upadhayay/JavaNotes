package Interfaces;

public class InterfaceDemo {
	public static void main(String args[]) {
		MountainBike mountainBike = new MountainBike(20, 10, 1);
		
		System.out.println("Gear is : " + mountainBike.getGear());
		System.out.println("Seat height is : " + mountainBike.getSeatHeight());
		mountainBike.applyBrake(4);
		System.out.println("Speed is : " + mountainBike.getSpeed());
		
	}
}
