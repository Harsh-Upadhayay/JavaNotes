package Number;

public class Check {
	private int value;
	
	public Check(int value) {
		this.value = value;
	}
	
	public boolean isZero() {
		return (0 == value);
	}
	
	public boolean isPositive() {
		if(value < 0)
			return false;
		else return true;
	}
	
	public boolean isNegative() {
		return !isPositive();
	}
	public boolean isOdd() {
		
		if (value%2 == 1)
			return true;
		else return false;
	}
	public boolean isEven() {
		return !isOdd();
	}
	
	public boolean isPrime() {
		for(int i = 2; i <= value*value; i++)
			if(value % i == 0)
				return false;
		return true;
	}
}
