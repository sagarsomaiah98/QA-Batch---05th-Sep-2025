
public class CountNegativeNumbers {
	//count the total negative numbers


	public static void main(String[] args) {
		  int[] numbers = {10, -5, 0, -3, 8, -7, 2, -1};

	        int count = 0;

	        // Loop through array and count negatives
	        for (int num : numbers) {
	            if (num < 0) {
	                count++;
	            }
	        }

	        System.out.println("Total negative numbers: " + count);
	    }
	}
	}

}
