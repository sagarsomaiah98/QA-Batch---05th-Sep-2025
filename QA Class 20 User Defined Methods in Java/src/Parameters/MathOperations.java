package Parameters;

public class MathOperations {
	
	public void addTwoNumbers(int a, int b) {
		int c=a+b;
		System.out.println("Addition of two numbers  "+a+" and "+b+" is ->"+c);
	}
	public void addThreeNumbers(int a, int b, int c) {
		int d=a+b;
		System.out.println("Addition of three numbers  "+a+" and "+b+"and"+c+" is ->"+d);
	}

	public void subTwoNumber(int a, int b) {
		int c=a-b;
		System.out.println("Subtraction of two numbers  "+a+" and "+b+" is ->"+c);
	}
	public void mulTwoNumber(int a, int b) {
		int c=a*b;
		System.out.println("Multiplication of two numbers  "+a+" and "+b+" is ->"+c);
	}
	public void divTwoNumber(int a, int b) {
		int c=a/b;
		System.out.println("Division of two numbers  "+a+" and "+b+" is ->"+c);
	}

}