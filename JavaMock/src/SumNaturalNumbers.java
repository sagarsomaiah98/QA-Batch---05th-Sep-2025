
public class SumNaturalNumbers {
	
	

	public static void main(String[] args) {

		  int n = 10; // sum of first 10 natural numbers
	        int sum = 0;

	        for (int i = 1; i <= n; i++) {
	            sum += i;
	        }

	        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
	    }
	}