import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
    WebElement dropdown=driver.findElement(By.xpath("//select[@name='dropdown']"));
   Select sel= new Select(dropdown);
   Thread.sleep(2000);
	/*
	 * sel.selectByIndex(3); Thread.sleep(2000); sel.selectByValue("ddperformance");
	 * Thread.sleep(2000); sel.selectByVisibleText("QTP");
	 */
   
   for(int i=1;i<=5;i++) {
	   sel.selectByIndex(i);
	   Thread.sleep(2000);
   }
   
      
	}

}
