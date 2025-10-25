import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {
	
	@Test(dataProvider="data")
	public void method(String username, String password) {
		System.out.println(username+" | "+password);
		
	}
	
	@DataProvider(name="data")
	public Object[][] data() {
		
		return new Object[][] {{"standard_user","secret_sauce"},
			                    {"locked_out_user","secret_sauce"},
			                    {"problem_user","secret_sauce"},
			                    {"performance_glitch_user","secret_sauce"}
		};
	}

}
