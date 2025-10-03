package tryCatch;

public class finally_ex {

	public static void main(String[] args) {
	
		try {
			int a=10;
			int b=a/0;
			
		}
		catch(Exception e) {
			System.out.println("cannot divide a/b");
		}
 
		//execute either try or catch block executes
		finally {
			System.out.println("executing the program");
		}
		System.out.println("end of the program");
	}

}
