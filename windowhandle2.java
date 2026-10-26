package selenium5;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class windowhandle2 {

	public static void main(String[] args ) throws InterruptedException, AWTException{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPI V\\eclipse-workspace\\"
				+ "NewWorkspace\\selenium5\\driver3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		Actions ac = new Actions(driver);
		
	     Robot r = new Robot();
	//	Set<String> set = driver.getWindowHandles();
		//System.out.println("parentwindow");
		
		
		WebElement rightclick = driver.findElement(By.xpath("//a[text()=\"Amazon miniTV\"]"));
		
		Thread.sleep(2000);
		ac.contextClick(rightclick).build().perform();
		
   
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement right2 = driver.findElement(By.xpath("//a [text() ='Sell']"));
		
		ac.contextClick(right2).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> handles = driver.getWindowHandles();
		for (String gettitle : handles) {
			String windowtitle =  driver.switchTo().window(gettitle).getTitle();
			System.out.println(windowtitle);
			
			
			}
		
	 
	}
}

	
	
	
	
	
	
	
		
		
	