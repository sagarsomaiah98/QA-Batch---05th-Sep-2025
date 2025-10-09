package ListConcepts;

import java.util.LinkedList;
import java.util.List;

public class LinkeListConcept {

	public static void main(String[] args) {
	List<String> stud= new LinkedList<String>();
	stud.add("Peter");
	stud.add("Steve");
	stud.add("Bruce");
	stud.add("Bob");
	stud.add("John");
	
	System.out.println(stud.size());
	
	for(int i=0;i<stud.size();i++) {
		System.out.println(stud.get(i));
	}


	}

}
