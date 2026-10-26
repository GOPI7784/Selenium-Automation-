package selenium5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPI V\\eclipse-workspace\\NewWorkspace"
				+ "\\selenium5\\driver3\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/select.xhtml");
		
		driver.manage().window().maximize();
		
		WebElement tool = driver.findElement(By.xpath("//select[@class= 'ui-selectonemenu']"));
		
	     tool.click();
	     
	     Thread.sleep(5000);
	    
	    Actions ac = new Actions(driver);
	    
	    Select sc= new Select(tool);
	    sc.selectByVisibleText("Selenium");
	    
	 
	    
	   
	    
		
	}

}
