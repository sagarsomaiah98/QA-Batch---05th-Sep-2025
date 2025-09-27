package operators;

public class ANDORoperator {

	public static void main(String[] args) {
		boolean f1=true;
		boolean f2=false;
		boolean f3=false;
		
		System.out.println(f1&(f2 &f3));
		System.out.println(f1& f2&f3);
		System.out.println((f2&f3)&f1);
		

	}

}
