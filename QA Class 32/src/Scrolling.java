import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.trustpilot.com/review/janbasktraining.com");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)"); 
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(1000,5000)"); 
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(5000,10000)"); 
		
		Thread.sleep(2000);
// bottom to top
		js.executeScript("window.scrollTo(10000,5000)"); 
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(5000,1000)"); 
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(1000,0)"); 
		Thread.sleep(2000);

	}

}
