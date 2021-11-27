package AssignmentSolutions;

class Question_1 {
	public static void main(String args[]) {
		Tvs EconomyBike = new Tvs(40.6f, 150000, 4, 6, "Oil", "Spokes", 10f, "Economy");
		Audi LuxuryCar = new Audi(15.3f, 3400000.00f, 70000.00f, 10, 2, "CNG", "Premium");
		
		EconomyBike.display();
		LuxuryCar.display();

	}
}

class Vehicle {
	float mileage, price;

	Vehicle(float mileage, float price) {
		this.mileage = mileage;
		this.price = price;
	}

	float getMileage() {
		return mileage;
	}

	void setMileage(float mileage) {
		this.mileage = mileage;
	}
}


 

class Car extends Vehicle{
	float ownershipCost;
	int warranty, seatingCapacity;
	String fuelType;	

	Car(float mileage, float price, float ownershipCost, int warranty, int seatingCapacity, String fuelType) {
		super(mileage, price);
		this.ownershipCost = ownershipCost;
		this.warranty = warranty;
		this.seatingCapacity = seatingCapacity;
		this.fuelType = fuelType;
	}

	float getOwnershipCost() {
		return ownershipCost;
	}

	void setOwnershipCost(float ownershipCost) {
		this.ownershipCost = ownershipCost;
	}

	int getWarranty() {
		return warranty;
	}

	void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	int getSeatingCapacity() {
		return seatingCapacity;
	}

	void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	String getFuelType() {
		return fuelType;
	}

	void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
}

 

class Audi extends Car{
	String modelType;

	String getModelType() {
		return modelType;
	}

	void setModelType(String modelType) {
		this.modelType = modelType;
	}

	Audi(float mileage, float price, float ownershipCost, int warranty, int seatingCapacity, String fuelType,
			String modelType) {
		super(mileage, price, ownershipCost, warranty, seatingCapacity, fuelType);
		this.modelType = modelType;
	}
	

	void display() {
		System.out.println( "\nCar's Mileage : " + mileage + 
							"\nCar's Price : " + price +
							"\nCar's ownership cost : " + ownershipCost +
							"\nCar's warranty : " + warranty + 
							"\nCar's seating capacity : " + seatingCapacity +
							"\nCar's fuel type : " + fuelType +
							"\nCar's model type : " + modelType 
							);
	}
}

 

class Ford extends Car{
	String modelType;

	String getModelType() {
		return modelType;
	}

	void setModelType(String modelType) {
		this.modelType = modelType;
	}

	Ford(float mileage, float price, float ownershipCost, int warranty, int seatingCapacity, String fuelType,
			String modelType) {
		super(mileage, price, ownershipCost, warranty, seatingCapacity, fuelType);
		this.modelType = modelType;
	}
	
	void display() {
		System.out.println( "\nCar's Mileage : " + mileage + 
							"\nCar's Price : " + price +
							"\nCar's ownership cost : " + ownershipCost +
							"\nCar's warranty : " + warranty + 
							"\nCar's seating capacity : " + seatingCapacity +
							"\nCar's fuel type : " + fuelType +
							"\nCar's model type : " + modelType 
							);
	}
}

 

class Bike extends Vehicle{
	int cylinders, gears;
	String coolingType, wheelType;
	float fuelTankSzie;
	Bike(float mileage, float price, int cylinders, int gears, String coolingType, String wheelType,
			float fuelTankSzie) {
		super(mileage, price);
		this.cylinders = cylinders;
		this.gears = gears;
		this.coolingType = coolingType;
		this.wheelType = wheelType;
		this.fuelTankSzie = fuelTankSzie;
	}
	int getCylinders() {
		return cylinders;
	}
	void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}
	int getGears() {
		return gears;
	}
	void setGears(int gears) {
		this.gears = gears;
	}
	String getCoolingType() {
		return coolingType;
	}
	void setCoolingType(String coolingType) {
		this.coolingType = coolingType;
	}
	String getWheelType() {
		return wheelType;
	}
	void setWheelType(String wheelType) {
		this.wheelType = wheelType;
	}
	float getFuelTankSzie() {
		return fuelTankSzie;
	}
	void setFuelTankSzie(float fuelTankSzie) {
		this.fuelTankSzie = fuelTankSzie;
	}

}

 

class Tvs extends Bike{
	String make;

	Tvs(float mileage, float price, int cylinders, int gears, String coolingType, String wheelType,
			float fuelTankSzie, String make) {
		super(mileage, price, cylinders, gears, coolingType, wheelType, fuelTankSzie);
		this.make = make;
	}

	String getMake() {
		return make;
	}

	void setMake(String make) {
		this.make = make;
	}
	
	void display() {
		System.out.println( "\nBike's Mileage : " + mileage + 
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

 

class Bajaj extends Bike{
	String make;
	
	void setMake(String make) {
		this.make = make;
	}
	String getMake() {
		return make;
	}
	Bajaj(float mileage, float price, int cylinders, int gears, String coolingType, String wheelType,
			float fuelTankSzie, String make) {
		super(mileage, price, cylinders, gears, coolingType, wheelType, fuelTankSzie);
		this.make = make;
	}
	

	void display() {
		System.out.println( "\nBike's Mileage : " + mileage + 
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
