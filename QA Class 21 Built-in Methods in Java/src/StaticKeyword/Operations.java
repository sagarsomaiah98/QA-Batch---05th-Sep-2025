package StaticKeyword;

public class Operations {
	
	//using static keyword you can call method directly without having to create an object
   //static method
	public static void add() {
		
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("addition of two numbers "+a+" and "+b+" is "+c);
	}
  //non static method
   public void sub() {
		
		int a=40;
		int b=30;
		int c=a-b;
		System.out.println("subtraction of two numbers "+a+" and "+b+" is "+c);
	}

	public static void main(String[] args) {
		Operations op = new Operations();
		add();
		op.sub();

	}

}
