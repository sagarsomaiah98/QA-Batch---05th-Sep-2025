import java.util.Scanner;

public class Factorial {
	


	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        long factorial = 1; // Use long to handle large results

	        // Loop to calculate factorial
	        for (int i = 1; i <= num; i++) {
	            factorial = factorial * i;
	        }

	        // Display the result
	        System.out.println("Factorial of " + num + " is: " + factorial);
	        
	        sc.close();
	    }
	}
}
