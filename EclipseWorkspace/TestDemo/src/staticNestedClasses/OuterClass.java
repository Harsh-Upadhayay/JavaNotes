package staticNestedClasses;

public class OuterClass {
	
	static int outerStaticMember = 10;
	int instanceMember = 20;
	private static int outerPirvateMember = 30;
	
	static class StaticNestedClass {
		void display() {
			System.out.println("Static member of outer clas = " + outerStaticMember);
			System.out.println("Private static member of outer class = " + outerPirvateMember);
		}
	}
}
