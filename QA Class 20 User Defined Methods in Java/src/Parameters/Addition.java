package Parameters;

public class Addition {
	
	//method with two arguments
	public void add(int a, int b) {
		//adddition

		int c=a+b;
		System.out.println("Addition of two numbers  "+a+" and "+b+" is ->"+c);
	}

	public static void main(String[] args) {
		Addition a= new Addition();
		a.add(20,10);
		a.add(90, 10);
		a.add(60, 30);
		a.add(45, 35);

	}

}
