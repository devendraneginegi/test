package Test_Cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_Object.application_page;
import Page_Object.signup_page;
import Page_Object.welcome_page;
import Testdata.signup_data;

public class jetsetter_signup_test {

	
	
	WebDriver driver;
	 
	 
	 @BeforeTest()
	 public void openbrowser()
	 {
		 System.setProperty("webdriver.chrome.driver", "/Users/administrator/Downloads/chromedriver");

		 driver = new ChromeDriver();
	 }
	
	@Test(dataProviderClass = signup_data.class, dataProvider = "signup")
	public void signup(String fname,String lname,String email,String password) throws InterruptedException
	{  	 
	  
	  driver.get("https://jetsetter:Jetsavvy!@demo.jetsavvy.com/home");	  
	  //Thread.sleep(2000);
	  
	  driver.manage().window().maximize();
	  
	  application_page.jetsetter(driver).click();
	  //Thread.sleep(4000);
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  welcome_page.signup(driver).click();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  signup_page.firstname(driver).sendKeys(fname);
	  
	  signup_page.lastname(driver).sendKeys(lname);
	  
	  signup_page.email(driver).sendKeys(email);
	  
	  signup_page.password(driver).sendKeys(password);
	  
	  signup_page.signup(driver).click();
	  
	  Thread.sleep(4000);
	  
	  
	  
	  
	  
	  
	}
}
