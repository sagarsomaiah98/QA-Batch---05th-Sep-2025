package returnType;

public class ReturnEx3 {
	
	public boolean method1() {
	
	int j=10;
	double k=90.23;
	boolean flag=true;
	char c='A';
	String name="Peter";
	
    return flag;
	
}
public static void main(String[] args) {
	ReturnEx3 r  = new ReturnEx3 ();
	boolean k= r.method1();
	System.out.println(k);
	

}

	
}
