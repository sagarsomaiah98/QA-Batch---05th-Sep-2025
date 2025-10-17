
public class LargestElementArray {

	public static void main(String[] args) {
		  int[] numbers = {25, 78, 12, 56, 89, 43};

	        int largest = numbers[0]; // assume first element is largest

	        // Compare each element
	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] > largest) {
	                largest = numbers[i];
	            }
	        }

	        System.out.println("The largest element in the array is: " + largest);
	    }
	}