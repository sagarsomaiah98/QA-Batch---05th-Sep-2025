package B;

import A.DefaultExample;
import A.PrivateExample;
import A.ProtectedExample;

public class Run {

	public static void main(String[] args) {
		PrivateExample p= new PrivateExample();
		/*
		 * p.method1(); p.method2(); System.out.println(p.name);
		 * System.out.println(p.age);
		 */
		
		/*
		 * DefaultExample d= new DefaultExample(); d.method1(); d.method2();
		 * System.out.println(d.name); System.out.println(d.grade);
		 */

		ProtectedExample prot= new ProtectedExample();
		prot.method1();
		prot.method2();
		System.out.println(prot.name);
		System.out.println(prot.grade);
		
	}

}
