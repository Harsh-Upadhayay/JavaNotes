package test.package1;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String ars[]) {
		Queue<String> queue;
		queue = new PriorityQueue<>();
		
		queue.add("Hello");
		queue.add("World,");
		queue.add("How");
		queue.add("Are");
		queue.add("You");
		
		System.out.println(queue);
		
		for(String x : queue) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		//String x = queue.pop();
		//System.out.print("Popped Element : " + x + "\n" + queue);
	}
}
