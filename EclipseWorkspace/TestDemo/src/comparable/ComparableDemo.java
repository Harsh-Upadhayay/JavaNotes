package comparable;

import java.util.*;

class ComparableDemo{
	public static void main(String[] args) {
		Student john = new Student(1, "Johnc", "Address");
		Student john2 = new Student(2, "Johnb", "Address");
		Student john3 = new Student(3, "Johna", "Address");
		
		List<Student> listOfStudents = new ArrayList<>();
		
		listOfStudents.add(john);
		listOfStudents.add(john3);
		listOfStudents.add(john2);
		
		System.out.println("Initial Order : ");
		for(Student student : listOfStudents)
			System.out.println(student.getName() +" "+ student.getRollNumber());
		
		System.out.println("\n\nSorted by rollNumber ");
	
		Collections.sort(listOfStudents);
		for(Student student : listOfStudents)
			System.out.println(student.getName() +" "+ student.getRollNumber());
		
		System.out.println("\n\nSorted By NameComparator");
	
		Collections.sort(listOfStudents, new NameComparatot());
		for(Student student : listOfStudents)
			System.out.println(student.getName() +" "+ student.getRollNumber());

		
	}
}


