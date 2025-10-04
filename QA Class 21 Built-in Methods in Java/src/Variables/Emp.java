package Variables;
public class Emp {
	String role="manager";//global variables
	double salary=521.36;//global variables
	public void emp_info() {		
		int age=30; //local variable
		String name="john";//local variable		
		System.out.println(age);
		System.out.println(name);
		System.out.println(role);}
	public void display()
	{
		System.out.println(role);
		System.out.println(salary);	}
	public void emp_medi() {
		String name="Henry";
		int medi_no=2341;//local variable
		String plan="Basic"; //local variable
	System.out.println(name);
	System.out.println(medi_no);
	System.out.println(plan);
	System.out.println(role);
	}
	public static void main(String[] args) {
		Emp e= new Emp();
		System.out.println(e.role);
		System.out.println(e.salary);
		e.display();
		e.emp_info();
		e.emp_medi();

	}

}
