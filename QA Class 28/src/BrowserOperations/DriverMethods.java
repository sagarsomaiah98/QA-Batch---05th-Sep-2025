package BrowserOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {

	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.selenium.dev/");
		String title=d.getTitle();
		String page=d.getPageSource();
		System.out.println(title);
		System.out.println(page);
		d.quit();

	}

}
