import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogOutTest {
	public void logout() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));//maximum timeout
		driver.get("https://www.saucedemo.com");

		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce"); 
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
	   driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
	  
	   driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();

	}

	public static void main(String[] args) throws InterruptedException {
		LogOutTest lo = new LogOutTest();
		lo.logout();
	}

}
