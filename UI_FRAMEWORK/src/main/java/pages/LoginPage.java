package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testBase.TestBase;

public class LoginPage extends TestBase{
	
WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));


public void login(String uname, String pwd) {
username.sendKeys(uname);
password.sendKeys(pwd);
loginButton.click();
	
}

}
