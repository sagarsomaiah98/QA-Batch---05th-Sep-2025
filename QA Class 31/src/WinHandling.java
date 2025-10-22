import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.linkText("Privacy")).click();
		
		Set<String> wins=driver.getWindowHandles();
		System.out.println(wins.size());
	    Iterator<String> it = wins.iterator();
	    String parent=it.next();
	    String child=it.next();
	    System.out.println(parent);
        System.out.println(child);  
        driver.switchTo().window(child);
		
        Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@aria-label='See Privacy Statement: Privacy Information']")).click();
        Thread.sleep(1000);
		driver.quit();
		
	}

}
