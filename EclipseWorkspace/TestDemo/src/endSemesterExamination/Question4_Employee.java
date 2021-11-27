package endSemesterExamination;
import java.util.*;

abstract public class basicEmployee{
	String name;
	String Job, Company;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return Job;
	}
	public void setJob(String job) {
		Job = job;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	int salary;
	abstract void Employeetype();
}


public class fullTime extends basicEmployee{
	float DA;
	int leaves;
	void Employeetype() {
		System.out.println("I'M a Full time Employee");
	}
	public float getDA() {
		return DA;
	}
	public void setDA(float dA) {
		DA = dA;
	}
	public int getLeaves() {
		return leaves;
	}
	public void setLeaves(int leaves) {
		this.leaves = leaves;
	}
}

public class partTime extends basicEmployee{

	int minimumWorkingHours;
	public int getMinimumWorkingHours() {
		return minimumWorkingHours;
	}
	public void setMinimumWorkingHours(int minimumWorkingHours) {
		this.minimumWorkingHours = minimumWorkingHours;
	}
	@Override
	void Employeetype() {
		System.out.println("I'm a partTime employee");
	}
	
}




