package com.java.maven;

import org.openqa.selenium.By;

public class adactinWebsite {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\GOPI V\\eclipse-workspace\\NewWorkspace\\maven\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/index.php");
		driver.findElement(By.id("username")).sendKeys("vengat16");
		driver.findElement(By.id("password")).sendKeys("Karthick");
		driver.findElement(By.id("login")).click();
		
		//driver.findElement(By.id("username")).sendKeys("vengat16");
		//driver.findElement(By.id("password")).sendKeys("Karthick");
		String s = driver.findElement(By.id("username")).getAttribute("value");
		String s1 = driver.findElement(By.id("password")).getAttribute("value");
		System.out.println(s);
		System.out.println(s1);
		
		
	driver.findElement(By.id("username")).sendKeys("vengat16");
	driver.findElement(By.id("password")).sendKeys("Karthick");
	String s = driver.getCurrentUrl();
	if (s.equals("http://www.adactin.com/HotelApp/index.php")) {
	System.out.println("u r in adactin website");
	} else {
	System.out.println("u r not in adactin website");
	}
	
	driver.findElement(By.id("username")).sendKeys("test");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.id("login")).click();
	boolean b = driver
	.findElement(
	By.xpath("//*[@id='login_form']/table/tbody/tr[5]/td[2]/div/b"))
	.isDisplayed();
	if (b = true) {
	System.out.println("invalid msg shown");
	} else {
	System.out.println("not");
	}}
	
	
	


}


