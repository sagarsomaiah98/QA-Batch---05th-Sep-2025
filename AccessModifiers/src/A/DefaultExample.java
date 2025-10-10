package A;

 class DefaultExample {
	String name="Bruce";
	char grade='A';
	
	void method1() {
		System.out.println("calling method1");
	}
	void method2() {
		System.out.println("calling method 2");
	}

	public static void main(String[] args) {
	
		DefaultExample d= new DefaultExample();
		d.method1();
		d.method2();
		System.out.println(d.name);
		System.out.println(d.grade);

	}

}
