package operators;

public class MoreLogicOper {

	public static void main(String[] args) {
		 int x = 10;
	        int y = 5;
	        int z = 20;

	        // Complex expression
	        boolean result = (x + y > 15) && (z - y < 20) || (x * z > 100);

	        System.out.println("Result of complex expression: " + result);
	}

}
