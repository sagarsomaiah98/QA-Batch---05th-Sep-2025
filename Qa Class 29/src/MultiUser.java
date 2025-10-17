import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiUser {
	
	public void login(String user, String pwd) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		try {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(user);
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd); 
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    driver.findElement(By.xpath("//span[@class='title']"));
	    System.out.println(user+" -> Login Successful");
		}
		catch(Exception e) {
		
			System.out.println(user+ "->Login Failed");
			
		}
	     //Thread.sleep(2000);
	    String title= driver.getTitle();
	    //System.out.println(title);
	     driver.quit();
	
	}

	
	public static void main(String[] args) throws InterruptedException {
		MultiUser m = new MultiUser();
		m.login("standard_user", "secret_sauce");
		m.login("locked_out_user", "secret_sauce");
		m.login("problem_user", "secret_sauce");
		m.login("performance_glitch_user", "secret_sauce");
		m.login("error_user", "secret_sauce");
		m.login("visual_user", "secret_sauce");
		
	}

}
