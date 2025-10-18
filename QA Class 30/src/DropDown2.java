import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement dropdown=driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		Select sel= new Select(dropdown);
		List<WebElement> country=sel.getOptions();
		System.out.println(country.size());
		for(int i=0;i<country.size();i++) {
			System.out.println(i+" - "+country.get(i).getText());
		}
		driver.quit();
		
		

	}

}
