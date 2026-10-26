package selenium5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class webtable {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOPI V\\eclipse-workspace\\"
				+ "NewWorkspace\\selenium5\\driver3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		 List<WebElement> webtable  = driver.findElements(By.xpath("//table/tbody/tr/td "));
		 
		 
		 for (WebElement webElement : webtable) {
			
			 System.out.println(webElement.getText());

	}

	}
}
