package Variables;

public class LocalVariables {
	
	//any variables when defined inside the method its called local variables
	public void method1() {
		
		int age=30;
		String name="Lee";
		System.out.println(age);
		System.out.println(name);
	}

	public static void main(String[] args) {
		LocalVariables loc= new LocalVariables();
		loc.method1();

	}

}
