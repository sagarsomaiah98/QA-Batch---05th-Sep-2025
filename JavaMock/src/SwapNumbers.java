
public class SwapNumbers {
	
	public void swap(int a, int b) {
		
		
		 int temp = a;
	        a = b;
	        b = temp;

	        System.out.println("After swapping: a = " + a + ", b = " + b);
	}

	public static void main(String[] args) {
		SwapNumbers sw = new SwapNumbers();
		sw.swap(10, 20);
		sw.swap(45, 65);
		sw.swap(32, 15);

	}

}
