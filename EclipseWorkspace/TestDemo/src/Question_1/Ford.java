package Question_1;

public class Ford extends Car{
	String modleType;

	public String getModleType() {
		return modleType;
	}

	public void setModleType(String modleType) {
		this.modleType = modleType;
	}

	public Ford(float mileage, float price, float ownershipCost, int warrenty, int seatingCapacity, String fuelType,
			String modleType) {
		super(mileage, price, ownershipCost, warrenty, seatingCapacity, fuelType);
		this.modleType = modleType;
	}
	
	public void display() {
		System.out.println( "\nCar's Mielage : " + mileage + 
							"\nCar's Price : " + price +
							"\nCar's ownership cost : " + ownershipCost +
							"\nCar's warranty : " + warrenty + 
							"\nCar's seating capacity : " + seatingCapacity +
							"\nCar's fuel type : " + fuelType +
							"\nCar's model type : " + modleType 
							);
	}
}
