package returnType;

public class ReturnEx2 {
	
	public int add(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		
		ReturnEx2 r = new ReturnEx2();
		System.out.println(r.add(10, 30));
		int v= r.add(60, 70);
		System.out.println(v);

	}

}
