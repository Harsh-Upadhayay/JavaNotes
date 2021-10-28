package ploymorphismDemo;

class MountainBike extends Bicycle {
	
	public int seatHeight;
	
	public MountainBike(int startHeight, int startSpeed, int startGear) {
		super(startSpeed, startGear);  //invokes constructor of base class, (this must be the first line of constructor.)
		seatHeight = startHeight;
	}
	
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
	
	@Override
	public void setGear(int newValue) {
		gear = newValue+2;
	}
	
	@Override
	public void applyBrake(int decrement) {
		speed =  speed - decrement - 10;
	}
	
//	@Override
//	public void speedUp(int increment) {
//		speed += (increment+10);
//	}
}
