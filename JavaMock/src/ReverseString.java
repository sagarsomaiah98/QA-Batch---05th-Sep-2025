
public class ReverseString {
	
	public static String reverse(String input) {
		 String str = input;

	        String reversed = "";

	        // Loop to reverse the string
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed = reversed + str.charAt(i);
	        }

	        // Display result
	        System.out.println("Reversed string: " + reversed);
		
		
		return reversed;
		
	}

	public static void main(String[] args) {
		System.out.println(reverse("Selenium"));

	}

}
