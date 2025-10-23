import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement table=driver.findElement(By.xpath("//table[@id='table1']"));
        List<WebElement> rows=table.findElements(By.tagName("tr")); 
        System.out.println("total rows-->"+rows.size());
        
        List<WebElement> row0=rows.get(0).findElements(By.tagName("th"));
        System.out.println("total columns in the first row-> "+row0.size());
        System.out.print(row0.get(0).getText()+" | ");
        System.out.print(row0.get(1).getText()+" | ");
        System.out.println(row0.get(2).getText()+" | ");
        System.out.println("***********************************");
        
        List<WebElement> row1=rows.get(1).findElements(By.tagName("td"));
        System.out.println("total columns in the second row-> "+row1.size());
        System.out.print(row1.get(0).getText()+" | ");
        System.out.print(row1.get(1).getText()+" | ");
        System.out.println(row1.get(2).getText()+" | ");
        System.out.println("***********************************");
        
        List<WebElement> row2=rows.get(2).findElements(By.tagName("td"));
        System.out.println("total columns in the third row-> "+row2.size());
        System.out.print(row2.get(0).getText()+" | ");
        System.out.print(row2.get(1).getText()+" | ");
        System.out.println(row2.get(2).getText()+" | ");
        System.out.println("***********************************");
        
        
        List<WebElement> row3=rows.get(3).findElements(By.tagName("td"));
        System.out.println("total columns in the third row-> "+row3.size());
        System.out.print(row3.get(0).getText()+" | ");
        System.out.print(row3.get(1).getText()+" | ");
        System.out.println(row3.get(2).getText()+" | ");
        System.out.println("***********************************");
        
        List<WebElement> row4=rows.get(4).findElements(By.tagName("td"));
        System.out.println("total columns in the third row-> "+row4.size());
        System.out.print(row4.get(0).getText()+" | ");
        System.out.print(row4.get(1).getText()+" | ");
        System.out.println(row4.get(2).getText()+" | ");
        System.out.println("***********************************");
        
        
       
        driver.quit();
	}

}
