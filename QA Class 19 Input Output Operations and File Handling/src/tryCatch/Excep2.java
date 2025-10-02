package tryCatch;

public class Excep2 {

	public static void main(String[] args) {
		try
		  {	
			 int a = 30;
	         int b = 0;
	         int c = a/b;  
	         System.out.println ("Result = " + c);
		    }
		
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("cannot divide ");
			
		}      
	         int k=40;
	         int m=30;
	         int u=k+m;    
	         System.out.println("addition of "+k+" and "+m +" is "+u);
	         System.out.println("eND OF THE PROGRAM");
			

		}

	}


