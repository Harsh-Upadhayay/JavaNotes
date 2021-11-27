package Calculate;

public class Sum {
	private int finalSum;
	
	public Sum(int n) {
		finalSum = 0;
		for(int i = 1; i <= n; i++)
			for(int j = 1; j <= i; j++)
				finalSum += j; 
	}
	
	public int getSum() {
		return finalSum;
	}
}
