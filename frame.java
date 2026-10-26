package selenium5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class frame {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPI V\\eclipse-workspace\\NewWorkspace"
				+ "\\selenium5\\driver2\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		WebElement iframe  = driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
		
		driver.switchTo().frame(iframe);
		WebElement element = driver.findElement(By.xpath("(//input[@type = 'text'])[1]"));
		
		Thread.sleep(2000);
		element.sendKeys("welcome to page");
		
	      driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		
		
		
	}

}
