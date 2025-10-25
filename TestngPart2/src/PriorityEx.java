import org.testng.annotations.Test;

public class PriorityEx {
	@Test(priority=1)
	public void login() {
		System.out.println("login");
	}
	@Test(priority=5)
	public void logout() {
		System.out.println("loginout");
	}
	@Test(priority=1)
	public void addtocart() {
		System.out.println("addtocart");
	}
	@Test(priority=3)
	public void order() {
		System.out.println("order");
	}
	@Test(priority=-4)
	public void filter() {
		System.out.println("filter");
	}

}
