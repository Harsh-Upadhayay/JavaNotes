package test.package1;
import java.util.TreeSet;
import java.util.Set;

public class TreeSetDemo {
	public static void main(String[] args) {
		
		Set<String> treeSet;
		treeSet = new TreeSet<>();
		
		treeSet.add("B");
		treeSet.add("A");
		treeSet.add("Z");
		treeSet.add("Hp");
		treeSet.add("Hola");
		
		System.out.print(treeSet); //Elements Stored Lexicographically.
	}
}
