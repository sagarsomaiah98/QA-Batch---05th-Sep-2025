package B;

import A.ProtectedExample;

public class TestRun extends ProtectedExample {

	public static void main(String[] args) {
		TestRun test= new TestRun();
		test.method1();
		test.method2();
		System.out.println(test.grade);
		System.out.println(test.name);
	}

}
