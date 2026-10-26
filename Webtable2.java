package selenium5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable2 {
	
	
	
	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPI V\\eclipse-workspace\\"
				+ "NewWorkspace\\selenium5\\driver2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
			
			System.out.println(element.getText());
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
