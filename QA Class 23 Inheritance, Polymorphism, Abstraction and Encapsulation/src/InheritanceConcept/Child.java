package InheritanceConcept;

public class Child extends Parent {
	
	public void factory() {
		System.out.println("factory belongs to child");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.factory();
		//belongs to parent
		c.house();
		c.car();
		System.out.println(c.grade);
		System.out.println(c.income);
		System.out.println(c.lname);

	}

}
