package A;

public class PrivateExample {
	private String name="John";
	private int age=30;
	private void method1() {
		System.out.println("calling method1");
	}
	private void method2() {
		System.out.println("calling method 2");
	}

	public static void main(String[] args) {
		PrivateExample p= new PrivateExample();
		p.method1();
		p.method2();
		System.out.println(p.name);
		System.out.println(p.age);

	}

}
