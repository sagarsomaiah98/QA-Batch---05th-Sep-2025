import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsEx {
	
	
	
	@Test	
	public void method1() {
		System.out.println("calling method1");
	}
	@BeforeMethod
    public void beforeMethod() {
    	System.out.println("***********before method**********");
    }
	
	@AfterMethod
    public void afterMethod() {
    	System.out.println("***********after method**********");
    }
	
	@BeforeMethod
	public void method2() {
		System.out.println("calling method 2");
	}
    
	@BeforeTest
	public void before() {
		System.out.println("calling before test");
	}
	
	@AfterTest
	public void after() {
		System.out.println("calling after test");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("calling before class");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("calling after class");
	}
	
	
	
}
