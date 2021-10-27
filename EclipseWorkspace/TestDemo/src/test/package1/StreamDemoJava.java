package test.package1;
import java.util.*;
import java.util.stream.*;

public class StreamDemoJava {
	public static void main(String args[]) {
		List<Integer> list;
		list = new ArrayList<>();

		list.add(50);
		list.add(60);
		list.add(10);
		list.add(90);
		list.add(100);
		list.add(-10);

		Set<Integer> sqList = 
				list.stream().map(x -> x*x/100).collect(Collectors.toSet());
		List<Integer> sqSet = 
				list.stream().map(x -> x*x/100).collect(Collectors.toList());
//		System.out.print(sqList);
//		System.out.print(sqSet);
		
		List<String> languages;
		languages = new ArrayList<>();
		languages.add("java");
		languages.add("scala");
		languages.add("python");
		
		//To get elements of this list which start with p
		
		//Traditional method
		
//		List<String> filteredResult = new ArrayList<>();
//		for(String item : languages) {
//			if (item.startsWith("p")) {
//				filteredResult.add(item);
//			}
//		}
//		
//		List<String> filteredResult = 
//				languages.stream().filter(s -> s.startsWith("p")).collect(Collectors.toList());		
//		
//		Collections.sort(languages);
		
//		List<String> SortedList = 
//				languages.stream().sorted().collect(Collectors.toList());
//		System.out.println(SortedList);
////	
//		languages.stream().forEach(elem -> {
//			System.out.println(elem);
//			
//		});
		
//		for(int i = 0; i < languages.size(); i++)
//			System.out.println(languages.get(i));

		int sum = list.stream().reduce(0, (ans,i) -> ans+i);
		System.out.print(sum);
	}
	
}
