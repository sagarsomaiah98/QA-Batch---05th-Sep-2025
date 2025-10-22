import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormFilling {
	
	public static int ID() {
		int value=(int) (Math.random()*10000);
	       System.out.println(value);
	       return value;
	}

	public static void main(String[] args) {
		String userID="John"+ID();
		System.out.println(userID);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Doe");
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("24 bakers street");
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("NSW");
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("Newyork");
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("2156");
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("456789013");
		driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("1234455678");
		driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(userID);
		driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@value='Register']")).click();

	}

}
