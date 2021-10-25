package test.package1;
import java.util.*;

public class TreeMapDemo {
	public static void main(String args[]) {
		TreeMap<Integer, String> treeMap;
		treeMap = new TreeMap<>();
		
		treeMap.put(3, "A");
		treeMap.put(2, "r");
		treeMap.put(-1, "lao");
		
		System.out.println(treeMap);
	}
}
