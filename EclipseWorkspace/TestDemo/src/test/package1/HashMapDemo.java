package test.package1;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class HashMapDemo {
	public static void main(String args[]) {
		Map<String, Integer> map;
		map = new HashMap<String, Integer>();
		
		map.put("a", 10);
		map.put("tola", 20);
		map.put("ta", 30);
		
		System.out.println("Size : " + map.size());
		System.out.println("Map : " + map);
		System.out.println("Keys" + map.keySet());
		
		for(String yop : map.keySet())
			System.out.println((String)(yop ) + (map.get(yop)));
		
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ")()(" + entry.getValue());;
		}
		
	}
}
