import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AssertionEx {
	
	@Test
	public void compare() {
		String name="John";
 //  assertEquals(name, "peter");
   
   int j=20;
   assertEquals(j,30,"numbers do not match");
		
	}

}
