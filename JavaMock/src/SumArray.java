
public class SumArray {
	

	public static void main(String[] args) {
		
		  int[] numbers = {5, 10, 15, 20, 25};

	        int sum = 0;

	        // Loop through array and add elements
	        for (int num : numbers) {
	            sum += num;
	        }

	        System.out.println("The sum of all elements in the array is: " + sum);
	    }
	}
