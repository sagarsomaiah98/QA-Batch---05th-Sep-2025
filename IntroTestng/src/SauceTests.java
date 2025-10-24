import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SauceTests {
	@Test
	public void validlogin() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce"); 
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    driver.quit();
	}
		
	@Test
public void invalidlogin() {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com");
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce1"); 
    driver.findElement(By.xpath("//input[@id='login-button']")).click();
    driver.quit();
}
	}


