
public class Cons3 {
	//Constructor overloading
	public Cons3() {
		System.out.println("Default Constructor");
	}
	
	public Cons3(String name, int age) {
		System.out.println("name : "+name);
		System.out.println("age: "+age);
		
	}
	public Cons3(String name) {
		System.out.println("name : "+name);
		
		
	}
	

	public static void main(String[] args) {
		Cons3 c = new Cons3();
		Cons3 c1= new Cons3("kevin", 20);
		Cons3 c2= new Cons3("Lee");
	
	}

}
