package MapConcept;

import java.util.HashMap;
import java.util.Map;

public class MapConcept {

	public static void main(String[] args) {
		Map<String, Integer> studMarks= new HashMap<>();
		studMarks.put("steve", 90);
		studMarks.put("peter", 80);
		studMarks.put("jack", 65);
		studMarks.put("bob", 55);
		System.out.println(studMarks.get("bob"));
		System.out.println(studMarks.containsValue(95));
		System.out.println(studMarks.containsKey("kevin"));
		System.out.println(studMarks);

	}

}
