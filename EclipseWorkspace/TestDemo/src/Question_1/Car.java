package Question_1;

public class Car extends Vehicle{
	float ownershipCost;
	int warrenty, seatingCapacity;
	String fuelType;	

	public Car(float mileage, float price, float ownershipCost, int warrenty, int seatingCapacity, String fuelType) {
		super(mileage, price);
		this.ownershipCost = ownershipCost;
		this.warrenty = warrenty;
		this.seatingCapacity = seatingCapacity;
		this.fuelType = fuelType;
	}

	public float getOwnershipCost() {
		return ownershipCost;
	}

	public void setOwnershipCost(float ownershipCost) {
		this.ownershipCost = ownershipCost;
	}

	public int getWarrenty() {
		return warrenty;
	}

	public void setWarrenty(int warrenty) {
		this.warrenty = warrenty;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
}
