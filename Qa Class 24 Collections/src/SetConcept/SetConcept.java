package SetConcept;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

  

public class SetConcept {

	public static void main(String[] args) {
		//set doesnt store duplicate values
	Set<String> colors= new HashSet<>();
	colors.add("white");
	colors.add("black");
	colors.add("green");
	colors.add("blue");
	colors.add("red");
	colors.add("white");
	colors.add("black");
	System.out.println(colors.size());
	//System.out.println(colors.get(2));
    
  Iterator<String> it=colors.iterator();
	/*
	 * System.out.println(it.next()); System.out.println(it.hasNext());
	 * System.out.println(it.next()); System.out.println(it.hasNext());
	 * System.out.println(it.next()); System.out.println(it.hasNext());
	 * System.out.println(it.next()); System.out.println(it.hasNext());
	 * System.out.println(it.next()); System.out.println(it.hasNext());
	 */

  for(int i=0;i<colors.size();i++) {
	  //System.out.println(it.next());
  }
  
  while(it.hasNext()) {
	  System.out.println(it.next());
  }

	}

}
