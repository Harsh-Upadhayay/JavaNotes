package comparable;

class Student implements Comparable<Student> {
	
	private int rollNumber;
	private String name;
	private String address;
	
	
	public Student(int rollNumber, String name, String address) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int compareTo(Student student) {
		return this.rollNumber - student.rollNumber;
	}
	
	
	
}
