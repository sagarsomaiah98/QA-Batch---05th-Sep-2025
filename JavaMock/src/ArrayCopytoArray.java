import java.util.Arrays;

public class ArrayCopytoArray {
	//copy from one array arr to another empty array output and print it
	
	

	

	public static void main(String[] args) {
		  // Original array
        int[] original = {10, 20, 30, 40, 50};

        // Create a new array with same length
        int[] copy = new int[original.length];

        // Copy elements one by one
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        // Display copied array
        System.out.println("Elements of copied array:");
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
    }
}
		

	}

}
