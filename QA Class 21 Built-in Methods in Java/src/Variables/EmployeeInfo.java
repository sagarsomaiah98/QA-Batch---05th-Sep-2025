package Variables;

public class EmployeeInfo {
	char grade='B';
	String dept="Admin";
	double salary=789.23;
	
	public void info() {
		char grade='C';
		System.out.println(dept);
		System.out.println(grade);
		System.out.println(salary);	
	}
	public void disp() {
		String dept="Finance";
		System.out.println(dept);
		System.out.println(grade);
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		EmployeeInfo emp= new EmployeeInfo();
		emp.info();
		System.out.println("************");
		emp.disp();

	}

}
