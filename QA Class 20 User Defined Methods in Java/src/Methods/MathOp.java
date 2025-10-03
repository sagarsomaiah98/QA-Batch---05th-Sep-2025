package Methods;

public class MathOp {
	
	public void add()
	{
	//adddition
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println("Addition of two numbers  "+a+" and "+b+" is ->"+c);
	}
	
	       public void  sub()
	           {
		//subtraction
				int m=30;
				int n=20;
				int p=m-n;
				System.out.println("Subtraction of two numbers  "+m+" and "+n+" is ->"+p);

	}
	       public void div() {
	    	   int m=30;
				int n=20;
				int p=m/n;
				System.out.println("Division of two numbers  "+m+" and "+n+" is ->"+p);
	       }

	public static void main(String[] args) {
		
      //if we need to access anything outside the main we need to create object
	 //classname objectname= new classname()	
		
		MathOp mat= new MathOp();
		mat.add();
		mat.add();
		mat.add();
		
		
		
	}

}
