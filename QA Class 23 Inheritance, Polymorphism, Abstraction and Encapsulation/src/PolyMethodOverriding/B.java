package PolyMethodOverriding;

public class B extends A {
	//Method Overriding requires two classes and should have a is a relationship
	//changing the implementation of parent in the child class
	
	public void factory() {
		System.out.println("factory belongs to child");
	}
	public void house() {
		System.out.println("changed house interiors by child");
	}
	public static void main(String[] args) {
		B b= new B();
		b.car();
		b.house();
		b.factory();
		
	
	}

}
