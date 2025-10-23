import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testing.qaautomationlabs.com/list-box.php");
		List<WebElement> items=driver.findElements(By.xpath("//select[@id='list1']/option"));
        System.out.println(items.size());
        for(int i=0;i<3;i++) {
        	items.get(i).click();
        }
        driver.findElement(By.xpath("//button[@id='add']")).click();
        List<WebElement> selectedItems=driver.findElements(By.xpath("//select[@id='list2']/option"));
        System.out.println("items added"+selectedItems.size());
        for(int i=0;i<selectedItems.size();i++) {
        	System.out.println(selectedItems.get(i).getText());
        }
        
	}

}
