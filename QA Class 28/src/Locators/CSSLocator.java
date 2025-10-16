package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSLocator {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
	   driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
	   driver.findElement(By.cssSelector("#login-button")).click();

	}

}
