import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		WebElement Button=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.doubleClick(Button).build().perform();


	}

}
