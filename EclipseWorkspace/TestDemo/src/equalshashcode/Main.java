package equalshashcode;

class Main {
	public static void main(String[] args) {
		Student john = new Student(1, "John", "Address");
		Student john2 = new Student(1, "John", "Address");
		Student john3 = new Student(3, "John", "Address");
		
		System.out.println(john.equals(john2));
	}
}
