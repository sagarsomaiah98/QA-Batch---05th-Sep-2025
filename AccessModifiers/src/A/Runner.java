package A;

public class Runner {

	public static void main(String[] args) {
	PrivateExample p = new PrivateExample();
	/*
	 * p.method1(); p.method2(); System.out.println(p.age);
	 * System.out.println(p.name);
	 */
	/*
	 * DefaultExample def= new DefaultExample(); def.method1(); def.method2();
	 * System.out.println(def.name); System.out.println(def.grade);
	 */
	
	ProtectedExample prot= new ProtectedExample();
	prot.method1();
	prot.method2();
	System.out.println(prot.name);
	System.out.println(prot.grade);
	}

}
