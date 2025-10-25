package SauceTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest {
	@Test
  public void login() throws InterruptedException {
	  WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		try {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce1"); 
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    driver.findElement(By.xpath("//span[@class='title']"));
	    System.out.println("Login Successful");
		}
		catch(Exception e) {
			String error=driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]")).getText();
			System.out.println(error);
			System.out.println("Login Failed");
			
		}
	     Thread.sleep(2000);
	    String title= driver.getTitle();
	    System.out.println(title);
	     driver.quit();
	
	}
  
	
}
