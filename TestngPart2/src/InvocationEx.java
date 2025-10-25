import org.testng.annotations.Test;

public class InvocationEx {
	
	@Test(invocationCount=10)
	public void method1() {
		System.out.println("calling method1");
	}

}
