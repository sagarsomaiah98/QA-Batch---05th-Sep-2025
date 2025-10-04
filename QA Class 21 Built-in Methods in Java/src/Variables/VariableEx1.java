package Variables;

public class VariableEx1 {
	//first variable is looked inside the method if not found they look at class level
	String name="Dean";
	double salary=909.99;
	public void method1() 
	{
		String name="Bob";
		double salary=345.56;
		System.out.println(name);
		System.out.println(salary);
	}
	public void method2() {
		String name="Bruce";
		System.out.println(name);
		System.out.println(salary);
	}
	public void method3() {	
		System.out.println(name);
		System.out.println(salary);
	}
	public static void main(String[] args) {
		VariableEx1 var= new VariableEx1();
		var.method1();
		var.method2();
		var.method3();

	}

}
