package Methods;

public class Employee {
	String name="Bob";
	char grade='A';
	
	public void info() {
		System.out.println("calling info method");
	}
	
	public void info1() {
		System.out.println("calling second method info");
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		System.out.println(emp.name);
		System.out.println(emp.grade);
		emp.info1();

	}

}
