package testCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import testBase.TestBase;
import testUtil.Util;

public class LoginTest extends TestBase {
	
	@BeforeMethod
	public void init() throws IOException {
		intialization();
	}
	
	@Test(priority=1)
	public void validLogin() throws IOException {
		
		LoginPage login= new LoginPage();
		login.login("standard_user", "secret_sauce");
		Util.Screenshot();
		
	}
	@Test(priority=2)
	public void inValidLogin() throws IOException {
		LoginPage login= new LoginPage();
		login.login("username", "secret_sauce");
		Util.Screenshot();
		
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
