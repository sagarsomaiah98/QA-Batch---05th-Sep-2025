package StaticKeyword;

public class Student {
	//static variables
	static char grade='A';
	static String name="charles";
	static int age=10;

	public static void add() {
		
		System.out.println("calling add method in student class");
	}
	public static void main(String[] args) {
		
	
		System.out.println(grade);
		System.out.println(name);
		System.out.println(age);
		add();

	}

}
