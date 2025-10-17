
public class EvenOddCount {
	
	

	public static void main(String[] args) {
		 int[] numbers = {10, 15, 22, 33, 40, 55, 60};

	        int evenCount = 0;
	        int oddCount = 0;

	        // Loop through array and count even/odd
	        for (int num : numbers) {
	            if (num % 2 == 0) {
	                evenCount++;
	            } else {
	                oddCount++;
	            }
	        }

	        System.out.println("Total even numbers: " + evenCount);
	        System.out.println("Total odd numbers: " + oddCount);
	    }
	
	}

}
