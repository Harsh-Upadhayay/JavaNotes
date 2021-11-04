package Question_1;

public class Bajaj extends Bike{
	String make;
	
	public void setMake(String make) {
		this.make = make;
	}
	public String getMake() {
		return make;
	}
	public Bajaj(float mileage, float price, int cylinders, int gears, String coolingType, String wheelType,
			float fuelTankSzie, String make) {
		super(mileage, price, cylinders, gears, coolingType, wheelType, fuelTankSzie);
		this.make = make;
	}
	

	public void display() {
		System.out.println( "\nBike's Mielage : " + mileage + 
							"\nBike's Price : " + price +
							"\nBike's cylinders : " + cylinders +
							"\nBike's gears : " + gears + 
							"\nBike's coolingType : " + coolingType +
							"\nBike's Fuel Tank Size : " + fuelTankSzie +
							"\nBike's Make : " + make +
							"\nBike's Wheel Type : " + wheelType
							);
	}
	
}
