package test.package1;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
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

		Set<Integer> sqList = list.stream().map(x -> x*x/100).collect(Collectors.toSet());
		List<Integer> sqSet = list.stream().map(x -> x*x/100).collect(Collectors.toList());
		System.out.print(sqList);
		System.out.print(sqSet);
	}
}
