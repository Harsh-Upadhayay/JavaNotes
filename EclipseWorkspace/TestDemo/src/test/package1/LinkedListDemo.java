package test.package1;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String args[]) {
		List<String> list = new LinkedList<String>();
		
		list.add("A");
		list.add("B");
		list.add(2, "E");
		
		System.out.println(list.get(1));
	}
}
