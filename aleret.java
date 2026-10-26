package selenium5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class aleret {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPI V\\eclipse-workspace\\NewWorkspace"
				+ "\\selenium5\\driver2\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		WebElement al = driver.findElement(By.xpath("(//span[text()='Show']) [1]"));
		
		al.click();
		
		driver.switchTo().alert().accept();
		
		
		WebElement clic = driver.findElement(By.xpath("(//span[text()='Show']) [5]"));
		
		clic.click();
		
		Alert al1 = driver.switchTo().alert();
		al1.sendKeys("welcome to alert page");
		al1.accept();
		
		
		WebElement dis = driver.findElement(By.xpath("(//span[text()='Show']) [3]"));
		
		dis.click();
		driver.findElement(By.xpath("(//span[text()='Dismiss']) ")).click();
		
		//driver.switchTo().alert().dismiss();
		
		
		
		

	}

}
