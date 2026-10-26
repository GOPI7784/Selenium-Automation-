package Project;

public class testNg {
	package com.Runner_TestNG;
	import java.awt.AWTException;
	import java.awt.event.KeyEvent;
	import java.util.Scanner;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	import com.Base1_TestNG.Base_TestNG;
	import com.POM_TestNG.POM_TestNG;
	public class Runner_TestNG extends Base_TestNG{
	public static WebDriver driver;
	public static POM_TestNG t;
	@BeforeMethod
	public void login() throws InterruptedException {
	driver =BrowserLaunch("chrome");
	urlLaunch("http://www.nykaa.com/");
	driver.manage().window().maximize();
	t=new POM_TestNG(driver);
	click_on_Element(t.getSignin_with_email_button());
	Thread.sleep(3000);
	input_On_Elements(t.getEnter_mail_textbox(), "6385142375");
	click_on_Element(t.getSubmit_MailID_Button());
	Scanner scanString = new Scanner(System.in);
	System.out.println("Enter the otp:");
	String otp=scanString.nextLine();
	input_On_Elements(t.getEnter_otp_textbox(), otp);
	click_on_Element(t.getOtp_verify_button());
	System.out.println("log in successfull");
	}
	@Test
	public void search_Bag() throws InterruptedException, AWTException {
	Thread.sleep(3000);
	input_On_Elements(t.getSearch_box(), "laptop bag");
	roboKeyPressRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	// actionsmovecursoronelement(t.getLaptop_bag_image());
	click_on_Element(t.getLaptop_bag_image());
	childWindowhandle();
	System.out.println("successfully moved to child window");
	click_on_Element(t.getAdd_to_bag_button());
	System.out.println("Laptop bag added to cart successfully");
	click_on_Element(t.getShow_add_to_bag_button());
	Thread.sleep(3000);
	// switchToFrame(t.getiframe());
	switchToFrame(0);
	Thread.sleep(3000);
	System.out.println("Switched to iframe");
	click_on_Element(t.getProceed_to_buy_button());
	click_on_Element(t.getDeliver_here_button());
	System.out.println("default address selected");
	webDriverWait(2000);
	click_on_Element(t.getCash_on_delivery_button());
	System.out.println("cash on delivery mode selected");
	click_on_Element(t.getPlace_order_button());
	System.out.println("Order Placed Successfully");
	}
	}
	@AfterMethod
	public void browserClose() {
	driver.close();
	System.out.println("AfterMethod Executed");
	}


}
