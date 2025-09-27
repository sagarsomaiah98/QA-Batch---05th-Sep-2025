package operators;

public class LogicOp {

	public static void main(String[] args) {
		 boolean a = true;
	        boolean b = false;
	        boolean c = true;

	        // Combining multiple logical conditions
	        boolean result1 = a && b || c;
	        boolean result2 = (a && b) || c;
	        boolean result3 = a && (b || c);

	        System.out.println("Result of a && b || c: " + result1);
	        System.out.println("Result of (a && b) || c: " + result2);
	        System.out.println("Result of a && (b || c: " + result3);

	}

}
