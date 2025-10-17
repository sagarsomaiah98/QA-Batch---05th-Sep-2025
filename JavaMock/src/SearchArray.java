
public class SearchArray {
	
	public void search(int[] arr, int search) {
		
		
	}

	public static void main(String[] args) {
	    int[] numbers = {10, 20, 30, 40, 50};
        int searchElement = 30; // element to search
        boolean found = false;

        // Loop through array to find the element
        for (int num : numbers) {
            if (num == searchElement) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchElement + " is found in the array.");
        } else {
            System.out.println(searchElement + " is not found in the array.");
        }
    }
}

