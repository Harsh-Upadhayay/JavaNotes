package equalshashcode;

class Student {
	
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
	public boolean equals(Object obj) {  // Contract of equals method
		if (this == obj)
			return true;    // This is the definition of equals in Object class
	
		if (obj == null || obj.getClass() != this.getClass())  // another method of Object class to return Class type of object.
			return false;
		
		Student student = (Student) obj;  // casting Object class object obj to Student class object.
		
		return (student.rollNumber == this.rollNumber); // check equality based on roll number of students.
	}
	
	
}
