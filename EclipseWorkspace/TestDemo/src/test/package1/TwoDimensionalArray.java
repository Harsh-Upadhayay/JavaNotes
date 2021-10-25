package test.package1;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int[][] arr = {{2, 7, 9}, {3, 6, 1}, {7, 4, 2}};
		for(int i[] : arr) {
			for(int j : i)
				System.out.print(j + " ");
			System.out.println();
		}
	}
}
