package Methods;

public class Student {
	
	//function/method
	public void info() {
		int age=10;
		String name="Kevin";
		System.out.println("name : "+name);
		System.out.println("age : "+age);
	}

	public static void main(String[] args) {
		Student stud=new Student();
		stud.info();
 
	}

}
