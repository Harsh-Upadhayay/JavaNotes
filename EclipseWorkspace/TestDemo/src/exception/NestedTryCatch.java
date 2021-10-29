package exception;

public class NestedTryCatch {
	public static void main(String args[]) {
		try {	// block 1
			try {	// block 2
				try {	// block 3
					
					int arr[] = {1,2,3,4};
					System.out.println(arr[10]); // will throw ArrayIndexOutOfBoundsException
				
				} catch (ArrayIndexOutOfBoundsException E) {
					
					System.out.println("Exception in Block 3");
					throw E; // reThrows the exception (now it'll be caught by the second block).
				
				}
			
			} catch (ArrayIndexOutOfBoundsException E) {
				
				System.out.println("Exception in Block 2");
				throw E; // reThrows the exception (now it'll be caught by the first block).
			
			}
		
		}  catch (ArrayIndexOutOfBoundsException E) {
			
			System.out.println("Exception in Block 3");
			
		
		}
	}
}
