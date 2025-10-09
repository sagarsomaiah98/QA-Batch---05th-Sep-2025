package ListConcepts;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {
	List<String> stud= new ArrayList<>();
	stud.add("Peter");
	stud.add("Steve");
	stud.add("Bruce");
	stud.add("Bob");
	stud.add("John");
	stud.add(0, "Lee");

	System.out.println(stud.size());
	   stud.remove(2);
	   System.out.println(stud.size());
	
	for(int i=0;i<stud.size();i++) {
		System.out.println(stud.get(i));
	}
	System.out.println("********************");
    System.out.println(stud.contains("Jas"));
 
	 
	}

}
