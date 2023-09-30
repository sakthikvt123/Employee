package Employee;

public class Main extends Employee {

	public Main(String name, int empId) {
		super(name, empId);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Manager manager = new Manager("Gopalakrishnan", 1003,"B.Tech");
              manager.diplsy();
              
       Technician technician = new  Technician("GK", 1004, "Java");
              technician.display();
	}

}
