package testCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import testBase.TestBase;
import testUtil.Util;

public class HomeTest extends TestBase{
	@BeforeMethod
	public void init() throws IOException {
		intialization();
	}
	
	 @Test(priority=1)
	public void addtoCart() throws IOException {
		LoginPage login= new LoginPage();
		login.login("standard_user", "secret_sauce");
		HomePage home= new HomePage();
		home.addtocart();
		Util.Screenshot();
	}
	
	@Test(priority=2)
	public void removeFromCart() throws IOException {
		LoginPage login= new LoginPage();
		login.login("standard_user", "secret_sauce");
		HomePage home= new HomePage();
		try {
			home.removeFromCart();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Util.Screenshot();
		}
	}
	
	@Test(priority=3)
	public void filterSelection() throws InterruptedException {
		LoginPage login= new LoginPage();
		login.login("standard_user", "secret_sauce");
		HomePage home= new HomePage();
		home.filter("Name (Z to A)");
		
	}
	
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
