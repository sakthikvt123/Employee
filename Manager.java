package Employee;

public class Manager extends Employee{
       private String dept;

	public Manager(String name, int empId, String dept) {
		super(name, empId);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void diplsy() {
		System.out.println("Manager Details :");
		super.display();
	}
}
