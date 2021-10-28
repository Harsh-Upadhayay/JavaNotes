package Inheritance;

class MountainBike extends Bicycle {
	
	public int seatHeight;
	
	public MountainBike(int startHeight, int startSpeed, int startGear) {
		super(startSpeed, startGear);  //invokes constructor of base class, (this must be the first line of constructor.)
		seatHeight = startHeight;
	}
	
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}

}
