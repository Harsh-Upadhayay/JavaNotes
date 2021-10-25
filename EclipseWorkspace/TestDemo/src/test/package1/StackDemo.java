package test.package1;
import java.util.Stack;
import java.util.List;

public class StackDemo {
	public static void main(String ars[]) {
		Stack<String> stack;
		stack = new Stack<>();
		
		stack.push("Hello");
		stack.push("World,");
		stack.push("How");
		stack.push("Are");
		stack.push("You");
		
		System.out.println(stack);
		
		for(String x : stack) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		String x = stack.pop();
		System.out.print("Popped Element : " + x + "\n" + stack);
	}
}
