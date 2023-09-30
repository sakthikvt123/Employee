package Employee;

public class Technician extends Employee {
  private String Specialization;

public Technician(String name, int empId, String specialization) {
	super(name, empId);
	Specialization = specialization;
}

public String getSpecialization() {
	return Specialization;
}

public void setSpecialization(String specialization) {
	Specialization = specialization;
}
  
  public void display() {
	  System.out.println("Technician Details :");
	  super.display();
  }
}
