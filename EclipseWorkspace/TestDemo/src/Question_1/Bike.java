package Question_1;

public class Bike extends Vehicle{
	int cylinders, gears;
	String coolingType, wheelType;
	float fuelTankSzie;
	public Bike(float mileage, float price, int cylinders, int gears, String coolingType, String wheelType,
			float fuelTankSzie) {
		super(mileage, price);
		this.cylinders = cylinders;
		this.gears = gears;
		this.coolingType = coolingType;
		this.wheelType = wheelType;
		this.fuelTankSzie = fuelTankSzie;
	}
	public int getCylinders() {
		return cylinders;
	}
	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}
	public int getGears() {
		return gears;
	}
	public void setGears(int gears) {
		this.gears = gears;
	}
	public String getCoolingType() {
		return coolingType;
	}
	public void setCoolingType(String coolingType) {
		this.coolingType = coolingType;
	}
	public String getWheelType() {
		return wheelType;
	}
	public void setWheelType(String wheelType) {
		this.wheelType = wheelType;
	}
	public float getFuelTankSzie() {
		return fuelTankSzie;
	}
	public void setFuelTankSzie(float fuelTankSzie) {
		this.fuelTankSzie = fuelTankSzie;
	}

}
