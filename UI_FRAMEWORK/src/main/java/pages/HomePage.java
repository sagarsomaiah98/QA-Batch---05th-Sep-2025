package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testBase.TestBase;

public class HomePage extends TestBase {
	WebElement addToCart=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
	WebElement cart=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	WebElement menu=driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));


}
