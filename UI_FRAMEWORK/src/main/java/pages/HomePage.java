package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;
import testUtil.Util;

public class HomePage extends TestBase {
	
	
@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
public WebElement addToCart;

@FindBy(xpath="//a[@class='shopping_cart_link']")
public WebElement cart;

@FindBy(xpath="//button[@id='react-burger-menu-btn']")
public WebElement menu;
	
@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
public WebElement remove;

@FindBy(xpath="//select[@class='product_sort_container']")
public WebElement filter;

    public HomePage() {
    	PageFactory.initElements(driver, this);
    }
    
	public void addtocart() {
		addToCart.click();
		cart.click();
	}
   
	public void removeFromCart() throws InterruptedException {
		addToCart.click();
		Thread.sleep(2000);
		remove.click();
	}
	
	public void filter(String visibleText) {
		Util.dropDownSelection(filter, visibleText);
	}
	
}
