package returnType;

public class ReturnEx1 {
	
	public double method1() {
		String name="Lee";
		int age =20;
		double height=5.9;
		 return height;
		
	}

	public static void main(String[] args) {
		ReturnEx1 r = new ReturnEx1();
		double output=r.method1();
		System.out.println(output);
		
		

	}

}
